package com.kamishasapplication.app.modules.notificationsmainfromhome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmainfromhome.`data`.model.NotificationsMainFromHomeModel
import org.koin.core.KoinComponent

class NotificationsMainFromHomeVM : ViewModel(), KoinComponent {
  val notificationsMainFromHomeModel: MutableLiveData<NotificationsMainFromHomeModel> =
      MutableLiveData(NotificationsMainFromHomeModel())

  var navArguments: Bundle? = null
}
