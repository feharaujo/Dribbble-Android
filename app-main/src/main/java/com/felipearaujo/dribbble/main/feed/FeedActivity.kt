package com.felipearaujo.dribbble.main.feed

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.felipearaujo.dribbble.main.R
import kotlinx.android.synthetic.main.activity_feed.*

class FeedActivity : AppCompatActivity() {

    val adapter: ShotsAdapter by lazy {
        ShotsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)

        rvShots.setHasFixedSize(true)
        rvShots.adapter = adapter
        rvShots.layoutManager = GridLayoutManager(this, 2)
    }
}
