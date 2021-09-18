package com.example.intech

import android.content.Intent
import android.net.Uri
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
    private lateinit var btnFacebook: ImageView
    private lateinit var btnInstagram: ImageView
    private lateinit var btnLinkedin: ImageView
    private lateinit var btnGithub: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Getting component id
        imgPicture = findViewById(R.id.img_about_picture)
        tvName = findViewById(R.id.tv_about_name)
        tvEmail = findViewById(R.id.tv_about_email)
        btnGoBack = findViewById(R.id.btn_go_back)
        btnFacebook = findViewById(R.id.btn_facebook)
        btnInstagram = findViewById(R.id.btn_instagram)
        btnLinkedin = findViewById(R.id.btn_linkedin)
        btnGithub = findViewById(R.id.btn_github)

        // Assign image and value
        imgPicture.setImageResource(R.drawable.andre)
        tvName.text = "KADEK ANDRE SURYANA"
        tvEmail.text = "a014r4053@dicoding.org"

        // Back Button
        btnGoBack.setOnClickListener(this)

        // Social Media Button
        btnFacebook.isClickable = true
        btnFacebook.setOnClickListener(this)
        btnInstagram.isClickable = true
        btnInstagram.setOnClickListener(this)
        btnLinkedin.isClickable = true
        btnLinkedin.setOnClickListener(this)
        btnGithub.isClickable = true
        btnGithub.setOnClickListener(this)
    }

    private fun goToFacebook(id: String) {
        val facebookIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/$id"))
        startActivity(facebookIntent)
    }

    private fun goToInstagram(id: String) {
        val instagramIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/$id"))
        startActivity(instagramIntent)
    }

    private fun goToLinkedin(id: String) {
        val linkedinIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/$id"))
        startActivity(linkedinIntent)
    }

    private fun goToGithub(id: String) {
        val githubIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/$id"))
        startActivity(githubIntent)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_go_back -> {
                // Go back to previous activity
                finish()
            }
            R.id.btn_facebook -> {
                val id = "andresuryana17"
                goToFacebook(id)
            }
            R.id.btn_instagram -> {
                val id = "andresuryana"
                goToInstagram(id)
            }
            R.id.btn_linkedin -> {
                val id = "andresuryana"
                goToLinkedin(id)
            }
            R.id.btn_github -> {
                val id = "AndreSuryana"
                goToGithub(id)
            }
        }
    }
}