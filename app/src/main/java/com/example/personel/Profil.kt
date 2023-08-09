package com.example.personel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personel.databinding.ActivityProfilBinding

class Profil : AppCompatActivity() {
    private lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProfilBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}