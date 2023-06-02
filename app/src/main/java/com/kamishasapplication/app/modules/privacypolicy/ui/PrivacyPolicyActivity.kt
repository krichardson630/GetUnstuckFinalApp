package com.kamishasapplication.app.modules.privacypolicy.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityPrivacyPolicyBinding
import com.kamishasapplication.app.modules.loginone.ui.LogInOneActivity
import com.kamishasapplication.app.modules.privacypolicy.`data`.viewmodel.PrivacyPolicyVM
import kotlin.String
import kotlin.Unit

class PrivacyPolicyActivity :
    BaseActivity<ActivityPrivacyPolicyBinding>(R.layout.activity_privacy_policy) {
  private val viewModel: PrivacyPolicyVM by viewModels<PrivacyPolicyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.privacyPolicyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      val destIntent = LogInOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PRIVACY_POLICY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PrivacyPolicyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
