package com.example.intech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imgPicture: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var btnGoBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Getting component id
        imgPicture = findViewById(R.id.img_about_picture)
        tvName = findViewById(R.id.tv_about_name)
        tvEmail = findViewById(R.id.tv_about_email)
        btnGoBack = findViewById(R.id.btn_go_back)

        // Assign image and value
        imgPicture.setImageResource(R.drawable.andre)
        tvName.text = "KADEK ANDRE SURYANA"
        tvEmail.text = "a014r4053@dicoding.org"

        btnGoBack.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_go_back -> {
                // Go back to previous activity
                finish()
            }
        }
    }
}