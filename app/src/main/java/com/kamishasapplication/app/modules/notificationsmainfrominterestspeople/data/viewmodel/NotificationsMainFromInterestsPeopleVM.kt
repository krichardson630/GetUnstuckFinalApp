package com.kamishasapplication.app.modules.notificationsmainfrominterestspeople.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmainfrominterestspeople.`data`.model.NotificationsMainFromInterestsPeopleModel
import org.koin.core.KoinComponent

class NotificationsMainFromInterestsPeopleVM : ViewModel(), KoinComponent {
  val notificationsMainFromInterestsPeopleModel:
      MutableLiveData<NotificationsMainFromInterestsPeopleModel> =
      MutableLiveData(NotificationsMainFromInterestsPeopleModel())

  var navArguments: Bundle? = null
}
