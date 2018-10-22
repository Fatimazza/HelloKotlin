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

    private lateinit var textName: TextView
    private lateinit var textDesc: TextView
    private lateinit var ivImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getIntentExtras()
        DetailActivityUI().setContentView(this)
        loadIntentExtras()
    }

    private fun getIntentExtras() {
        val intent = intent
        name = intent.getStringExtra("name")
        description = intent.getStringExtra("desc")
        image = intent.getIntExtra("img", 0)
    }

    private fun loadIntentExtras() {
        textName.text = name
        textDesc.text = description
        ivImage.setImageResource(image)
    }

    class DetailActivityUI: AnkoComponent<DetailActivity> {

        override fun createView(ui: AnkoContext<DetailActivity>) = with(ui) {
            verticalLayout {
                gravity = CENTER_HORIZONTAL
                padding = dip(16)

                owner.ivImage = imageView()
                        .lparams(width = dip(80), height = dip(80))

                owner.textName = textView()
                        .lparams(wrapContent) {
                            topMargin = dip(5)
                        }


                owner.textDesc = textView()
                        .lparams(matchParent) {
                            topMargin = dip(10)
                        }
            }
        }
    }

}

