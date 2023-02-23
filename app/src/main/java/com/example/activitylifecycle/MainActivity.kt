package com.example.activitylifecycle

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1: Button = findViewById(R.id.start_second_activity_button)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.start_dialog_activity_button)
        button2.setOnClickListener {
            val data = "hello"
            val intent = Intent(this, DialogActivity::class.java)
            intent.putExtra("extra_data", data)
            startActivity(intent)
        }
        lifecycle.addObserver(MyObserver(tag))
    }
}
