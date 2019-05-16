package com.example.jadwalsholatkotlin.model

import com.google.gson.annotations.SerializedName

data class ResponseTeam(

	@field:SerializedName("sports")
	val sports: List<SportsItem>? = null
)