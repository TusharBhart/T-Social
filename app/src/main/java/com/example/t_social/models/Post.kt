package com.example.t_social.models

data class Post(
    val text0: String="",
    val text: String="",
    val createdBy: User= User(),
    val createdAt: Long=0L,
    val likedBy: ArrayList<String> = ArrayList()
)