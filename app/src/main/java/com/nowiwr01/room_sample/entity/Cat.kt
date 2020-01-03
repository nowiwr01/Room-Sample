package com.nowiwr01.room_sample.entity

import androidx.room.*

@Entity(
    foreignKeys = [
        ForeignKey(entity = Person::class,
            parentColumns = ["id"],
            childColumns = ["hooman_id"])
    ],
    indices = [Index("hooman_id")]
)
data class Cat(
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    val name: String,
    val age: Int,

    @ColumnInfo(name = "hooman_id")
    val hoomanId: Int
)