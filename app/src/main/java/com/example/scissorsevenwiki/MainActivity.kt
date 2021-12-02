package com.example.scissorsevenwiki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.JdkConstants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.amRvPersonajes)
        var datos = generarDatosPruebas()
        val concatAdapter = Adaptador(datos, this)
        recycler.adapter = concatAdapter

        recycler.layoutManager = LinearLayoutManager(this)
    }

    private fun generarDatosPruebas(): ArrayList<Personaje>
    {
      var lista = ArrayList<Personaje>()
        lista.add(Personaje(R.drawable.thirteen, nombre = "Thirteen "))
        lista.add(Personaje(R.drawable.seven01, nombre = "Seven"))
        lista.add(Personaje(R.drawable.daibo, nombre = "Dai_Bo"))
        lista.add(Personaje(R.drawable.thirteen, nombre = "Thirteen "))
        lista.add(Personaje(R.drawable.seven01, nombre = "Seven"))
        lista.add(Personaje(R.drawable.daibo, nombre = "Dai_Bo"))
        lista.add(Personaje(R.drawable.thirteen, nombre = "Thirteen "))
        lista.add(Personaje(R.drawable.seven01, nombre = "Seven"))
        lista.add(Personaje(R.drawable.daibo, nombre = "Dai_Bo"))
        lista.add(Personaje(R.drawable.thirteen, nombre = "Thirteen "))
        lista.add(Personaje(R.drawable.seven01, nombre = "Seven"))
        lista.add(Personaje(R.drawable.daibo, nombre = "Dai_Bo"))

        return  lista
    }
}