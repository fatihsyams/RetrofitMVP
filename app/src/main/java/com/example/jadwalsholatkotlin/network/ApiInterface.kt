package com.example.jadwalsholatkotlin.network

import com.example.jadwalsholatkotlin.model.ResponseTeam
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("api/v1/json/1/all_sports.php")
    fun getData() : Call<ResponseTeam>
}