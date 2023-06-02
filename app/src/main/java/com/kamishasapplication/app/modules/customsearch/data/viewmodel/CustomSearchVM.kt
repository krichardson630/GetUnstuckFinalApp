package com.kamishasapplication.app.modules.customsearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.customsearch.`data`.model.CustomSearchModel
import org.koin.core.KoinComponent

class CustomSearchVM : ViewModel(), KoinComponent {
  val customSearchModel: MutableLiveData<CustomSearchModel> = MutableLiveData(CustomSearchModel())

  var navArguments: Bundle? = null
}
