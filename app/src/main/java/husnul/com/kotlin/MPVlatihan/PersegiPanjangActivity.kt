package husnul.com.kotlin.MPVlatihan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import husnul.com.kotlin.R
import kotlinx.android.synthetic.main.activity_persegi_panjang.*
import kotlinx.android.synthetic.main.activity_segitiga.*

class PersegiPanjangActivity : AppCompatActivity(), PresenterViewRumus {
    override fun Hasil(nilai: String) {
        txthasilpersegipanjang.text = nilai
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var presenter : PresenterRumus? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        btnpersegipanjang.setOnClickListener {
            presenter?.PersegiPanjang(edtpersegipanjang1.text.toString(),edtpersegipanjang2.text.toString())
        }
        presenter = PresenterRumus(this)
    }
}
