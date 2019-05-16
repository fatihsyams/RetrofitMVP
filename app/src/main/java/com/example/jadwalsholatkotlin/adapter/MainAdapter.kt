package com.example.jadwalsholatkotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.jadwalsholatkotlin.R
import com.example.jadwalsholatkotlin.model.SportsItem
import kotlinx.android.synthetic.main.item_team.view.*

class MainAdapter (val context: Context, val result : List<SportsItem>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MainAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_team, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return result.size
    }

    override fun onBindViewHolder(p0: MainAdapter.ViewHolder, p1: Int) {
        p0.bindItems(result[p1])
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        val textTitle = view.tv_teamTitle
        val textDetail = view.tv_teamDetail
        val gambar = view.img_team

        fun bindItems(item : SportsItem) {
            textTitle.text = item.strSport
            textDetail.text = item.strSportDescription
            Glide.with(itemView.context)
                .load(item.strSportThumb)
                .into(gambar)
        }
    }
}