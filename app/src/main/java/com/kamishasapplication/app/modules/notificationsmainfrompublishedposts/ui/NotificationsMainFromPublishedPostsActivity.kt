package com.kamishasapplication.app.modules.notificationsmainfrompublishedposts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainFromPublishedPostsBinding
import com.kamishasapplication.app.modules.notificationsmainfrompublishedposts.`data`.viewmodel.NotificationsMainFromPublishedPostsVM
import com.kamishasapplication.app.modules.publishedposts.ui.PublishedPostsActivity
import kotlin.String
import kotlin.Unit

class NotificationsMainFromPublishedPostsActivity :
    BaseActivity<ActivityNotificationsMainFromPublishedPostsBinding>(R.layout.activity_notifications_main_from_published_posts)
    {
  private val viewModel: NotificationsMainFromPublishedPostsVM by
      viewModels<NotificationsMainFromPublishedPostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainFromPublishedPostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = PublishedPostsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_FROM_PUBLISHED_POSTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsMainFromPublishedPostsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
