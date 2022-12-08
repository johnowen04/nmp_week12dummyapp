package com.ubaya160420016.s160420016_dummyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInvoke.setOnClickListener {
            val intent = Intent()
            intent.apply {
                action = Intent.ACTION_VIEW
                val shareIntent = Intent.createChooser(intent, "Invoke Template")
                startActivity(shareIntent)
            }
        }
    }
}