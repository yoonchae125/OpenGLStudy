package com.example.myopengl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn_triangle:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_triangle = findViewById(R.id.btn_triangle)

        var triangleIntent = Intent(this,HelloTriangleActivity::class.java)
        btn_triangle.setOnClickListener { startActivity(triangleIntent) }
    }
}
