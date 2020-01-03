package com.nowiwr01.room_sample.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nowiwr01.room_sample.dao.AddressDao
import com.nowiwr01.room_sample.dao.CatDao
import com.nowiwr01.room_sample.dao.PersonDao
import com.nowiwr01.room_sample.entity.Address
import com.nowiwr01.room_sample.entity.Cat
import com.nowiwr01.room_sample.entity.Person

@Database(entities = [Person::class, Address::class, Cat::class], version = 2, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {

    abstract val catDao: CatDao
    abstract val personDao: PersonDao
    abstract val addressDao: AddressDao

    companion object {
        private var instance: AppDataBase? = null

        fun getAppDatabase(context: Context): AppDataBase? {
            if (instance == null) {
                instance = Room.databaseBuilder(context.applicationContext,
                    AppDataBase::class.java,
                    "cat-owners-db")
                    .allowMainThreadQueries()
                    .build()
            }
            return instance
        }
    }
}


