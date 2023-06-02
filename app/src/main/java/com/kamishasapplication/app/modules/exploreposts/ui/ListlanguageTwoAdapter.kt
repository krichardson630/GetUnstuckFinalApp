package com.kamishasapplication.app.modules.exploreposts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamishasapplication.app.R
import com.kamishasapplication.app.databinding.RowListlanguageTwo1Binding
import com.kamishasapplication.app.modules.exploreposts.`data`.model.ListlanguageTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageTwoAdapter(
  var list: List<ListlanguageTwo1RowModel>
) : RecyclerView.Adapter<ListlanguageTwoAdapter.RowListlanguageTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageTwo1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage_two1,parent,false)
    return RowListlanguageTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageTwo1VH, position: Int) {
    val listlanguageTwo1RowModel = ListlanguageTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageTwo1RowModel = list[position]
    holder.binding.listlanguageTwo1RowModel = listlanguageTwo1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageTwo1RowModel>) {
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
      item: ListlanguageTwo1RowModel
    ) {
    }
  }

  inner class RowListlanguageTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageTwo1Binding = RowListlanguageTwo1Binding.bind(itemView)
  }
}
