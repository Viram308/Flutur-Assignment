package com.example.viram.assignment

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class keyboard : AppCompatActivity() {
    var a: Button? = null
    var b: Button? = null
    var c: Button? = null
    var d: Button? = null
    var e: Button? = null
    var f: Button? = null
    var g: Button? = null
    var h: Button? = null
    var i: Button? = null
    var j: Button? = null
    var k: Button? = null
    var l: Button? = null
    var m: Button? = null
    var n: Button? = null
    var o: Button? = null
    var p: Button? = null
    var q: Button? = null
    var r: Button? = null
    var s: Button? = null
    var t: Button? = null
    var u: Button? = null
    var v: Button? = null
    var w: Button? = null
    var x: Button? = null
    var y: Button? = null
    var z: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyboard)
        a=findViewById(R.id.a)
        b=findViewById(R.id.b)
        c=findViewById(R.id.c)
        d=findViewById(R.id.d)
        e=findViewById(R.id.e)
        f=findViewById(R.id.f)
        g=findViewById(R.id.g)
        h=findViewById(R.id.h)
        i=findViewById(R.id.i)
        j=findViewById(R.id.j)
        k=findViewById(R.id.k)
        l=findViewById(R.id.l)
        m=findViewById(R.id.m)
        n=findViewById(R.id.n)
        o=findViewById(R.id.o)
        p=findViewById(R.id.p)
        q=findViewById(R.id.q)
        r=findViewById(R.id.r)
        s=findViewById(R.id.s)
        t=findViewById(R.id.t)
        u=findViewById(R.id.u)
        v=findViewById(R.id.v)
        w=findViewById(R.id.w)
        x=findViewById(R.id.x)
        y=findViewById(R.id.y)
        z=findViewById(R.id.z)
        a?.setOnClickListener({
            Log.d("A","A")
            Toast.makeText(this,"A",Toast.LENGTH_SHORT).show()
        })
        b?.setOnClickListener({
            Log.d("B","B")
            Toast.makeText(this,"B",Toast.LENGTH_SHORT).show()
        })
        c?.setOnClickListener({
            Log.d("C","C")
            Toast.makeText(this,"C",Toast.LENGTH_SHORT).show()
        })
        d?.setOnClickListener({
            Log.d("D","D")
            Toast.makeText(this,"D",Toast.LENGTH_SHORT).show()
        })
        e?.setOnClickListener({
            Log.d("E","E")
            Toast.makeText(this,"E",Toast.LENGTH_SHORT).show()
        })
        f?.setOnClickListener({
            Log.d("F","F")
            Toast.makeText(this,"F",Toast.LENGTH_SHORT).show()
        })
        g?.setOnClickListener({
            Log.d("G","G")
            Toast.makeText(this,"G",Toast.LENGTH_SHORT).show()
        })
        h?.setOnClickListener({
            Log.d("H","H")
            Toast.makeText(this,"H",Toast.LENGTH_SHORT).show()
        })
        i?.setOnClickListener({
            Log.d("I","I")
            Toast.makeText(this,"I",Toast.LENGTH_SHORT).show()
        })
        j?.setOnClickListener({
            Log.d("J","J")
            Toast.makeText(this,"J",Toast.LENGTH_SHORT).show()
        })
        k?.setOnClickListener({
            Log.d("K","K")
            Toast.makeText(this,"K",Toast.LENGTH_SHORT).show()
        })
        l?.setOnClickListener({
            Log.d("L","L")
            Toast.makeText(this,"L",Toast.LENGTH_SHORT).show()
        })
        m?.setOnClickListener({
            Log.d("M","M")
            Toast.makeText(this,"M",Toast.LENGTH_SHORT).show()
        })
        n?.setOnClickListener({
            Log.d("N","N")
            Toast.makeText(this,"N",Toast.LENGTH_SHORT).show()
        })
        o?.setOnClickListener({
            Log.d("O","O")
            Toast.makeText(this,"O",Toast.LENGTH_SHORT).show()
        })
        p?.setOnClickListener({
            Log.d("P","P")
            Toast.makeText(this,"P",Toast.LENGTH_SHORT).show()
        })
        q?.setOnClickListener({
            Log.d("Q","Q")
            Toast.makeText(this,"Q",Toast.LENGTH_SHORT).show()
        })
        r?.setOnClickListener({
            Log.d("R","R")
            Toast.makeText(this,"R",Toast.LENGTH_SHORT).show()
        })
        s?.setOnClickListener({
            Log.d("S","S")
            Toast.makeText(this,"S",Toast.LENGTH_SHORT).show()
        })
        t?.setOnClickListener({
            Log.d("T","T")
            Toast.makeText(this,"T",Toast.LENGTH_SHORT).show()
        })
        u?.setOnClickListener({
            Log.d("U","U")
            Toast.makeText(this,"U",Toast.LENGTH_SHORT).show()
        })
        v?.setOnClickListener({
            Log.d("V","V")
            Toast.makeText(this,"V",Toast.LENGTH_SHORT).show()
        })
        w?.setOnClickListener({
            Log.d("W","W")
            Toast.makeText(this,"W",Toast.LENGTH_SHORT).show()
        })
        x?.setOnClickListener({
            Log.d("X","X")
            Toast.makeText(this,"X",Toast.LENGTH_SHORT).show()
        })
        y?.setOnClickListener({
            Log.d("Y","Y")
            Toast.makeText(this,"Y",Toast.LENGTH_SHORT).show()
        })
        z?.setOnClickListener({
            Log.d("Z","Z")
            Toast.makeText(this,"Z",Toast.LENGTH_SHORT).show()
        })

    }



    override fun onBackPressed() {
        super.onBackPressed()

    }
}
