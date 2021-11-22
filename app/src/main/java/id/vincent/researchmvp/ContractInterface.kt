package id.vincent.researchmvp

import id.vincent.researchmvp.Model.MainActivityModel

interface ContractInterface {
    interface View {
        fun hasilPresenter(data: MainActivityModel)
    }
    interface Presenter {
        fun hitung(inputA1 : Int, inputA2 : Int)
    }
}