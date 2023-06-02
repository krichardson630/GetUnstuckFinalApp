package com.kamishasapplication.app.modules.privacypolicyview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.privacypolicyview.`data`.model.PrivacyPolicyViewModel
import org.koin.core.KoinComponent

class PrivacyPolicyViewVM : ViewModel(), KoinComponent {
  val privacyPolicyViewModel: MutableLiveData<PrivacyPolicyViewModel> =
      MutableLiveData(PrivacyPolicyViewModel())

  var navArguments: Bundle? = null
}
