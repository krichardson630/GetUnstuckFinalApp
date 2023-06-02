package com.kamishasapplication.app.modules.topics.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TopicsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEasytoUse: String? = MyApp.getInstance().resources.getString(R.string.lbl_tutorials)

)
