package com.paktalin.petfinder.model

data class Pet(
    val id: Long,
    val name: String,
    val description: String?,
    val pictureUrl: String?,
    val type: String,
    val gender: Gender,
)

enum class Gender {
    FEMALE, MALE, UNKNOWN
}

