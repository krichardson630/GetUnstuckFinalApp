package com.kamishasapplication.app.modules.publishedposts.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlanguageTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_may_19_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleTitleTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_car_tips_tric)

)
