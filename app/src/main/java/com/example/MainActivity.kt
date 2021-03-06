package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.mainNavFragment)
        setSupportActionBar(toolbar)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        navigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean = NavigationUI.navigateUp(navController, drawerLayout)
}
