package com.kamishasapplication.app.modules.exploreposts.`data`.model

import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listlanguage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_may_15_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArticleTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tips_to_acing_t)

)
