package com.kamishasapplication.app.modules.termsandconditionsview.ui

import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityTermsAndConditionsViewBinding
import com.kamishasapplication.app.modules.termsandconditionsview.`data`.viewmodel.TermsAndConditionsViewVM
import kotlin.String
import kotlin.Unit

class TermsAndConditionsViewActivity :
    BaseActivity<ActivityTermsAndConditionsViewBinding>(R.layout.activity_terms_and_conditions_view)
    {
  private val viewModel: TermsAndConditionsViewVM by viewModels<TermsAndConditionsViewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.termsAndConditionsViewVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TERMS_AND_CONDITIONS_VIEW_ACTIVITY"

  }
}
