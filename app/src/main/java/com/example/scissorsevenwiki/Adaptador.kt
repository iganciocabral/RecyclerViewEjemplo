package com.example.scissorsevenwiki

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adaptador(private var lista: ArrayList<Personaje>,private var contexto: Context): RecyclerView.Adapter<Adaptador.viewHolder>() {

    class viewHolder(vista: View, contexto: Context) : RecyclerView.ViewHolder(vista)
    {
        val textView: TextView //es el gadget de la vista
        val imagenPj: ImageView //es el gadget de la vista

        init {
            textView = vista.findViewById(R.id.elpTvNombre)
            imagenPj = vista.findViewById(R.id.elpIvPersonaje)
        }


        /*fun bind(personaje: Personaje)
        {
            /*vista..elpIvPeronsaje.setImageResource(personaje.idImagen)*/
        }*/
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista_personaje, parent,false), contexto)
    }

    override fun onBindViewHolder(viewHolder: viewHolder, position: Int) {
          //holder.bind(lista[position])
        viewHolder.textView.text = lista[position].nombre
        viewHolder.imagenPj.setImageResource(lista[position].idImagen)

    }

    override fun getItemCount(): Int {
        return lista.size
    }

}