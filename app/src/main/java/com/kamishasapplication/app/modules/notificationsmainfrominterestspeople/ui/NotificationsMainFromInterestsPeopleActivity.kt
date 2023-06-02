package com.kamishasapplication.app.modules.notificationsmainfrominterestspeople.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityNotificationsMainFromInterestsPeopleBinding
import com.kamishasapplication.app.modules.notificationsmainfrominterestspeople.`data`.viewmodel.NotificationsMainFromInterestsPeopleVM
import com.kamishasapplication.app.modules.people.ui.PeopleActivity
import kotlin.String
import kotlin.Unit

class NotificationsMainFromInterestsPeopleActivity :
    BaseActivity<ActivityNotificationsMainFromInterestsPeopleBinding>(R.layout.activity_notifications_main_from_interests_people)
    {
  private val viewModel: NotificationsMainFromInterestsPeopleVM by
      viewModels<NotificationsMainFromInterestsPeopleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsMainFromInterestsPeopleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = PeopleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_MAIN_FROM_INTERESTS_PEOPLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsMainFromInterestsPeopleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
