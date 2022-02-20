package com.myoganugraha.moviedatabase.models

data class Response(
    val page: Int,
    val results: Any,
    val total_results: Int,
    val total_pages: Int
)
