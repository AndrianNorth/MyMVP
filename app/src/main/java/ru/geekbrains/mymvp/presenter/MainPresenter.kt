package ru.geekbrains.mymvp.presenter

import ru.geekbrains.mymvp.view.MainView
import ru.geekbrains.mymvp.model.CountersModel

class MainPresenter(val view: MainView) {
    val model = CountersModel()

    fun counterClick(id: Int) {
        when(id){
            0 -> {
                val nextValue = model.next(id)
                view.setCounterOneText(id, nextValue.toString())
            }
            1 -> {
                val nextValue = model.next(id)
                view.setCounterTwoText(id, nextValue.toString())
            }
            2 -> {
                val nextValue = model.next(id)
                view.setCounterThreeText(id, nextValue.toString())
            }
        }
    }
}