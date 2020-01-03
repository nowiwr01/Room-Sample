package com.nowiwr01.room_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nowiwr01.room_sample.database.AppDataBase
import com.nowiwr01.room_sample.utils.DataGenerator
import com.nowiwr01.room_sample.utils.Logger


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = AppDataBase.getAppDatabase(this)!!

        database.catDao.delete()
        database.personDao.delete()
        database.addressDao.delete()

        DataGenerator.with(database)!!.generatePeople()
        DataGenerator.with(database)!!.generateCats()

        Logger.displayAddressesInLog(database.addressDao.loadAll())
        Logger.displayPersonsInLog(database.personDao.loadAll())
        Logger.displayCatsInLog(database.catDao.loadAll())
    }
}
