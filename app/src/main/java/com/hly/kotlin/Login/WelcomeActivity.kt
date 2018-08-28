package com.hly.kotlin.Login

import android.content.Intent
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.hly.kotlin.MainActivity
import com.hly.kotlin.R
import java.util.ArrayList

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/20~~~~~~
 * ~~~~~~更改时间:2018/8/20~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
class WelcomeActivity : AppCompatActivity() {
    var list: MutableList<View> = ArrayList()
    var viewPager: ViewPager? = null
    var imgs = intArrayOf(R.drawable.splash, R.drawable.splash, R.drawable.splash)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_activity_layout)
        viewPager = ViewPager(this)
        setContentView(viewPager)
        for (i in imgs.indices) {
            val img = ImageView(this)
            img.scaleType = ImageView.ScaleType.CENTER_CROP
            img.setImageResource(imgs[i])
            list.add(img)
        }
        val view = LayoutInflater.from(this).inflate(R.layout.welcome_item_layout, null)
        view.findViewById<TextView>(R.id.welcome).setOnClickListener{
            var intent = Intent(this@WelcomeActivity,MainActivity::class.java)
            startActivity(intent)
        }

        list.add(view)
        viewPager?.adapter = PagerAdpter()
    }

    internal inner class PagerAdpter : PagerAdapter() {

        override fun getCount(): Int {
            return list.size
        }

        override fun isViewFromObject(view: View, `object`: Any): Boolean {
            return view === `object`
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val v = list[position]
            container.addView(v)
            return v
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container.removeView(list[position])
        }
    }
}