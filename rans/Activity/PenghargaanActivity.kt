package com.example.rans.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.rans.Activity.Penghargaan.MenangActivity
import com.example.rans.Activity.Penghargaan.NominasiActivity
import com.example.rans.Activity.Penghargaan.PenerimaActivity
import com.example.rans.R

class PenghargaanActivity : AppCompatActivity() {

    private lateinit var cv_menang : CardView
    private lateinit var cv_nominasi : CardView
    private lateinit var cv_penerima : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_penghargaan)

        cv_menang = findViewById(R.id.cv_menang)
        cv_nominasi = findViewById(R.id.cv_nominasi)
        cv_penerima = findViewById(R.id.cv_penerima)

        SetInitLayout()
    }

    private fun SetInitLayout() {
        cv_menang.setOnClickListener {
            val intent = Intent(this@PenghargaanActivity, MenangActivity::class.java)
            startActivity(intent)
        }

        cv_nominasi.setOnClickListener {
            val intent = Intent(this@PenghargaanActivity, NominasiActivity::class.java)
            startActivity(intent)
        }

        cv_penerima.setOnClickListener {
            val intent = Intent(this@PenghargaanActivity, PenerimaActivity::class.java)
            startActivity(intent)
        }
    }
}