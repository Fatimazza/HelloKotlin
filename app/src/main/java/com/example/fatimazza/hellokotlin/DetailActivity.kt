package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER_HORIZONTAL
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DetailActivityUI().setContentView(this)
    }

    class DetailActivityUI : AnkoComponent<DetailActivity> {
        override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
            verticalLayout {
                gravity = CENTER_HORIZONTAL
                padding = dip(16)

                imageView(R.drawable.img_barca)
                        .lparams(width = dip(80), height = dip(80))

                val textName = textView()
                        .lparams(wrapContent) {
                            topMargin = dip(5)
                        }
                textName.text = "FC Name"

                val textDesc = textView()
                        .lparams(matchParent) {
                            topMargin = dip(10)
                        }
                textDesc.text = "Long Description Goes Here Long Description Goes Here " +
                        "Long Description Goes Here Long Description Goes Here " +
                        "Long Description Goes Here Long Description Goes Here " +
                        "Long Description Goes Here Long Description Goes Here "
            }
        }
    }

}
