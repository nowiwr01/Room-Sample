package com.nowiwr01.room_sample.utils

import android.util.Log
import com.nowiwr01.room_sample.entity.Address
import com.nowiwr01.room_sample.entity.Cat
import com.nowiwr01.room_sample.entity.Person

class Logger {

    companion object {
        private val TAG = Logger::class.simpleName

        fun displayAddressesInLog(addresses: List<Address?>?) {
            if (addresses == null) {
                return
            }
            for (address in addresses) {
                if (address != null) {
                    Log.d(TAG, "Address street: " + address.state + ", address city: " + address.city + ", address state: " + address.state + ", adress postal code: " + address.postCode)
                }
            }
        }

        fun displayPersonsInLog(persons: List<Person?>?) {
            if (persons == null) {
                return
            }
            for (person in persons) {
                if (person != null) {
                    Log.d(TAG, "Person id: " + person.id + ", person name: " + person.firstName + " " + person.lastName)
                }
            }
        }

        fun displayCatsInLog(cats: List<Cat?>?) {
            if (cats == null) {
                return
            }
            for (cat in cats) {
                if (cat != null) {
                    Log.d(TAG, "Cat id: " + cat.id + ", cat name: " + cat.name + ", cat age: " + cat.age + ", cat owner: " + cat.hoomanId)
                }
            }
        }
    }
}