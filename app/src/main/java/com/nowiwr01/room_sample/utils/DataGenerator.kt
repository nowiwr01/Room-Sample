package com.nowiwr01.room_sample.utils

import com.nowiwr01.room_sample.database.AppDataBase
import com.nowiwr01.room_sample.entity.Address
import com.nowiwr01.room_sample.entity.Cat
import com.nowiwr01.room_sample.entity.Person

class DataGenerator {

    companion object {
        private var dataBase: AppDataBase? = null
        private var instance: DataGenerator? = null

        fun with(appDataBase: AppDataBase): DataGenerator? {
            if (dataBase == null) {
                dataBase = appDataBase
            }
            if (instance == null) {
                instance = DataGenerator()
            }
            return instance
        }
    }

    fun generateCats() {
        if (dataBase == null) {
            return
        }
        dataBase!!.catDao.insert(
            Cat(1, "Tony", 3, 1),
            Cat(2, "Tiger", 1, 1),
            Cat(3, "Misty", 2, 2),
            Cat(4, "Oscar", 5, 3),
            Cat(5, "Puss", 4, 4)
        )
    }

    fun generatePeople() {
        if (dataBase == null) {
            return
        }
        dataBase!!.personDao.insert(
            personInstance(1, "Husayn", "Hakeem"),
            personInstance(2, "Afafe", "Mokhtari"),
            personInstance(3, "Abderrahmane", "Bachiri"),
            personInstance(4, "Jalal", "Khaldouni")
        )
    }

    private fun personInstance(id: Int, firstName: String, lastName: String): Person {
        val address = Address(id, "Some street name", "Some state", "Some city", 19421)
        dataBase!!.addressDao.insert(address)
        return Person(id, firstName, lastName, null, address)
    }
}