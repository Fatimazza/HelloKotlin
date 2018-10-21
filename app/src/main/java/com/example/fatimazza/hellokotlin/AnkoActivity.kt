package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoActivityUI().setContentView(this)
    }

    class AnkoActivityUI() : AnkoComponent<AnkoActivity> {
        override fun createView(ui: AnkoContext<AnkoActivity>) = with(ui) {
            verticalLayout {
                val name = editText() {
                    hint = "What's your name"
                }
            }
        }
    }
}
