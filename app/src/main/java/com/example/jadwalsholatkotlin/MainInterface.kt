package com.example.jadwalsholatkotlin

import com.example.jadwalsholatkotlin.model.SportsItem

interface MainInterface {
    interface View {
        fun showData(data: List<SportsItem>)
    }
    interface Presenter {
        fun getDataTeams()
    }
}