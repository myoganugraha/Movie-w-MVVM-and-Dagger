package com.myoganugraha.moviedatabase.services

import com.myoganugraha.moviedatabase.models.DiscoverMovieResponse
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DiscoverService {
    @GET("3/discover/movie?language=en-US&sort_by=popularity.desc")
    suspend fun fetchDiscoverMovie(@Query("page") page: Int) : ApiResponse<DiscoverMovieResponse>
}