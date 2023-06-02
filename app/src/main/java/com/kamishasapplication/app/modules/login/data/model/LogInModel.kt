package com.kamishasapplication.app.modules.login.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUnstuck: String? = MyApp.getInstance().resources.getString(R.string.lbl_unstuck)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtORREGISTERWIT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_register_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_register_with_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_register_with_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailusernameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
