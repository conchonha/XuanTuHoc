package com.example.mvvm_livedata_flow.ui.page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import com.example.mvvm_livedata_flow.R
import dagger.hilt.android.AndroidEntryPoint

//Jetpack component -> Architecture (LiveData,MVVM,ROOM,NAVIGATION,WORKMANAGER,LIFECYCLE)
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var controllerNav : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val nav = findViewById<FragmentContainerView>(R.id.fvMain)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.fvMain) as NavHostFragment
        controllerNav = navHostFragment.navController
    }
}