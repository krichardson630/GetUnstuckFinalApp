package com.kamishasapplication.app.modules.exploreposts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityExplorePostsBinding
import com.kamishasapplication.app.modules.exploreposts.`data`.model.Listlanguage1RowModel
import com.kamishasapplication.app.modules.exploreposts.`data`.model.ListlanguageTwo1RowModel
import com.kamishasapplication.app.modules.exploreposts.`data`.viewmodel.ExplorePostsVM
import com.kamishasapplication.app.modules.notificationsmainfromexploreposts.ui.NotificationsMainFromExplorePostsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExplorePostsActivity :
    BaseActivity<ActivityExplorePostsBinding>(R.layout.activity_explore_posts) {
  private val viewModel: ExplorePostsVM by viewModels<ExplorePostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlanguageAdapter =
    ListlanguageAdapter(viewModel.listlanguageList.value?:mutableListOf())
    binding.recyclerListlanguage.adapter = listlanguageAdapter
    listlanguageAdapter.setOnItemClickListener(
    object : ListlanguageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listlanguage1RowModel) {
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
      override fun onItemClick(view:View, position:Int, item : ListlanguageTwo1RowModel) {
        onClickRecyclerListlanguageTwo(view, position, item)
      }
    }
    )
    viewModel.listlanguageTwoList.observe(this) {
      listlanguageTwoAdapter.updateData(it)
    }
    binding.explorePostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNotification.setOnClickListener {
      val destIntent = NotificationsMainFromExplorePostsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListlanguage(
    view: View,
    position: Int,
    item: Listlanguage1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlanguageTwo(
    view: View,
    position: Int,
    item: ListlanguageTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_POSTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExplorePostsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
