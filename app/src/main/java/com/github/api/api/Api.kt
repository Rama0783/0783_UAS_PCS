package com.github.api.api

import com.github.api.data.model.DetailUserResponse
import com.github.api.data.model.User
import com.github.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token a1367cc461f476b222b5cfdb4300bcadea2f0d3e")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token a1367cc461f476b222b5cfdb4300bcadea2f0d3e")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token a1367cc461f476b222b5cfdb4300bcadea2f0d3e")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token a1367cc461f476b222b5cfdb4300bcadea2f0d3e")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}