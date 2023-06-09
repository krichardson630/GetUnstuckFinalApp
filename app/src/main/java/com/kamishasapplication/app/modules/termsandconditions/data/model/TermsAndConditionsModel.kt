package com.kamishasapplication.app.modules.termsandconditions.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TermsAndConditionsModel(
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
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEffectiveSept: String? =
      MyApp.getInstance().resources.getString(R.string.msg_effective_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanseeour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_see_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_your_account_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
