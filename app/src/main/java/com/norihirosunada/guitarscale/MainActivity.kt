package com.norihirosunada.guitarscale

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val cChords = arrayOf("C", "Dm", "Em", "F", "G", "Am", "Bm♭5")
    val imageResourceIds = intArrayOf(R.drawable.c, R.drawable.dm, R.drawable.em, R.drawable.f, R.drawable.g, R.drawable.am, R.drawable.bmb5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons = arrayOf(button, button2, button3, button4, button5, button6, button7)

        for ((index, button) in buttons.withIndex()){
            button.text = cChords[index]
            button.setOnClickListener {
                chordName.text = cChords[index]
                imageView.setImageResource(imageResourceIds[index])
            }
        }


    }
}
