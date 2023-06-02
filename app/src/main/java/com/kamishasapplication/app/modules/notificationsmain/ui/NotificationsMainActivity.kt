package com.kamishasapplication.app.modules.notificationsmain.ui

import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainBinding
import com.kamishasapplication.app.modules.notificationsmain.`data`.viewmodel.NotificationsMainVM
import kotlin.String
import kotlin.Unit

class NotificationsMainActivity :
    BaseActivity<ActivityNotificationsMainBinding>(R.layout.activity_notifications_main) {
  private val viewModel: NotificationsMainVM by viewModels<NotificationsMainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_ACTIVITY"

  }
}
