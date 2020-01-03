package com.nowiwr01.room_sample.dao

import androidx.room.*
import com.nowiwr01.room_sample.entity.Cat


@Dao
interface CatDao {
    @Insert
    fun insert(vararg cat: Cat?)

    @Update
    fun update(vararg cat: Cat?)

    @Query("DELETE FROM Cat")
    fun delete()

    @Query("SELECT * FROM Cat")
    fun loadAll(): List<Cat?>?

    @Query("SELECT * FROM cat WHERE hooman_id == :owner")
    fun loadAllCatOwners(owner: Int): List<Cat?>?
}