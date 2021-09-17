package com.example.intech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class NewsDetailActivity : AppCompatActivity() {
    private lateinit var imgPicture: ImageView
    private lateinit var tvTitle: TextView
    private lateinit var tvDateAuthor: TextView
    private lateinit var tvDescription: TextView
    private var title: String = "INTECH News"
    private var favorite: Boolean = false

    companion object {
        const val EXTRA_TITLE = "extra title"
        const val EXTRA_DATE_AUTHOR = "extra date author"
        const val EXTRA_DESCRIPTION = "extra description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_INTECH)
        setActionBarTitle(title)
        setContentView(R.layout.activity_news_detail)

        // Adding back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Getting component id
        imgPicture = findViewById(R.id.img_news_picture)
        tvTitle = findViewById(R.id.tv_news_title)
        tvDateAuthor = findViewById(R.id.tv_news_date_author)
        tvDescription = findViewById(R.id.tv_news_description)

        // Receiving image from main activity
        val bundle: Bundle? = intent.extras
        val picResId: Int = bundle?.getInt("resId") ?: 0

        // Receiving data from main intent
        val title = intent.getStringExtra(EXTRA_TITLE)
        val dateAuthor = intent.getStringExtra(EXTRA_DATE_AUTHOR)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        // Assigning to layout component
        imgPicture.setImageResource(picResId)
        tvTitle.text = title
        tvDateAuthor.text = dateAuthor
        tvDescription.text = description
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}