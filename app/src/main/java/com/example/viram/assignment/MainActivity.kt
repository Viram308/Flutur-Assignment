package com.example.viram.assignment

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var keyboard: Button?=null
    var image: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        keyboard=findViewById(R.id.first)
        image=findViewById(R.id.second)
        keyboard?.setOnClickListener({
            var p=Intent(this@MainActivity, com.example.viram.assignment.keyboard::class.java)
            startActivity(p)
        })
        image?.setOnClickListener({
            var p1=Intent(this@MainActivity, com.example.viram.assignment.imageposition::class.java)
            startActivity(p1)
        })
    }


}