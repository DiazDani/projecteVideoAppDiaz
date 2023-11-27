package com.sopa.projectevideoappdiaz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sopa.projectevideoappdiaz.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}