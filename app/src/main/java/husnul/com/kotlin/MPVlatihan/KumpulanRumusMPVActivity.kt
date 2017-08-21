package husnul.com.kotlin.MPVlatihan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import husnul.com.kotlin.MainActivity
import kotlinx.android.synthetic.main.activity_kumpulan_rumus_mpv.*
import husnul.com.kotlin.R

class KumpulanRumusMPVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kumpulan_rumus_mpv)

        btnsegitiga.setOnClickListener {
            var intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnpersegi.setOnClickListener {
            var intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }
        btnpersegipanjang.setOnClickListener {
            var intent = Intent(this, PersegiPanjangActivity::class.java)
            startActivity(intent)
        }

    }
}
