package com.example.registroalumnos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registroalumnos.database.Alumnos
import com.example.registroalumnos.database.Dao
import com.example.registroalumnos.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //tengo que hacer que añada un alumno a la tabla
        binding.bAnyadir.setOnClickListener {
            
        }
    }
}