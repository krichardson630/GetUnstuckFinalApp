package com.kamishasapplication.app.modules.loginone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.kamishasapplication.app.appcomponents.googleauth.GoogleHelper
import com.kamishasapplication.app.databinding.ActivityLogInOneBinding
import com.kamishasapplication.app.modules.home.ui.HomeActivity
import com.kamishasapplication.app.modules.loginone.`data`.viewmodel.LogInOneVM
import com.kamishasapplication.app.modules.signup.ui.SignUpActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LogInOneActivity : BaseActivity<ActivityLogInOneBinding>(R.layout.activity_log_in_one) {
  private val viewModel: LogInOneVM by viewModels<LogInOneVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()


  private val facebookLogin: FacebookHelper = FacebookHelper()


  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ): Unit {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInOneVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.txtGroupSix.setOnClickListener {
        val destIntent = HomeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearRowgoogleone.setOnClickListener {
        googleLogin.login()
      }
      binding.linearRowfacebookone.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.txtSignup.setOnClickListener {
          val destIntent = SignUpActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }

      companion object {
        const val TAG: String = "LOG_IN_ONE_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, LogInOneActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
