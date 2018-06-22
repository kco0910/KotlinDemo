package com.fly.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Fj on 2018/6/21.
 */
class MainActivity :AppCompatActivity() {
    private var tvName:TextView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun click(view:View){
        tvName?.setText("hello world")

         Toast.makeText(this,tvName?.text,Toast.LENGTH_LONG).show()
    }


}