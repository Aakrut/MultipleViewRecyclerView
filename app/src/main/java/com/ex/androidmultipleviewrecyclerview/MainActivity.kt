package com.ex.androidmultipleviewrecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.examples.multiviewrecyclerview.Adapters.GroupAdapter
import com.examples.multiviewrecyclerview.DataItems.CoverSmallVerticalItems
import com.examples.multiviewrecyclerview.DataItems.GroupItems
import com.examples.multiviewrecyclerview.DataItems.SmallCoverItems
import com.examples.multiviewrecyclerview.DataItems.VerticalItems
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val context : Context = this@MainActivity

    var array : List<GroupItems> = ArrayList()
    var array_cover : List<CoverSmallVerticalItems> = ArrayList()
    var array_small : List<SmallCoverItems> = ArrayList()
    var array_vertical : List<VerticalItems> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        array = ArrayList()
        (array as ArrayList<GroupItems>).add( GroupItems("Most Played","More"))
        (array as ArrayList<GroupItems>).add( GroupItems("New Released","More"))
        (array as ArrayList<GroupItems>).add( GroupItems("Game of the Year","More"))



        array_cover = ArrayList()
        (array_cover as ArrayList<CoverSmallVerticalItems>).add(CoverSmallVerticalItems(R.drawable.marvelsspiderman))
        (array_cover as ArrayList<CoverSmallVerticalItems>).add( CoverSmallVerticalItems(R.drawable.assassinsoddyssey))
        (array_cover as ArrayList<CoverSmallVerticalItems>).add( CoverSmallVerticalItems(R.drawable.forzahorizonf))
        (array_cover as ArrayList<CoverSmallVerticalItems>).add( CoverSmallVerticalItems(R.drawable.cyberpunk2077))

        array_small = ArrayList()
        (array_small as ArrayList<SmallCoverItems>).add( SmallCoverItems(R.drawable.newreleasedone))
        (array_small as ArrayList<SmallCoverItems>).add( SmallCoverItems(R.drawable.callofdutyblackopsfour))
        (array_small as ArrayList<SmallCoverItems>).add( SmallCoverItems(R.drawable.thelastofus2))
        (array_small as ArrayList<SmallCoverItems>).add( SmallCoverItems(R.drawable.minecraft))
        (array_small as ArrayList<SmallCoverItems>).add( SmallCoverItems(R.drawable.overwatch))



        array_vertical = ArrayList()
        (array_vertical as ArrayList<VerticalItems>).add( VerticalItems(R.drawable.unchartedfour))
        (array_vertical as ArrayList<VerticalItems>).add( VerticalItems(R.drawable.forzahorizonfour))
        (array_vertical as ArrayList<VerticalItems>).add( VerticalItems(R.drawable.assasinscreedorigin))
        (array_vertical as ArrayList<VerticalItems>).add( VerticalItems(R.drawable.fortnite))
        (array_vertical as ArrayList<VerticalItems>).add( VerticalItems(R.drawable.assassinscreedsyndicate))

        val recyclerview : RecyclerView = findViewById(R.id.recycler_view_banner)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val groupadapter = GroupAdapter(context, array,array_cover,array_small,array_vertical)
        recycler_view_banner.adapter = groupadapter

    }
}