package com.example.registroalumnos

import android.os.Bundle
import com.example.registroalumnos.databinding.ActivityUpdateBinding

class UpdateActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_update)
        val binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //tengo que hacer que actualice el alumno
        binding.bActualizar.setOnClickListener {

        }
    }
}