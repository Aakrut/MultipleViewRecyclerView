package com.examples.multiviewrecyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ex.androidmultipleviewrecyclerview.R
import com.examples.multiviewrecyclerview.DataItems.VerticalItems


open class VerticalAdapter(val arraylist : List<VerticalItems>) : RecyclerView.Adapter<VerticalAdapter.VerticalViewHolder>() {


    inner class VerticalViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){
        var image : ImageView = itemview.findViewById(R.id.image_vertical_small) as ImageView




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerticalViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vertical,parent,false)
        return VerticalViewHolder(view)
    }



    override fun onBindViewHolder(holder: VerticalViewHolder, position: Int) {
        val current = arraylist[position]

        holder.image.setImageResource(current.imagers)


    }

    override fun getItemCount(): Int {
            return arraylist.size
    }
}