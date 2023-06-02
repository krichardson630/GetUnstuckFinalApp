package com.kamishasapplication.app.modules.termsandconditionsview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kamishasapplication.app.modules.termsandconditionsview.`data`.model.TermsAndConditionsViewModel
import org.koin.core.KoinComponent

class TermsAndConditionsViewVM : ViewModel(), KoinComponent {
  val termsAndConditionsViewModel: MutableLiveData<TermsAndConditionsViewModel> =
      MutableLiveData(TermsAndConditionsViewModel())

  var navArguments: Bundle? = null
}
