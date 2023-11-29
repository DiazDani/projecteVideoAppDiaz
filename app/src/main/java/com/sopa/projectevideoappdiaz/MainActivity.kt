package com.sopa.projectevideoappdiaz

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sopa.projectevideoappdiaz.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        Socket.setSocket()
        Socket.connection()

        val mSocket = Socket.getSocket()
        val code = binding.editTextText.text

        binding.button.setOnClickListener{
            Toast.makeText(this,"funca",Toast.LENGTH_SHORT).show()
            mSocket.emit("EnviarCodiPeli", code.toString())

        }
    }

}