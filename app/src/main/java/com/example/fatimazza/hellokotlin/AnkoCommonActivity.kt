package com.example.fatimazza.hellokotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.example.fatimazza.hellokotlin.R.color.colorAccent
import org.jetbrains.anko.*
import org.jetbrains.anko.design.snackbar
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
                    onClick { toast("Hello, ${name.text} !") }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Alert") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {
                        alert("Happy Coding!", "Hello, ${name.text}") {
                            yesButton { toast("Yesss!!") }
                            noButton {  }
                        }.show()
                    }
                }.lparams(width = matchParent){
                    topMargin = dip(5)
                }

                button("Show Selector") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick {
                        // val club = listOf("Barcelona", "Real Madrid", "Bayern Munchen", "Liverpool")
                        val club = resources.getTextArray(R.array.club_name).toList()
                        selector("Hello ${name.text} what football club you like?", club) {
                            _,i -> toast("So you like ${club[i]} ..")
                        }
                    }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Snackbar") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick { snackbar(name, "Hello , ${name.text}!") }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Show Progress Bar") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick { indeterminateProgressDialog("Hello, ${name.text}, please wait...").show() }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }

                button("Go To Other Activity") {
                    backgroundColor = ContextCompat.getColor(context, colorAccent)
                    textColor = Color.WHITE
                    onClick { startActivity<AnkoCommonIntentActivity>("name" to "${name.text}") }
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }
            }
        }
    }

}
