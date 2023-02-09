package com.example.calrvnurazizah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //variabel recycler
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.listdata)
        var data = ArrayList<DataFoto>()
        data.add(DataFoto(R.drawable.gambar_1,"20.5390","Fika Mariska","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_2,"20.5390","Fika Mariska","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_3,"20.5408","Nur Afifa","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_4,"20.5395","Khotijatuz Zahro","Rekasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_5,"20.5395","Khotijatuz Zahro","Rekasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_6,"20.5442","Nur Azizah","Rekasa Perangka6t Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_7,"20.5417","Anggita Eka Damayanti","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_8,"20.5426","Indi Fanni Risqiana","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_9,"20.5447","Tasya Zaki Arifatun Nisa","Rekayasa Perangkat Lunak","XII RPL 2"))
        data.add(DataFoto(R.drawable.gambar_10,"20.5421","Delli Isna Putri","Rekayasa Perangkat Lunak","XII RPL 2"))

        //menambahkan data kedalam Adapter
        recyclerAdapter = Daftar_Siswa(data)
        //menambahkan layout manager
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //memanggil adapter
        recyclerView.adapter = recyclerAdapter
        //menampilkan data kelayout
        recyclerView.layoutManager = layoutManager
    }
}