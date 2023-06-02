package com.kamishasapplication.app.modules.notificationsmain.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsMainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_jane_doe_liked)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_susan_ready_res)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTisanthanpanch: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kyle_manning_fo)

)
