package com.kamishasapplication.app.modules.notificationsmainfrompublishedposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmainfrompublishedposts.`data`.model.NotificationsMainFromPublishedPostsModel
import org.koin.core.KoinComponent

class NotificationsMainFromPublishedPostsVM : ViewModel(), KoinComponent {
  val notificationsMainFromPublishedPostsModel:
      MutableLiveData<NotificationsMainFromPublishedPostsModel> =
      MutableLiveData(NotificationsMainFromPublishedPostsModel())

  var navArguments: Bundle? = null
}
