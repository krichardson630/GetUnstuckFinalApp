package com.kamishasapplication.app.modules.notificationsmainfromexploreposts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainFromExplorePostsBinding
import com.kamishasapplication.app.modules.exploreposts.ui.ExplorePostsActivity
import com.kamishasapplication.app.modules.notificationsmainfromexploreposts.`data`.viewmodel.NotificationsMainFromExplorePostsVM
import kotlin.String
import kotlin.Unit

class NotificationsMainFromExplorePostsActivity :
    BaseActivity<ActivityNotificationsMainFromExplorePostsBinding>(R.layout.activity_notifications_main_from_explore_posts)
    {
  private val viewModel: NotificationsMainFromExplorePostsVM by
      viewModels<NotificationsMainFromExplorePostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainFromExplorePostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = ExplorePostsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_FROM_EXPLORE_POSTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsMainFromExplorePostsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
