package com.felipearaujo.uicomponents

import android.content.Context
import android.support.v7.widget.CardView
import android.util.AttributeSet
import android.view.View
import com.fearaujo.model.Shot
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_ui_shot.view.*

/**
 * Created by felipearaujo on 21/03/18.
 */
class UIShot(context: Context, attrs: AttributeSet?) : CardView(context, attrs) {

    init {
        View.inflate(context, R.layout.item_ui_shot, this)
    }

   /* fun bind(shot: Shot) {
        val picasso = Picasso.Builder(context)
                .build()

        picasso.load(shot.images?.normal)
                .into(iv_shot)
    }*/

    fun bind() {
        val picasso = Picasso.Builder(context)
                .build()

        picasso.load("https://cdn.dribbble.com/users/50942/screenshots/4360479/deck-dribbble_teaser.png")
                .into(iv_shot)
    }


}