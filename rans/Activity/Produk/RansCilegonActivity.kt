package com.example.rans.Activity.Produk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.rans.Activity.Produk.RansCilegon.PemainActivity
import com.example.rans.Activity.Produk.RansCilegon.SejarahRansCilegonActivity
import com.example.rans.Activity.Produk.RansCilegon.StadionActivity
import com.example.rans.Activity.Produk.RansCilegon.TataKelolaActivity
import com.example.rans.Activity.SejarahActivity
import com.example.rans.R

class RansCilegonActivity : AppCompatActivity() {

    private lateinit var cv_sejarah_rans_cilegon : CardView
    private lateinit var cv_stadion : CardView
    private lateinit var cv_pemain : CardView
    private lateinit var cv_tataKelola : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rans_cilegon)

        cv_sejarah_rans_cilegon = findViewById(R.id.cv_sejarah_rans_cilegon)
        cv_stadion = findViewById(R.id.cv_stadion_rans)
        cv_pemain = findViewById(R.id.cv_pemain_rans)
        cv_tataKelola = findViewById(R.id.cv_tataKelola_rans)

        setInitLayout()
    }

    private fun setInitLayout() {
        cv_sejarah_rans_cilegon.setOnClickListener {
            val intent = Intent(this@RansCilegonActivity, SejarahRansCilegonActivity::class.java)
            startActivity(intent)
        }

        cv_stadion.setOnClickListener {
            val intent = Intent(this@RansCilegonActivity, StadionActivity::class.java)
            startActivity(intent)
        }

        cv_pemain.setOnClickListener {
            val intent = Intent(this@RansCilegonActivity, PemainActivity::class.java)
            startActivity(intent)
        }

        cv_tataKelola.setOnClickListener {
            val intent = Intent(this@RansCilegonActivity, TataKelolaActivity::class.java)
            startActivity(intent)
        }
    }
}