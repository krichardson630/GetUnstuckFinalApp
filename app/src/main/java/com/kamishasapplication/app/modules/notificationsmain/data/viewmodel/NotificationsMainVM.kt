package com.kamishasapplication.app.modules.notificationsmain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmain.`data`.model.NotificationsMainModel
import org.koin.core.KoinComponent

class NotificationsMainVM : ViewModel(), KoinComponent {
  val notificationsMainModel: MutableLiveData<NotificationsMainModel> =
      MutableLiveData(NotificationsMainModel())

  var navArguments: Bundle? = null
}
