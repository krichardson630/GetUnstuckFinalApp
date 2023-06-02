package com.kamishasapplication.app.modules.privacypolicyview.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PrivacyPolicyViewModel(
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
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
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
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_content)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_collection_of_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_of_informat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sharing_of_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_third_party_emb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionSix: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_choices)

)
