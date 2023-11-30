package com.example.registroalumnos

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class ActivityWithMenus : AppCompatActivity() {
    companion object {
        var actividadActual = 0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //relacionamos la clase con el layout del menú que hennos creado
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_aplicacion, menu)

        //desactivar la opción de la actividad en la que estamos
        for (i in 0 until menu?.size()!!){
            if (i == actividadActual) menu?.getItem(i)?.isEnabled = false
            else menu?.getItem(i)?.isEnabled = true
        }

        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.anyadir -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 0;
                startActivity(intent)
                true
            }

            R.id.actualizar -> {
                val intent = Intent(this, UpdateActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 1;
                startActivity(intent)
                true
            }

            R.id.eliminar -> {
                val intent = Intent(this, DeleteActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                actividadActual = 2;
                startActivity(intent)
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}