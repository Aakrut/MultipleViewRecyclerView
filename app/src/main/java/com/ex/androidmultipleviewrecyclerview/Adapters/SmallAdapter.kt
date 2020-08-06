package com.examples.multiviewrecyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ex.androidmultipleviewrecyclerview.R
import com.examples.multiviewrecyclerview.DataItems.CoverSmallVerticalItems
import com.examples.multiviewrecyclerview.DataItems.SmallCoverItems


open class SmallAdapter(val arraylist : List<SmallCoverItems>) : RecyclerView.Adapter<SmallAdapter.SMallViewHOlder>() {


   inner class SMallViewHOlder(itemview : View) : RecyclerView.ViewHolder(itemview){
        var image : ImageView = itemview.findViewById(R.id.image_horizontal_small) as ImageView

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SMallViewHOlder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_small,parent,false)
        return SMallViewHOlder(view)
    }



    override fun onBindViewHolder(holder: SMallViewHOlder, position: Int) {
        val current = arraylist[position]

        holder.image.setImageResource(current.images)
    }

    override fun getItemCount(): Int {
            return arraylist.size
    }
}