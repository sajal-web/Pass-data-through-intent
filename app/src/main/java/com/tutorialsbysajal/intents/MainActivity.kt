package com.tutorialsbysajal.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var pass_data = findViewById<Button>(R.id.pass_data)

    }

    fun PassData(view: View) {
        var input_name = findViewById<EditText>(R.id.input_name)
        var name = input_name.editableText.toString()
        val intent = Intent(this, newActivity::class.java)
        intent.putExtra(newActivity.NAME_EXTRA, name)
        startActivity(intent)
    }
}