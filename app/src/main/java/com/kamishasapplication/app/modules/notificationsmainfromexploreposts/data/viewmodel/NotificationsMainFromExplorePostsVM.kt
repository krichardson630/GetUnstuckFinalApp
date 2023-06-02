package com.kamishasapplication.app.modules.notificationsmainfromexploreposts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.notificationsmainfromexploreposts.`data`.model.NotificationsMainFromExplorePostsModel
import org.koin.core.KoinComponent

class NotificationsMainFromExplorePostsVM : ViewModel(), KoinComponent {
  val notificationsMainFromExplorePostsModel:
      MutableLiveData<NotificationsMainFromExplorePostsModel> =
      MutableLiveData(NotificationsMainFromExplorePostsModel())

  var navArguments: Bundle? = null
}
