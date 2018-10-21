package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.setContentView

class AnkoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoActivityUI().setContentView(this)
    }

    class AnkoActivityUI() : AnkoComponent<AnkoActivity> {
        override fun createView(ui: AnkoContext<AnkoActivity>): View {
            TODO("not implemented")
            //To change body of created functions use File | Settings | File Templates.
        }
    }
}
