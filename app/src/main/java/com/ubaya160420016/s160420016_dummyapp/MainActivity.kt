package com.ubaya160420016.s160420016_dummyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQUEST_SELECT_TEMPLATE = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnInvoke.setOnClickListener {
            val intent = Intent()
            intent.apply {
                action = Intent.ACTION_VIEW
                val shareIntent = Intent.createChooser(intent, "Invoke Template")
                startActivityForResult(shareIntent, REQUEST_SELECT_TEMPLATE)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == RESULT_OK) {
            when (requestCode) {
                REQUEST_SELECT_TEMPLATE -> {
                    textView.text = data?.getStringExtra("TEMPLATE")
                }
            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}