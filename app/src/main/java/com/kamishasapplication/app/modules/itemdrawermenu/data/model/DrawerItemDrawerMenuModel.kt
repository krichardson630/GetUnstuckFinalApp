package com.kamishasapplication.app.modules.itemdrawermenu.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemDrawerMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtViewProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_michael_tucker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAudio: String? = MyApp.getInstance().resources.getString(R.string.lbl_published_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReadingList: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewStory: String? = MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
