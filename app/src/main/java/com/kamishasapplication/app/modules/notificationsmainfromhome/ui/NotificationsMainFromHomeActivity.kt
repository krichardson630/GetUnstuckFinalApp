package com.kamishasapplication.app.modules.notificationsmainfromhome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainFromHomeBinding
import com.kamishasapplication.app.modules.home.ui.HomeActivity
import com.kamishasapplication.app.modules.notificationsmainfromhome.`data`.viewmodel.NotificationsMainFromHomeVM
import kotlin.String
import kotlin.Unit

class NotificationsMainFromHomeActivity :
    BaseActivity<ActivityNotificationsMainFromHomeBinding>(R.layout.activity_notifications_main_from_home)
    {
  private val viewModel: NotificationsMainFromHomeVM by viewModels<NotificationsMainFromHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainFromHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_FROM_HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsMainFromHomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
