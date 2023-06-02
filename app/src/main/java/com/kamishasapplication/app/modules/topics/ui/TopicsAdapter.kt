package com.kamishasapplication.app.modules.topics.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamishasapplication.app.R
import com.kamishasapplication.app.databinding.RowTopicsBinding
import com.kamishasapplication.app.modules.topics.`data`.model.TopicsRowModel
import kotlin.Int
import kotlin.collections.List

class TopicsAdapter(
  var list: List<TopicsRowModel>
) : RecyclerView.Adapter<TopicsAdapter.RowTopicsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTopicsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_topics,parent,false)
    return RowTopicsVH(view)
  }

  override fun onBindViewHolder(holder: RowTopicsVH, position: Int) {
    val topicsRowModel = TopicsRowModel()
    // TODO uncomment following line after integration with data source
    // val topicsRowModel = list[position]
    holder.binding.topicsRowModel = topicsRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TopicsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: TopicsRowModel
    ) {
    }
  }

  inner class RowTopicsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTopicsBinding = RowTopicsBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, TopicsRowModel())
      }
    }
  }
}
