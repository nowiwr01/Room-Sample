package com.nowiwr01.room_sample.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Address(

    @PrimaryKey(autoGenerate = true)
    val addressId: Int,

    val street: String,
    val state: String,
    val city: String,

    @ColumnInfo(name = "post_code")
    val postCode: Int
)