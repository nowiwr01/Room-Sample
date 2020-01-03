package com.nowiwr01.room_sample.entity

import android.graphics.Bitmap
import androidx.room.*

@Entity(tableName = "person")
data class Person(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    @ColumnInfo(name = "first_name")
    var firstName: String,
    @ColumnInfo (name = "last_name")
    var lastName: String,
    @Ignore
    var picture: Bitmap?,
    @Embedded
    var address: Address?
) {
    constructor() : this(0, "", "", null, null)
}