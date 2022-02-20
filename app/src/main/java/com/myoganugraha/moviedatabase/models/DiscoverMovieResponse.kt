package com.myoganugraha.moviedatabase.models

import com.google.gson.annotations.SerializedName
import com.myoganugraha.moviedatabase.models.entities.MovieEntity

data class DiscoverMovieResponse(
    val page: Int,
    val result: List<MovieEntity>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int,
)
