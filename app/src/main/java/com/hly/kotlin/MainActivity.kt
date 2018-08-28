package com.hly.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.hly.kotlin.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var myAdapter: MyAdapter? = null
    private var list: List<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list = ArrayList()
        for (i in 0..29) {
            (list as ArrayList<String>)?.add("2222")
        }
        recy.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recy.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        myAdapter =MyAdapter(list as ArrayList<String>)
        recy.adapter=myAdapter
    }


}
