package com.example.gmailclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.gmailclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    //TODO resimler eklenecek , veriler güncellenecek, searchView Ayarlanacak Hilt yazısı vs, 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //menu bağlama 
        val navcontraller = findNavController(R.id.navHostFragment)
       binding.bottomNavigationView.setupWithNavController(navcontraller)
    }
}