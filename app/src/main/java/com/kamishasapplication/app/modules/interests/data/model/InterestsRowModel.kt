package com.kamishasapplication.app.modules.interests.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InterestsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_diy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCryptocurrency: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_issues)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_finance)

)
