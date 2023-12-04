package com.example.registroalumnos.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

interface Dao {
    @Query("SELECT * FROM alumnos WHERE nombre like :nombre")
    fun obtenerAlumnoPorNombre(nombre:String): Alumnos

    @Insert
    fun insertarAlumno(alumno: Alumnos)

    @Delete
    fun borrarAlumno(alumno: Alumnos)

    @Update
    fun actualizarAlumno(alumno: Alumnos)
}