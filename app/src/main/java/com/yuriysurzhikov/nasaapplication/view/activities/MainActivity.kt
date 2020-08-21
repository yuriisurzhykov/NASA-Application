package com.yuriysurzhikov.nasaapplication.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yuriysurzhikov.nasaapplication.R
import com.yuriysurzhikov.nasaapplication.view.adapters.MainPagerAdapter
import com.yuriysurzhikov.nasaapplication.view.fragments.AsteroidsFragment
import com.yuriysurzhikov.nasaapplication.view.fragments.DailyPostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = main_viewpager
        val mainPagerAdapter = MainPagerAdapter.Builder(supportFragmentManager)
            .addFragment("Daily post", DailyPostFragment())
            .addFragment("Asteroids", AsteroidsFragment())
            .create()
        viewPager.adapter = mainPagerAdapter
        val tabLayout = main_tab_layout
        tabLayout.setupWithViewPager(viewPager)
    }
}
