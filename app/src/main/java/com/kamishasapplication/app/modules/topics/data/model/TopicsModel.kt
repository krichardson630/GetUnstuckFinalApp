package com.kamishasapplication.app.modules.topics.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TopicsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopic: String? = MyApp.getInstance().resources.getString(R.string.lbl_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeople: String? = MyApp.getInstance().resources.getString(R.string.lbl_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtEntertain: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_unstuck_topics)

)
