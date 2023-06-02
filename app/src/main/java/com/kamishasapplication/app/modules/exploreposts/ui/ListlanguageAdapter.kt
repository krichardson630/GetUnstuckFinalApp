package com.kamishasapplication.app.modules.exploreposts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamishasapplication.app.R
import com.kamishasapplication.app.databinding.RowListlanguage1Binding
import com.kamishasapplication.app.modules.exploreposts.`data`.model.Listlanguage1RowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageAdapter(
  var list: List<Listlanguage1RowModel>
) : RecyclerView.Adapter<ListlanguageAdapter.RowListlanguage1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage1,parent,false)
    return RowListlanguage1VH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguage1VH, position: Int) {
    val listlanguage1RowModel = Listlanguage1RowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguage1RowModel = list[position]
    holder.binding.listlanguage1RowModel = listlanguage1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listlanguage1RowModel>) {
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
      item: Listlanguage1RowModel
    ) {
    }
  }

  inner class RowListlanguage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguage1Binding = RowListlanguage1Binding.bind(itemView)
  }
}
