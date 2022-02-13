package ru.geekbrains.mymvp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.mymvp.presenter.MainPresenter
import ru.geekbrains.mymvp.view.MainView
import ru.geekbrains.mymvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{
            presenter.counterClick(0)
        }
        vb?.btnCounter2?.setOnClickListener{
            presenter.counterClick(1)
        }
        vb?.btnCounter3?.setOnClickListener{
            presenter.counterClick(2)
        }
    }

    override fun setCounterOneText(index: Int, text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setCounterTwoText(index: Int, text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setCounterThreeText(index: Int, text: String) {
        vb?.btnCounter3?.text = text
    }
}

