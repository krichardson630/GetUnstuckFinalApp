package com.kamishasapplication.app.modules.topics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityTopicsBinding
import com.kamishasapplication.app.modules.customsearch.ui.CustomSearchActivity
import com.kamishasapplication.app.modules.notificationsmainfromintereststopics.ui.NotificationsMainFromInterestsTopicsActivity
import com.kamishasapplication.app.modules.people.ui.PeopleActivity
import com.kamishasapplication.app.modules.topics.`data`.model.TopicsRowModel
import com.kamishasapplication.app.modules.topics.`data`.viewmodel.TopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopicsActivity : BaseActivity<ActivityTopicsBinding>(R.layout.activity_topics) {
  private val viewModel: TopicsVM by viewModels<TopicsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val topicsAdapter = TopicsAdapter(viewModel.topicsList.value?:mutableListOf())
    binding.recyclerTopics.adapter = topicsAdapter
    topicsAdapter.setOnItemClickListener(
    object : TopicsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TopicsRowModel) {
        onClickRecyclerTopics(view, position, item)
      }
    }
    )
    viewModel.topicsList.observe(this) {
      topicsAdapter.updateData(it)
    }
    binding.topicsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtPeople.setOnClickListener {
      val destIntent = PeopleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearch.setOnClickListener {
      val destIntent = CustomSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsMainFromInterestsTopicsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerTopics(
    view: View,
    position: Int,
    item: TopicsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TOPICS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopicsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
