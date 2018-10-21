package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class AnkoCommonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoCommonActivityUI().setContentView(this)
    }

    class AnkoCommonActivityUI : AnkoComponent<AnkoCommonActivity> {
        override fun createView(ui: AnkoContext<AnkoCommonActivity>) = with(ui) {
            verticalLayout {
                padding = dip(16)
            }
        }
    }

}
