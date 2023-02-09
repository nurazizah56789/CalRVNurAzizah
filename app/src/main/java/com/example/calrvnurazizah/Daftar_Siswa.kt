package com.example.calrvnurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Daftar_Siswa (private val dataset: ArrayList<DataFoto>):
    RecyclerView.Adapter<Daftar_Siswa.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var DataFoto: ImageView = view.findViewById(R.id.tempatfoto)
        var etNis: TextView= view.findViewById(R.id.texsnis)
        var etNama: TextView= view.findViewById(R.id.textnama)
        var etJurusan: TextView= view.findViewById(R.id.textjurusan)
        var etKelas: TextView= view.findViewById(R.id.textkelas)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate= LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_daftar_siswa,parent,false)
        return ViewHolder(inflate)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val DataFoto=dataset[position]
        holder.DataFoto.setImageResource(DataFoto.foto)
        holder.etNis.text= DataFoto.nis.toString()
        holder.etNama.text= DataFoto.nama
        holder.etJurusan.text= DataFoto.jurusan
        holder.etKelas.text= DataFoto.kelas

    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}
