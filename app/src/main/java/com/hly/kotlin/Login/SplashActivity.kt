package com.hly.kotlin.Login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.hly.kotlin.R

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/8/20~~~~~~
 * ~~~~~~更改时间:2018/8/20~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity_layout)
        val handler = Handler()
        handler.postDelayed({
            startActivity(Intent(this@SplashActivity, WelcomeActivity::class.java))
        }, 3000)


    }
}