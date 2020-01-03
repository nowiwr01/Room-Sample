package com.nowiwr01.room_sample.dao

import androidx.room.*
import com.nowiwr01.room_sample.entity.Address

@Dao
interface AddressDao {
    @Insert
    fun insert(vararg address: Address?)

    @Update
    fun update(vararg address: Address?)

    @Query("DELETE FROM Address")
    fun delete()

    @Query("SELECT * FROM Address")
    fun loadAll(): List<Address?>?
}