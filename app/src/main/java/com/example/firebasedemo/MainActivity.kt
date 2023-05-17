package com.example.firebasedemo

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var auth: FirebaseAuth
        auth = Firebase.auth

        val name = findViewById<EditText>(R.id.username).text
        val password =  findViewById<EditText>(R.id.password).text

        val btn = findViewById<Button>(R.id.submitBTN)

        btn.setOnClickListener()
        {
            Log.i(TAG, "$name $password")
        }

    }
}