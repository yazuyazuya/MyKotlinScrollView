package com.example.yazuyazuya.mykotlinscrollview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ScrollView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val mParent = ViewGroup.LayoutParams.MATCH_PARENT
        val wContent = ViewGroup.LayoutParams.WRAP_CONTENT

        val scrollView = ScrollView(this)
        scrollView.layoutParams = LinearLayout.LayoutParams(wContent, mParent)

        val textView = TextView(this)
        val imageView = ImageView(this)

        // drawableの画像を指定
        imageView.setImageResource(R.drawable.image2)

        imageView.layoutParams = LinearLayout.LayoutParams(wContent, mParent)

        // ScrollView に View を追加
        scrollView.addView(imageView)

        setContentView(scrollView)

    }
}
