package ru.upmix.kotlin.ncraftmedia.dto

open class Post(
    val id: Int,
    val login: String,
    val date: String,
    val text: String,
    var likesCount: Int? = 0,
    var commentsCount: Int? = 0,
    var sharesCount: Int? = 0,
    var isSelfLiked: Boolean = false,
    var isSelfCommented: Boolean = false,
    var isSelfShared: Boolean = false

)