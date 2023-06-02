package com.kamishasapplication.app.modules.people.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kamishasapplication.app.R
import com.kamishasapplication.app.databinding.RowPeopleBinding
import com.kamishasapplication.app.modules.people.`data`.model.PeopleRowModel
import kotlin.Int
import kotlin.collections.List

class PeopleAdapter(
  var list: List<PeopleRowModel>
) : RecyclerView.Adapter<PeopleAdapter.RowPeopleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPeopleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_people,parent,false)
    return RowPeopleVH(view)
  }

  override fun onBindViewHolder(holder: RowPeopleVH, position: Int) {
    val peopleRowModel = PeopleRowModel()
    // TODO uncomment following line after integration with data source
    // val peopleRowModel = list[position]
    holder.binding.peopleRowModel = peopleRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PeopleRowModel>) {
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
      item: PeopleRowModel
    ) {
    }
  }

  inner class RowPeopleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPeopleBinding = RowPeopleBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PeopleRowModel())
      }
    }
  }
}
