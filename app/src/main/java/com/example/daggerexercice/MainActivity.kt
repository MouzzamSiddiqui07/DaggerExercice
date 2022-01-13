package com.example.daggerexercice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexercice.demo.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //field injection

    @Inject
    lateinit var car : Car


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        car.getCar()


    }
}