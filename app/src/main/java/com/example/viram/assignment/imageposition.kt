package com.example.viram.assignment

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout.LayoutParams
import com.example.viram.assignment.R
import android.R.attr.data
import android.content.ClipData
import android.os.PersistableBundle
import android.util.Log
import android.view.View.DragShadowBuilder
import android.view.View.OnTouchListener
import android.view.DragEvent
import android.view.View.OnDragListener
import android.webkit.WebChromeClient
import android.widget.TextView
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.widget.Toast


class imageposition : AppCompatActivity() {

    var img: ImageView? = null
    var xCoOrdinate: Float? = null
    var yCoOrdinate: Float? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageposition)
        img = findViewById<ImageView>(R.id.image)
        img?.setOnTouchListener(OnTouchListener { view, event ->
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    xCoOrdinate = view.x - event.rawX
                    yCoOrdinate = view.y - event.rawY
                    val locations = IntArray(2)
                    img?.getLocationOnScreen(locations)
                    val x = locations[0]
                    val y = locations[1]
                    Log.d("p", "position is " + x + "," + y)
                }
                MotionEvent.ACTION_MOVE -> {
                    view.animate().x(event.rawX + xCoOrdinate as Float).y(event.rawY + yCoOrdinate as Float).setDuration(0).start()
                    val locations = IntArray(2)
                    img?.getLocationOnScreen(locations)
                    val x = locations[0]
                    val y = locations[1]
                    Log.d("p", "position is " + x + "," + y)
                }
                else -> return@OnTouchListener false
            }
            true
        })


    }

}
