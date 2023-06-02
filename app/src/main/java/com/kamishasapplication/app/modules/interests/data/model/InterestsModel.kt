package com.kamishasapplication.app.modules.interests.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitletext: String? = MyApp.getInstance().resources.getString(R.string.msg_what_are_you_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptiontes: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_topic)

)
