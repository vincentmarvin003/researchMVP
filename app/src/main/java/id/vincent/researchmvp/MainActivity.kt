package id.vincent.researchmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import id.vincent.researchmvp.Model.MainActivityModel
import id.vincent.researchmvp.Presenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), ContractInterface.View {
    private var presenter : ContractInterface.Presenter? = null
    private lateinit var tvHasil : TextView
    var angka1 : EditText? = null
    var angka2 : EditText? = null
    private lateinit var btnHitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        angka1 = findViewById(R.id.editTextNumber)
        angka2 = findViewById(R.id.editTextNumber2)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = findViewById(R.id.tvHasil)

        val presenter = MainActivityPresenter(this)

        btnHitung.setOnClickListener {
            val inputA1 = angka1?.text.toString().toInt()
            val inputA2 = angka2?.text.toString().toInt()

            presenter?.hitung(inputA1, inputA2)
        }
    }

    override fun hasilPresenter(data: MainActivityModel) {
        tvHasil.text = data.dataHasil.toString()
    }
}