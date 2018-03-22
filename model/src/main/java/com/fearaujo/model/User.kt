package com.fearaujo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class User(

	@field:JsonProperty("likes_count")
	val likesCount: Int? = null,

	@field:JsonProperty("avatar_url")
	val avatarUrl: String? = null,

	@field:JsonProperty("followers_count")
	val followersCount: Int? = null,

	@field:JsonProperty("name")
	val name: String? = null,

	@field:JsonProperty("bio")
	val bio: String? = null,

	@field:JsonProperty("location")
	val location: String? = null,

	@field:JsonProperty("followings_count")
	val followingsCount: Int? = null,

	@field:JsonProperty("username")
	val username: String? = null
)