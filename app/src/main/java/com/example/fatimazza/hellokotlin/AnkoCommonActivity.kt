package com.example.fatimazza.hellokotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.fatimazza.hellokotlin.R.color.colorAccent
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class AnkoCommonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoCommonActivityUI().setContentView(this)
    }

    class AnkoCommonActivityUI : AnkoComponent<AnkoCommonActivity> {
        override fun createView(ui: AnkoContext<AnkoCommonActivity>) = with(ui) {
            verticalLayout {
                padding = dip(16)

                val name = editText{
                    hint = "What's your name?"
                }

                button("Say Hello") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Alert") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }

                button("Show Selector") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Snackbar") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Progress Bar") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Go To Other Activity") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {  }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }
            }
        }
    }

}
