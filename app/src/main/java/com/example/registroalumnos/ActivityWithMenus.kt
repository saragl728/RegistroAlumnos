package com.example.registroalumnos

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class ActivityWithMenus : AppCompatActivity() {
    companion object{
        var actividadActual = 0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //relacionamos la clase con el layout del menú que hennos creado
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_aplicacion, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}