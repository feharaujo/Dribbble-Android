package com.felipearaujo.dribbble.main.feed

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fearaujo.model.Shot
import com.felipearaujo.dribbble.main.R
import com.felipearaujo.uicomponents.UIShot
import kotlinx.android.synthetic.main.item_shot_recycler.*

/**
 * Created by felipearaujo on 25/03/18.
 */
class ShotsAdapter: RecyclerView.Adapter<ShotsAdapter.ShotViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShotViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shot_recycler, parent, false)
        return ShotViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: ShotViewHolder, position: Int) {
        //holder.bindViewHolder()
        holder.bindViewHolder(null)
    }


    inner class ShotViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindViewHolder(shot: Shot?) {
            val shotViewItem = itemView.findViewById<UIShot>(R.id.shotItem)
            shotViewItem.bind()
        }

    }

}