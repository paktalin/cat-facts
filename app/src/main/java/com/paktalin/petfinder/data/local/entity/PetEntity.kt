package com.paktalin.petfinder.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PetEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val primaryPhotoSmall: String?,
)
