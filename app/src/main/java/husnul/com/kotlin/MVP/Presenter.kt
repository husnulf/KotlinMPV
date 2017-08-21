package husnul.com.kotlin.MVP

import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

/**
 * Created by Husnul on 21/08/2017.
 */
class Presenter {

    var presenterView: PresenterView? = null

    constructor(presenterView: PresenterView?) {
        this.presenterView = presenterView
    }

    fun Hitung(nilai1: String, nilai2: String) {

        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //convert dari string ke double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //kalkulasi
            var hasil = (x * y) / 2

            presenterView?.Hasil(hasil.toString())

            //pindahin ke textView
//                txthasil?.text = hasil.toString()

//            txthasil?.setText("Hasil nya " + hasil)
        } else {
            //deklarasi variabel alertDialog
//                var alert = AlertDialog.Builder(this)
//                alert.setMessage("Jangan Kosong")
//                .setIcon(R.mipmap.ic_launcher)
//                .setPositiveButton("yes", DialogInterface.OnClickListener { dialog, i ->
//                    dialog.dismiss()
//                })
//                alert.show()
//            Toast.Ma(this,"Jangan Kosong", Toast.LENGTH_LONG).show()

        }



        }
    }


