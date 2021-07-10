package ru.geekbrains.mymvp

interface MainView {
    fun setCounterOneText(index: Int, text: String)
    fun setCounterTwoText(index: Int, text: String)
    fun setCounterThreeText(index: Int, text: String)
}