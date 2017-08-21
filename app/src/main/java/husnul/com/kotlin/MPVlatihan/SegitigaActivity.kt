package husnul.com.kotlin.MPVlatihan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import husnul.com.kotlin.MVP.Presenter
import husnul.com.kotlin.MVP.PresenterView
import kotlinx.android.synthetic.main.activity_segitiga.*
import husnul.com.kotlin.R
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

class SegitigaActivity : AppCompatActivity(), PresenterViewRumus{


    var presenter : PresenterRumus? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        btnhasil.setOnClickListener {
            presenter?.Segitiga(edtsegitiga1.text.toString(),edtsegitiga2.text.toString())

        }
        presenter = PresenterRumus(this)
    }
    override fun Hasil(nilai: String) {
        txthasilsegitiga.text = nilai
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
