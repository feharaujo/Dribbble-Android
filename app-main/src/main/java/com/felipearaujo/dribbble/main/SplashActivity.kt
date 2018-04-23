package com.felipearaujo.dribbble.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import com.felipearaujo.dribbble.main.R
import com.felipearaujo.dribbble.main.feed.FeedActivity
import org.jetbrains.anko.intentFor

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity(intentFor<FeedActivity>())
    }
}
