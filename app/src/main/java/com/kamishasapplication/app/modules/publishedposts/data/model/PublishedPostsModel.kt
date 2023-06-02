package com.kamishasapplication.app.modules.publishedposts.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PublishedPostsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_published_posts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_personal_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_may_25_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleTitleFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_entrepreneur_h)

)
