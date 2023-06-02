package com.kamishasapplication.app.modules.privacypolicyview.ui

import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityPrivacyPolicyViewBinding
import com.kamishasapplication.app.modules.privacypolicyview.`data`.viewmodel.PrivacyPolicyViewVM
import kotlin.String
import kotlin.Unit

class PrivacyPolicyViewActivity :
    BaseActivity<ActivityPrivacyPolicyViewBinding>(R.layout.activity_privacy_policy_view) {
  private val viewModel: PrivacyPolicyViewVM by viewModels<PrivacyPolicyViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.privacyPolicyViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PRIVACY_POLICY_VIEW_ACTIVITY"

  }
}
