package com.example.uvg_horario.Login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView

import com.example.uvg_horario.R
import com.example.uvg_horario.Principal.menu_principal

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val create_ac = findViewById<View>(R.id.textView3) as TextView
        val spannableString = SpannableString(create_ac.text)
        spannableString.setSpan(UnderlineSpan(), 0, spannableString.length, 0)
        create_ac.text = spannableString
    }

    protected fun ayuwoki(view: View) {
        val intent = Intent(applicationContext, menu_principal::class.java)
        startActivity(intent)
    }
}
