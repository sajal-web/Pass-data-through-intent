package com.tutorialsbysajal.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class newActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA ="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val name = intent.getStringExtra(NAME_EXTRA)
        val get_name = findViewById<TextView>(R.id.get_name)
        get_name.setText(name)
    }
}