package com.example.jadwalsholatkotlin.model

import com.google.gson.annotations.SerializedName

data class SportsItem(

	@field:SerializedName("idSport")
	val idSport: String? = null,

	@field:SerializedName("strSport")
	val strSport: String? = null,

	@field:SerializedName("strSportThumb")
	val strSportThumb: String? = null,

	@field:SerializedName("strSportDescription")
	val strSportDescription: String? = null
)