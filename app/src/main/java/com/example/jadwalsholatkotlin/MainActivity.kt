package com.example.jadwalsholatkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.jadwalsholatkotlin.adapter.MainAdapter
import com.example.jadwalsholatkotlin.model.SportsItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface.View {

    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.getDataTeams()
    }

    override fun showData(data: List<SportsItem>) {
        rec_main.adapter = MainAdapter(this, data)
        rec_main.layoutManager = LinearLayoutManager(this)
    }
}
