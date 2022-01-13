package com.example.daggerexercice.demo

import android.util.Log
import javax.inject.Inject


class Engine
{

    @Inject
    constructor()

    fun getEngine()
    {
        Log.d("kkk","Engine is started")
    }
}