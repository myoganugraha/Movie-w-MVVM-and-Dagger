package com.myoganugraha.moviedatabase.models.entities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


@Parcelize
data class MovieEntity(
    val id: Int,
    var adult: Boolean,
    var title:String,
    @SerializedName("backdrop_path")
    var backdropPath: String,
    @SerializedName("genre_ids")
    var genreIds: List<Int>,
    @SerializedName("original_title")
    var originalTitle: String,
    @SerializedName("poster_path")
    var posterPath: String,
    @SerializedName("vote_average")
    var voteAverage: Float,
) : Parcelable
