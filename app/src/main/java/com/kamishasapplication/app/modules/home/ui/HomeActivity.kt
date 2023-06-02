package com.kamishasapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import com.kamishasapplication.app.R
import com.kamishasapplication.app.appcomponents.base.BaseActivity
import com.kamishasapplication.app.databinding.ActivityHomeBinding
import com.kamishasapplication.app.modules.customsearch.ui.CustomSearchActivity
import com.kamishasapplication.app.modules.home.`data`.model.HomeRowModel
import com.kamishasapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.kamishasapplication.app.modules.notificationsmainfromhome.ui.NotificationsMainFromHomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val homeAdapter = HomeAdapter(viewModel.homeList.value?:mutableListOf())
    binding.recyclerHome.adapter = homeAdapter
    homeAdapter.setOnItemClickListener(
    object : HomeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeRowModel) {
        onClickRecyclerHome(view, position, item)
      }
    }
    )
    viewModel.homeList.observe(this) {
      homeAdapter.updateData(it)
    }
    binding.homeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      toggleDrawer()
    }
    binding.imageNotification.setOnClickListener {
      val destIntent = NotificationsMainFromHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSearch.setOnClickListener {
      val destIntent = CustomSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun toggleDrawer(): Unit {
    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
      binding.drawerLayout.openDrawer(GravityCompat.START)
    }
    else {
      binding.drawerLayout.closeDrawer(GravityCompat.START)
    }
  }

  fun onClickRecyclerHome(
    view: View,
    position: Int,
    item: HomeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
