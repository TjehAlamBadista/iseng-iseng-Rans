package com.example.rans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.rans.Activity.PenghargaanActivity
import com.example.rans.Activity.PenghasilanActivity
import com.example.rans.Activity.ProdukActivity
import com.example.rans.Activity.SejarahActivity

class MainActivity : AppCompatActivity() {

    private lateinit var cv_sejarah : CardView
    private lateinit var cv_produk : CardView
    private lateinit var cv_penghargaan : CardView
    private lateinit var cv_penghasilan : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cv_sejarah = findViewById(R.id.cv_sejarah)
        cv_produk = findViewById(R.id.cv_produk)
        cv_penghargaan = findViewById(R.id.cv_penghargaan)
        cv_penghasilan = findViewById(R.id.cv_penghasilan)

        setInitLayout()
    }

    private fun setInitLayout() {
        cv_sejarah.setOnClickListener {
            val intent = Intent(this@MainActivity, SejarahActivity::class.java)
            startActivity(intent)
        }

        cv_produk.setOnClickListener {
            val intent = Intent(this@MainActivity, ProdukActivity::class.java)
            startActivity(intent)
        }

        cv_penghargaan.setOnClickListener {
            val intent = Intent(this@MainActivity, PenghargaanActivity::class.java)
            startActivity(intent)
        }

        cv_penghasilan.setOnClickListener {
            val intent = Intent(this@MainActivity, PenghasilanActivity::class.java)
            startActivity(intent)
        }
    }
}