package com.ibailian

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

/**
 * 作者：杨松
 * 日期：2018/7/5 13:56
 */
class SecondActivity : Activity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.act_second)


        findViewById<Button>(R.id.to_next).setOnClickListener{
            val intent = Intent().setClass(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }




}
