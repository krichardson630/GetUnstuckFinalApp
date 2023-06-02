package com.kamishasapplication.app.modules.people.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PeopleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_see_all_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMorepeopleto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_people_to)

)
