package com.kamishasapplication.app.modules.publishedposts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamishasapplication.app.R
import com.kamishasapplication.app.databinding.RowListlanguageTwoBinding
import com.kamishasapplication.app.modules.publishedposts.`data`.model.ListlanguageTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageTwoAdapter(
  var list: List<ListlanguageTwoRowModel>
) : RecyclerView.Adapter<ListlanguageTwoAdapter.RowListlanguageTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_two,parent,false)
    return RowListlanguageTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageTwoVH, position: Int) {
    val listlanguageTwoRowModel = ListlanguageTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageTwoRowModel = list[position]
    holder.binding.listlanguageTwoRowModel = listlanguageTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageTwoRowModel>) {
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
      item: ListlanguageTwoRowModel
    ) {
    }
  }

  inner class RowListlanguageTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageTwoBinding = RowListlanguageTwoBinding.bind(itemView)
  }
}
