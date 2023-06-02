package com.kamishasapplication.app.modules.home.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_diy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsum: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_issues)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_finance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTechnology: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_guides)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumis: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_to_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumisOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_for_dummies)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumisTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_tutorials)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumisThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_technology)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_top_stuck_topic)

)
