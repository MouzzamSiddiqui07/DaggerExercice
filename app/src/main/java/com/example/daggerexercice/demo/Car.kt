package com.example.daggerexercice.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val wheel: Wheel, val engine: Engine) {



    fun getCar()
    {
        engine.getEngine()
        wheel.getWheel()
        Log.d("kkk","Car is running")
    }
}