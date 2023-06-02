package com.kamishasapplication.app.modules.customsearch.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CustomSearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExploreTopics: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_explore_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBooks: String? = MyApp.getInstance().resources.getString(R.string.lbl_diy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiction: String? = MyApp.getInstance().resources.getString(R.string.lbl_car_issues)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComics: String? = MyApp.getInstance().resources.getString(R.string.lbl_finance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArt: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_guides)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVisualDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_family)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTechnology: String? = MyApp.getInstance().resources.getString(R.string.lbl_health)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtScience: String? = MyApp.getInstance().resources.getString(R.string.lbl_job_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusiness: String? = MyApp.getInstance().resources.getString(R.string.lbl_resume)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPsychology: String? = MyApp.getInstance().resources.getString(R.string.lbl_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreativity: String? = MyApp.getInstance().resources.getString(R.string.lbl_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEducation: String? = MyApp.getInstance().resources.getString(R.string.lbl_motivation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeminism: String? = MyApp.getInstance().resources.getString(R.string.lbl_social)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtificialInte: String? = MyApp.getInstance().resources.getString(R.string.lbl_how_to_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHealth: String? = MyApp.getInstance().resources.getString(R.string.lbl_salary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesign: String? = MyApp.getInstance().resources.getString(R.string.lbl_tricks)

)
