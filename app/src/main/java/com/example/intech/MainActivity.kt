package com.example.intech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvNews: RecyclerView
    private var title: String = "INTECH News"
    private var list: ArrayList<News> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_INTECH)
        setActionBarTitle(title)
        setContentView(R.layout.activity_main)

        rvNews = findViewById(R.id.rv_news)
        rvNews.setHasFixedSize(true)

        list.addAll(NewsData.listNews)
        showNewsRecyclerList()
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showNewsRecyclerList() {
        rvNews.layoutManager = LinearLayoutManager(this)
        val newsDataAdapter = NewsDataAdapter(list)
        rvNews.adapter = newsDataAdapter

        newsDataAdapter.setOnNewsClickCallback(object : NewsDataAdapter.OnNewsClickCallback {
            override fun onNewsClicked(data: News) {
                showDetailedNews(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setSelectedAction(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setSelectedAction(selectedAction: Int) {
        when (selectedAction) {
            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    private fun showDetailedNews(news: News) {
        title = "INTECH News"
        val detailNewsIntent = Intent(this@MainActivity, NewsDetailActivity::class.java)

        detailNewsIntent.putExtra("resId", news.picture)
        detailNewsIntent.putExtra(NewsDetailActivity.EXTRA_TITLE, news.title)
        detailNewsIntent.putExtra(NewsDetailActivity.EXTRA_DATE_AUTHOR, news.date_author)
        detailNewsIntent.putExtra(NewsDetailActivity.EXTRA_DESCRIPTION, news.description)
        detailNewsIntent.putExtra(NewsDetailActivity.EXTRA_FAVORITE, news.isFavorite)

        startActivity(detailNewsIntent)
    }
}