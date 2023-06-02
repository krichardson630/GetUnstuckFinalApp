package com.kamishasapplication.app.modules.publishedposts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityPublishedPostsBinding
import com.kamishasapplication.app.modules.notificationsmainfrompublishedposts.ui.NotificationsMainFromPublishedPostsActivity
import com.kamishasapplication.app.modules.publishedposts.`data`.model.ListlanguageRowModel
import com.kamishasapplication.app.modules.publishedposts.`data`.model.ListlanguageTwoRowModel
import com.kamishasapplication.app.modules.publishedposts.`data`.viewmodel.PublishedPostsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PublishedPostsActivity :
    BaseActivity<ActivityPublishedPostsBinding>(R.layout.activity_published_posts) {
  private val viewModel: PublishedPostsVM by viewModels<PublishedPostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageAdapter =
    ListlanguageAdapter(viewModel.listlanguageList.value?:mutableListOf())
    binding.recyclerListlanguage.adapter = listlanguageAdapter
    listlanguageAdapter.setOnItemClickListener(
    object : ListlanguageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageRowModel) {
        onClickRecyclerListlanguage(view, position, item)
      }
    }
    )
    viewModel.listlanguageList.observe(this) {
      listlanguageAdapter.updateData(it)
    }
    val listlanguageTwoAdapter =
    ListlanguageTwoAdapter(viewModel.listlanguageTwoList.value?:mutableListOf())
    binding.recyclerListlanguageTwo.adapter = listlanguageTwoAdapter
    listlanguageTwoAdapter.setOnItemClickListener(
    object : ListlanguageTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlanguageTwoRowModel) {
        onClickRecyclerListlanguageTwo(view, position, item)
      }
    }
    )
    viewModel.listlanguageTwoList.observe(this) {
      listlanguageTwoAdapter.updateData(it)
    }
    binding.publishedPostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsMainFromPublishedPostsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguage(
    view: View,
    position: Int,
    item: ListlanguageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlanguageTwo(
    view: View,
    position: Int,
    item: ListlanguageTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PUBLISHED_POSTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PublishedPostsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
