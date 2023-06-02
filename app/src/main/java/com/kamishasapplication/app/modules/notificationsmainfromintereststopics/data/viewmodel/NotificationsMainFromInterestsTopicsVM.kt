package com.kamishasapplication.app.modules.notificationsmainfromintereststopics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmainfromintereststopics.`data`.model.NotificationsMainFromInterestsTopicsModel
import org.koin.core.KoinComponent

class NotificationsMainFromInterestsTopicsVM : ViewModel(), KoinComponent {
  val notificationsMainFromInterestsTopicsModel:
      MutableLiveData<NotificationsMainFromInterestsTopicsModel> =
      MutableLiveData(NotificationsMainFromInterestsTopicsModel())

  var navArguments: Bundle? = null
}
