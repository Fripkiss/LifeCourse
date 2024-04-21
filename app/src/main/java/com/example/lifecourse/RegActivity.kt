package com.example.lifecourse

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val emailInput: TextView = findViewById(R.id.email)
        val fullNameInput: TextView = findViewById(R.id.fullname)
        val birthInput: TextView = findViewById(R.id.birthday)
        val studyPlaceInput: TextView = findViewById(R.id.study_place)
        val facultyInput: TextView = findViewById(R.id.faculty)
        val groupInput: TextView = findViewById(R.id.group)
        val passInput: TextView = findViewById(R.id.create_password)


        emailInput.setOnClickListener{
            emailInput.setText("")
        }

        fullNameInput.setOnClickListener{
            fullNameInput.setText("")
        }

        birthInput.setOnClickListener{
            birthInput.setText("")
        }

        studyPlaceInput.setOnClickListener{
            studyPlaceInput.setText("")
        }

        facultyInput.setOnClickListener{
            facultyInput.setText("")
        }

        groupInput.setOnClickListener{
            groupInput.setText("")
        }

        passInput.setOnClickListener{
            passInput.setText("")
        }


    }
}