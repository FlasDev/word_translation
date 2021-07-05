package com.example.englishtranslationword

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.englishtranslationword.adapters.ViewPagerStateAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager.adapter = ViewPagerStateAdapter(this)


        NavigationUI.setupWithNavController(bottomNavigationView, bottomNavigationView
            .findNavController())
    }
}
