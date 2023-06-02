package com.kamishasapplication.app.modules.unstuck.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityUnstuckBinding
import com.kamishasapplication.app.modules.termsandconditions.ui.TermsAndConditionsActivity
import com.kamishasapplication.app.modules.unstuck.`data`.viewmodel.UnstuckVM
import kotlin.String
import kotlin.Unit

class UnstuckActivity : BaseActivity<ActivityUnstuckBinding>(R.layout.activity_unstuck) {
  private val viewModel: UnstuckVM by viewModels<UnstuckVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.unstuckVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = TermsAndConditionsActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnClose.setOnClickListener {
        val destIntent = TermsAndConditionsActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "UNSTUCK_ACTIVITY"

    }
  }
