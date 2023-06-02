package com.kamishasapplication.app.modules.exploreposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.exploreposts.`data`.model.ExplorePostsModel
import com.kamishasapplication.app.modules.exploreposts.`data`.model.Listlanguage1RowModel
import com.kamishasapplication.app.modules.exploreposts.`data`.model.ListlanguageTwo1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ExplorePostsVM : ViewModel(), KoinComponent {
  val explorePostsModel: MutableLiveData<ExplorePostsModel> = MutableLiveData(ExplorePostsModel())

  var navArguments: Bundle? = null

  val listlanguageList: MutableLiveData<MutableList<Listlanguage1RowModel>> =
      MutableLiveData(mutableListOf())

  val listlanguageTwoList: MutableLiveData<MutableList<ListlanguageTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
