package com.kamishasapplication.app.modules.loginone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.kamishasapplication.app.modules.loginone.`data`.model.LogInOneModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LogInOneVM : ViewModel(), KoinComponent {
  val logInOneModel: MutableLiveData<LogInOneModel> = MutableLiveData(LogInOneModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
