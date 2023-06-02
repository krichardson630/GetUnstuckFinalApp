package com.kamishasapplication.app.modules.notificationsmainfromintereststopics.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainFromInterestsTopicsBinding
import com.kamishasapplication.app.modules.notificationsmainfromintereststopics.`data`.viewmodel.NotificationsMainFromInterestsTopicsVM
import com.kamishasapplication.app.modules.topics.ui.TopicsActivity
import kotlin.String
import kotlin.Unit

class NotificationsMainFromInterestsTopicsActivity :
    BaseActivity<ActivityNotificationsMainFromInterestsTopicsBinding>(R.layout.activity_notifications_main_from_interests_topics)
    {
  private val viewModel: NotificationsMainFromInterestsTopicsVM by
      viewModels<NotificationsMainFromInterestsTopicsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainFromInterestsTopicsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = TopicsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_FROM_INTERESTS_TOPICS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsMainFromInterestsTopicsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
