package com.fearaujo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Images(

	@field:JsonProperty("normal")
	val normal: String? = null,

	@field:JsonProperty("hidpi")
	val hidpi: String? = null,

	@field:JsonProperty("teaser")
	val teaser: String? = null
)