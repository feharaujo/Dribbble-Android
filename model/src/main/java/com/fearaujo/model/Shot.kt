package com.fearaujo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Shot(

	@field:JsonProperty("likes_count")
	val likesCount: Int? = null,

	@field:JsonProperty("images")
	val images: Images? = null,

	@field:JsonProperty("description")
	val description: String? = null,

	@field:JsonProperty("id")
	val id: String? = null,

	@field:JsonProperty("views_count")
	val viewsCount: Int? = null,

	@field:JsonProperty("title")
	val title: String? = null,

	@field:JsonProperty("buckets_count")
	val bucketsCount: Int? = null,

	@field:JsonProperty("user")
	val user: User? = null
)