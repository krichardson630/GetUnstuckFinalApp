package com.kamishasapplication.app.modules.unstuck.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.unstuck.`data`.model.UnstuckModel
import org.koin.core.KoinComponent

class UnstuckVM : ViewModel(), KoinComponent {
  val unstuckModel: MutableLiveData<UnstuckModel> = MutableLiveData(UnstuckModel())

  var navArguments: Bundle? = null
}
