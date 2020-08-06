package com.examples.multiviewrecyclerview.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.ex.androidmultipleviewrecyclerview.R
import com.examples.multiviewrecyclerview.DataItems.CoverSmallVerticalItems


open class CoverAdapter( val arraylist : List<CoverSmallVerticalItems>) : RecyclerView.Adapter<CoverAdapter.CoverViewHolder>() {


   inner class CoverViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        var image : ImageView = itemview.findViewById(R.id.image_banner) as ImageView


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoverViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cover,parent,false)
        return CoverViewHolder(view)
    }



    override fun onBindViewHolder(holder: CoverViewHolder, position: Int) {
        val current = arraylist[position]

        holder.image.setImageResource(current.image_res)
    }

    override fun getItemCount(): Int {
            return arraylist.size
    }
}