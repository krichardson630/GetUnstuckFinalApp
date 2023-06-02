package com.kamishasapplication.app.modules.people.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityPeopleBinding
import com.kamishasapplication.app.modules.notificationsmainfrominterestspeople.ui.NotificationsMainFromInterestsPeopleActivity
import com.kamishasapplication.app.modules.people.`data`.model.PeopleRowModel
import com.kamishasapplication.app.modules.people.`data`.viewmodel.PeopleVM
import com.kamishasapplication.app.modules.topics.ui.TopicsActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PeopleActivity : BaseActivity<ActivityPeopleBinding>(R.layout.activity_people) {
  private val viewModel: PeopleVM by viewModels<PeopleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val peopleAdapter = PeopleAdapter(viewModel.peopleList.value?:mutableListOf())
    binding.recyclerPeople.adapter = peopleAdapter
    peopleAdapter.setOnItemClickListener(
    object : PeopleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PeopleRowModel) {
        onClickRecyclerPeople(view, position, item)
      }
    }
    )
    viewModel.peopleList.observe(this) {
      peopleAdapter.updateData(it)
    }
    binding.peopleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsMainFromInterestsPeopleActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTopic.setOnClickListener {
      val destIntent = TopicsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPeople(
    view: View,
    position: Int,
    item: PeopleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PEOPLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PeopleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
