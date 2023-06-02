package com.kamishasapplication.app.modules.login.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.kamishasapplication.app.modules.login.`data`.model.LogInModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LogInVM : ViewModel(), KoinComponent {
  val logInModel: MutableLiveData<LogInModel> = MutableLiveData(LogInModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
