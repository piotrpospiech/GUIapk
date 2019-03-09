package com.example.androidlab1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.Gravity
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val wrongInput = "Wrong username or password"
    private val inProgress = "Work in progress"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val signInButton = findViewById<Button>(R.id.signInButton)
        val continueTextView = findViewById<TextView>(R.id.continueTextView)
        val forgotTextView = findViewById<TextView>(R.id.forgotTextView)


        signInButton.setOnClickListener { 
            val toast = Toast.makeText(this, wrongInput, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 32)
            toast.show()
        }

        forgotTextView.setOnClickListener {
            val toast = Toast.makeText(this, inProgress, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 32)
            toast.show()
        }

        continueTextView.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
