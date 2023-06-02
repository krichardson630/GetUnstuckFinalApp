package com.kamishasapplication.app.modules.publishedposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.publishedposts.`data`.model.ListlanguageRowModel
import com.kamishasapplication.app.modules.publishedposts.`data`.model.ListlanguageTwoRowModel
import com.kamishasapplication.app.modules.publishedposts.`data`.model.PublishedPostsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PublishedPostsVM : ViewModel(), KoinComponent {
  val publishedPostsModel: MutableLiveData<PublishedPostsModel> =
      MutableLiveData(PublishedPostsModel())

  var navArguments: Bundle? = null

  val listlanguageList: MutableLiveData<MutableList<ListlanguageRowModel>> =
      MutableLiveData(mutableListOf())

  val listlanguageTwoList: MutableLiveData<MutableList<ListlanguageTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
