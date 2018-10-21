package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER_HORIZONTAL
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    var name: String = ""
    var description: String = ""
    lateinit var textName: TextView
    lateinit var textDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getIntentExtras()
        createLayout()

        textName.text = name
        textDesc.text = description
    }

    private fun getIntentExtras() {
        val intent = intent
        name = intent.getStringExtra("name")
        description = intent.getStringExtra("desc")
    }

    private fun createLayout() {
        verticalLayout {
            gravity = CENTER_HORIZONTAL
            padding = dip(16)

            imageView(R.drawable.img_barca)
                    .lparams(width = dip(80), height = dip(80))

            textName = textView()
                    .lparams(wrapContent) {
                        topMargin = dip(5)
                    }


            textDesc = textView()
                    .lparams(matchParent) {
                        topMargin = dip(10)
                    }
        }
    }

}

