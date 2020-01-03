package com.nowiwr01.room_sample.dao

import androidx.room.*
import com.nowiwr01.room_sample.entity.Person


@Dao
interface PersonDao {
    @Insert
    fun insert(vararg person: Person?)

    @Update
    fun update(vararg person: Person?)

    @Query("DELETE FROM person")
    fun delete()

    @Query("Select * FROM Person")
    fun loadAll(): List<Person?>?
}