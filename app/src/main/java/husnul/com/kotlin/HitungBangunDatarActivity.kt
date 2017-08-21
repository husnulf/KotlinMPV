package husnul.com.kotlin

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import husnul.com.kotlin.MPVlatihan.KumpulanRumusMPVActivity
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

class HitungBangunDatarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

        btnpindah?.setOnClickListener {
            var intent = Intent(this,KumpulanRumusMPVActivity::class.java)
//            intent.putExtra("nilai1",edtnilai1?.toString())
//            intent.putExtra("nilai2",edtnilai2?.toString())
//            intent.putExtra("nilai3",txthasil?.toString())
            startActivity(intent)

        }

        // ? supaya memastikan null atau ada nilai
        btnhitung?.setOnClickListener {

            var nilai1 = edtnilai1?.text.toString()
            var nilai2 = edtnilai2?.text.toString()

            if (nilai1.isNotEmpty() && nilai2.isNotEmpty()){
                //convert dari string ke double
                var x = nilai1.toDouble()
                var y = nilai2.toDouble()

                //kalkulasi
                var hasil = (x * y)/2

                //pindahin ke textView
                txthasil?.text = hasil.toString()

//                txthasil?.setText("Hasil nya " + hasil)
            }
            else{
                //deklarasi variabel alertDialog
//                var alert = AlertDialog.Builder(this)
//                alert.setMessage("Jangan Kosong")
//                .setIcon(R.mipmap.ic_launcher)
//                .setPositiveButton("yes", DialogInterface.OnClickListener { dialog, i ->
//                    dialog.dismiss()
//                })
//                alert.show()
                Toast.makeText(this,"Jangan Kosong",Toast.LENGTH_LONG).show()

            }

        }


    }
}
