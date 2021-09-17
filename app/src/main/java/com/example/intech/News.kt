package com.example.intech

data class News(
    var picture: Int = 0,
    var title: String,
    var date_author: String,
    var description: String,
    var isFavorite: Boolean
)