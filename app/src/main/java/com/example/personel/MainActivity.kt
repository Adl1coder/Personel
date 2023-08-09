package com.example.personel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.personel.databinding.ActivityMainBinding
import com.example.personel.databinding.ActivityProfilBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var personelListe: ArrayList<Personel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        personelListe = ArrayList()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, personelListe)
        binding.listView.adapter = adapter //

        val aslan = Personel("aslan", "BT", R.drawable.aaa)
        val kedi = Personel("kedi", "temizlik", R.drawable.cccc)
        val köpek = Personel("köpek", "mühendis", R.drawable.kk)

        personelListe.add(aslan)
        personelListe.add(kedi)
        personelListe.add(köpek)

        adapter.notifyDataSetChanged()
    }
}
