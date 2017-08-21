package husnul.com.kotlin.MVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*
import husnul.com.kotlin.R

class MainMPVActivity : AppCompatActivity(), PresenterView {

    var presenter : Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

        btnhitung.setOnClickListener {

            presenter?.Hitung(edtnilai1.text.toString(),edtnilai2.text.toString())


        }
    }

    override fun onStart() {
        super.onStart()

        presenter = Presenter(this)
    }
    override fun Hasil(nilai: String) {
        txthasil.text = nilai
     //   TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
