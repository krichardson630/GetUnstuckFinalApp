package com.kamishasapplication.app.modules.unstuck.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class UnstuckModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_unstuck)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuneCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_to_unst)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_unst2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImagecaption: String? =
      MyApp.getInstance().resources.getString(R.string.msg_image_credit_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_hope_that_you)

)
