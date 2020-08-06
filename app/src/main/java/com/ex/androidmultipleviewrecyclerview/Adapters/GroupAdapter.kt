package com.examples.multiviewrecyclerview.Adapters

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ex.androidmultipleviewrecyclerview.R
import com.examples.multiviewrecyclerview.DataItems.CoverSmallVerticalItems
import com.examples.multiviewrecyclerview.DataItems.GroupItems
import com.examples.multiviewrecyclerview.DataItems.SmallCoverItems
import com.examples.multiviewrecyclerview.DataItems.VerticalItems


open class GroupAdapter( private  var context : Context,private val arraylistgroup : List<GroupItems> , private val arraylist_banner : List<CoverSmallVerticalItems>
                    , private val arraylist_small : List<SmallCoverItems> ,
                   private val arraylist_vertical : List<VerticalItems>) : RecyclerView.Adapter<GroupAdapter.GroupViewHolder>() {






   inner class GroupViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val text : TextView = itemview.findViewById(R.id.group) as TextView
        val button : TextView = itemview.findViewById(R.id.view_all) as TextView
        val relativelayout : RelativeLayout = itemview.findViewById(R.id.relative_layout_banner) as RelativeLayout
        val recyclerview : RecyclerView = itemview.findViewById(R.id.recycler_group) as RecyclerView


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_group,parent,false)
            return GroupViewHolder(view)
    }



    override fun onBindViewHolder(holder: GroupViewHolder, position: Int) {

        val element = arraylistgroup[position]

        holder.text.text = element.text_des
        holder.button.text = element.more

        when(position){

            0-> {
                val coveradapter = CoverAdapter(arraylist_banner)
                holder.recyclerview.setHasFixedSize(true)
                holder.recyclerview.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                holder.recyclerview.adapter = coveradapter
                holder.recyclerview.isNestedScrollingEnabled = false

            }

            1->{
                val smallcoveradapter = SmallAdapter(arraylist_small)
                holder.recyclerview.setHasFixedSize(true)
                holder.recyclerview.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                holder.recyclerview.adapter = smallcoveradapter
                holder.recyclerview.isNestedScrollingEnabled = false
            }


             2-> {
                 val verticaladapter = VerticalAdapter(arraylist_vertical)
                 holder.recyclerview.setHasFixedSize(true)
                 holder.recyclerview.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                 holder.recyclerview.adapter = verticaladapter
                 holder.recyclerview.isNestedScrollingEnabled = false
             }
        }


    }

    override fun getItemCount(): Int {
            return arraylistgroup.size
    }



}


