package com.kamishasapplication.app.modules.loginone.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogInOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUnstuck: String? = MyApp.getInstance().resources.getString(R.string.lbl_unstuck)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtORLOGINWITH: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
