package com.kamishasapplication.app.modules.exploreposts.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ExplorePostsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumis: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_posts)

)
