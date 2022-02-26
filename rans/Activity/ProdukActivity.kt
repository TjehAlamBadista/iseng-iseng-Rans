package com.example.rans.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.rans.Activity.Produk.*
import com.example.rans.R

class ProdukActivity : AppCompatActivity() {

    private lateinit var cv_video : CardView
    private lateinit var cv_musik : CardView
    private lateinit var cv_kuliner : CardView
    private lateinit var cv_perjalanan : CardView
    private lateinit var cv_hiburan : CardView
    private lateinit var cv_siniar : CardView
    private lateinit var cv_produksi : CardView
    private lateinit var cv_agama : CardView
    private lateinit var cv_ransCilegon : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk)

        cv_video = findViewById(R.id.cv_video)
        cv_musik = findViewById(R.id.cv_musik)
        cv_kuliner = findViewById(R.id.cv_kuliner)
        cv_perjalanan = findViewById(R.id.cv_perjalanan)
        cv_hiburan = findViewById(R.id.cv_hiburan)
        cv_siniar = findViewById(R.id.cv_siniar)
        cv_produksi = findViewById(R.id.cv_produksi)
        cv_agama = findViewById(R.id.cv_agama)
        cv_ransCilegon = findViewById(R.id.cv_ransCilegon)

        setInitLayout()
    }

    private fun setInitLayout() {
        cv_video.setOnClickListener {
            val intent = Intent(this@ProdukActivity, VideoActivity::class.java)
            startActivity(intent)
        }

        cv_musik.setOnClickListener {
            val intent = Intent(this@ProdukActivity, MusicActivity::class.java)
            startActivity(intent)
        }

        cv_kuliner.setOnClickListener {
            val intent = Intent(this@ProdukActivity, KulinerActivity::class.java)
            startActivity(intent)
        }

        cv_perjalanan.setOnClickListener {
            val intent = Intent(this@ProdukActivity, PerjalananActivity::class.java)
            startActivity(intent)
        }

        cv_hiburan.setOnClickListener {
            val intent = Intent(this@ProdukActivity, HiburanActivity::class.java)
            startActivity(intent)
        }

        cv_siniar.setOnClickListener {
            val intent = Intent(this@ProdukActivity, SiniarActivity::class.java)
            startActivity(intent)
        }

        cv_produksi.setOnClickListener {
            val intent = Intent(this@ProdukActivity, ProduksiActivity::class.java)
            startActivity(intent)
        }

        cv_agama.setOnClickListener {
            val intent = Intent(this@ProdukActivity, AgamaActivity::class.java)
            startActivity(intent)
        }

        cv_ransCilegon.setOnClickListener {
            val intent = Intent(this@ProdukActivity, RansCilegonActivity::class.java)
            startActivity(intent)
        }
    }
}