package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class AnkoListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoListActivityUI().setContentView(this)
    }

    class AnkoListActivityUI : AnkoComponent<AnkoListActivity> {
        override fun createView(ui: AnkoContext<AnkoListActivity>) = with(ui) {
            verticalLayout {
                padding = dip(16)
            }
        }
    }

}
