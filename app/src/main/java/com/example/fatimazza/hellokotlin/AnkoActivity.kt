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
                padding = dip(16)
                imageView(R.drawable.img_barca)
                        .lparams(width = dip(150), height = dip(150))
                val name = editText() {
                    hint = "What's your name"
                }
                button("Say Hello!")
            }
        }
    }
}
