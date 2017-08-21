package husnul.com.kotlin.MPVlatihan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_persegi.*
import husnul.com.kotlin.R

class PersegiActivity : AppCompatActivity(), PresenterViewRumus {


    var presenter : PresenterRumus? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        btnhasilpersegi.setOnClickListener {
            presenter?.Persegi(edtpersegi1.text.toString(),edtpersegi2.text.toString())

        }
        presenter = PresenterRumus(this)
    }
    override fun Hasil(nilai: String) {
        txthasilpersegi.text = nilai
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
