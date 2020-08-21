package com.yuriysurzhikov.nasaapplication.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yuriysurzhikov.nasaapplication.R

class DailyPostFragment: Fragment() {

    private lateinit var currentView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        currentView = inflater.inflate(R.layout.daily_post_fragment_layout, container, false)
        return currentView
    }
}