package com.example.registroalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registroalumnos.databinding.ActivityDeleteBinding
import com.example.registroalumnos.databinding.ActivityMainBinding

class DeleteActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_delete)
        val binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //tengo que hacer que borre al alumno
        binding.bEliminar.setOnClickListener {

        }
    }
}