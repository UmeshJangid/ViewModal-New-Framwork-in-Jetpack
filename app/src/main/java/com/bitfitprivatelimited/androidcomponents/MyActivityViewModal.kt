package com.bitfitprivatelimited.androidcomponents

import android.arch.lifecycle.ViewModel
import android.util.Log
import java.util.*

/**
 * Created on Android Studio
 * Author: Umesh
 * DATE: 12/17/2018
 * TIME :11:13 AM.
 * DAY: Monday
 * Project: AndroidArchComponents
 * About View Modal:
 * The ViewModel class is designed to store and manage
 * UI-related data in a lifecycle conscious way.
 * The ViewModel class allows data to survive configuration
 * changes such as screen rotations.
 */
class MyActivityViewModal : ViewModel() {
    private val TAG = this.javaClass.simpleName
    private var myRandomNumber: String? = null
    override fun onCleared() {
        super.onCleared()
        Log.e(TAG, "View modal Cleared")
    }

    fun getNumber(): String? {
        Log.i(TAG, "Get number")
        if (myRandomNumber == null) {
            createNumber()
        }
        return myRandomNumber
    }

    private fun createNumber() {
        Log.i(TAG, "Create new number")
        val random = Random()
        myRandomNumber = "Number: " + (random.nextInt(10 - 1) + 1)
    }
}