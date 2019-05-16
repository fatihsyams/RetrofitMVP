package com.example.jadwalsholatkotlin

import com.example.jadwalsholatkotlin.model.ResponseTeam
import com.example.jadwalsholatkotlin.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter (model : MainInterface.View) : MainInterface.Presenter{


    var view : MainInterface.View = model

    override fun getDataTeams() {
        val apiInterface = ApiClient.create()
        apiInterface.getData().enqueue(object : Callback<ResponseTeam> {
            override fun onResponse(call: Call<ResponseTeam>, response: Response<ResponseTeam>) {
                val responseTeam = response.body()
                view.showData(responseTeam?.sports!!)
            }

            override fun onFailure(call: Call<ResponseTeam>, t: Throwable) {

            }

        })
    }
}