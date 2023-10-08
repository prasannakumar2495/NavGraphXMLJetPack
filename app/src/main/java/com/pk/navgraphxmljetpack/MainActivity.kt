package com.pk.navgraphxmljetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.pk.navgraphxmljetpack.databinding.ActivityMainBinding

/**
 * https://stackoverflow.com/questions/76796254/android-navigation-define-argument
 */

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)
	}
	
	override fun onStart() {
		super.onStart()
		val navController = findNavController(R.id.dashboardFragmentContainerView)
		binding.bottomNavigation.setupWithNavController(navController)
	}
}