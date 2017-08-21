package husnul.com.kotlin.MPVlatihan

import husnul.com.kotlin.MVP.PresenterView

/**
 * Created by Husnul on 21/08/2017.
 */
class PresenterRumus {
    var presenterView: PresenterViewRumus? = null

    constructor(presenterView: PresenterViewRumus?) {
        this.presenterView = presenterView
    }

    fun Segitiga(nilai1: String, nilai2: String) {

        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //convert dari string ke double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //kalkulasi
            var rumus = (x * y) / 2

            presenterView?.Hasil(rumus.toString())

        } else {

        }


    }
    fun Persegi(nilai1: String, nilai2: String) {

        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //convert dari string ke double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //kalkulasi
            var rumus = (x * y)

            presenterView?.Hasil(rumus.toString())

        } else {
        }
    }
    fun PersegiPanjang(nilai1: String, nilai2: String) {

        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {
            //convert dari string ke double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()

            //kalkulasi
            var rumus = (x * y)

            presenterView?.Hasil(rumus.toString())

        } else {
        }
    }
}