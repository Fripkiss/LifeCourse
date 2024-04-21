package com.example.lifecourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        val btnToReg: TextView = findViewById(R.id.reg_btn)

        val btnToLog: TextView = findViewById(R.id.log_btn)

        btnToReg.setOnClickListener{
            val intent = Intent(this,RegActivity::class.java )
            startActivity(intent)
        }

            btnToLog.setOnClickListener{
                val intent1 = Intent(this,logActivity::class.java )
                startActivity(intent1)
            }


    }
}