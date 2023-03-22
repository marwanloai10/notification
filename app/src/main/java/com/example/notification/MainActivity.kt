package com.example.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.notification.databinding.ActivityMainBinding
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding// يستخدم الفيو بايندق
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        FirebaseMessaging.getInstance().token.addOnCompleteListener {
             Log.d("token", it.result.toString())
        }
    }
}
/// مرفق سكرين شوت