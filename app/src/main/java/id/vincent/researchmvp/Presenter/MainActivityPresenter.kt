package id.vincent.researchmvp.Presenter

import id.vincent.researchmvp.ContractInterface
import id.vincent.researchmvp.MainActivity
import id.vincent.researchmvp.Model.MainActivityModel

class MainActivityPresenter(val view: ContractInterface.View) : ContractInterface.Presenter {

    override fun hitung(inputA1 : Int, inputA2 : Int){
        val hasil = inputA1 * inputA2
        val model = MainActivityModel()
        model.dataHasil = hasil
        view.hasilPresenter(model)
    }
}