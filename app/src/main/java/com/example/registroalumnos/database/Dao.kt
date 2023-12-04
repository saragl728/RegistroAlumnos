package com.example.registroalumnos.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface Dao {
    @Query("SELECT * FROM alumnos WHERE nombre like :nombre")
    fun obtenerAlumnoPorNombre(nombre:String): Alumnos

    @Insert
    fun insertarAlumno(nombre:String, apellido:String, curso:String)

    @Delete
    fun borrarAlumno(nombre: String)

    @Update
    fun actualizarAlumno(nombre:String, curso:String)
}