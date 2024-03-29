package com.example.notes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavigationComponentWithBottomNavigation()
    }

    private fun setupNavigationComponentWithBottomNavigation() {
        val navController = findNavController(R.id.nav_host_fragment)
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}