package com.bitfitprivatelimited.androidcomponents

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val model = ViewModelProviders.of(this).get(MyActivityViewModal::class.java!!)
        val myRandomNumber = model.getNumber()
        val mTextView = findViewById<TextView>(R.id.textview_random_numbers)
        mTextView.text = "Number is : $myRandomNumber"
        Log.i(TAG, "Random Number Set")
    }
}
