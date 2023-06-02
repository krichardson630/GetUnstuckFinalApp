package com.kamishasapplication.app.modules.people.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.people.`data`.model.PeopleModel
import com.kamishasapplication.app.modules.people.`data`.model.PeopleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PeopleVM : ViewModel(), KoinComponent {
  val peopleModel: MutableLiveData<PeopleModel> = MutableLiveData(PeopleModel())

  var navArguments: Bundle? = null

  val peopleList: MutableLiveData<MutableList<PeopleRowModel>> = MutableLiveData(mutableListOf())
}
