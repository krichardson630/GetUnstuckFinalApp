package com.kamishasapplication.app.modules.topics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.topics.`data`.model.TopicsModel
import com.kamishasapplication.app.modules.topics.`data`.model.TopicsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TopicsVM : ViewModel(), KoinComponent {
  val topicsModel: MutableLiveData<TopicsModel> = MutableLiveData(TopicsModel())

  var navArguments: Bundle? = null

  val topicsList: MutableLiveData<MutableList<TopicsRowModel>> = MutableLiveData(mutableListOf())
}
