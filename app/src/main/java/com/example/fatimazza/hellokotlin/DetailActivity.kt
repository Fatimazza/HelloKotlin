package com.example.fatimazza.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity.CENTER_HORIZONTAL
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    var name: String = ""
    var description: String = ""
    var image: Int = R.drawable.img_barca
    lateinit var textName: TextView
    lateinit var textDesc: TextView
    lateinit var ivImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getIntentExtras()
        createLayout()

        textName.text = name
        textDesc.text = description
        ivImage.setImageResource(image)
    }

    private fun getIntentExtras() {
        val intent = intent
        name = intent.getStringExtra("name")
        description = intent.getStringExtra("desc")
        image = intent.getIntExtra("img", 0)
    }

    private fun createLayout() {
        verticalLayout {
            gravity = CENTER_HORIZONTAL
            padding = dip(16)

            ivImage = imageView()
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

