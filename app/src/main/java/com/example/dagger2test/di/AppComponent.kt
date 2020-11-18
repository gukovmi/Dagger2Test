package com.example.dagger2test.di

import com.example.dagger2test.MainActivity
import com.example.dagger2test.modules.CarModule
import dagger.Component


@Component(modules = [CarModule::class])
interface AppComponent {
    //    fun getCar(): Car
//    fun getEngine(): Engine
//    fun getFuel(): Fuel
    fun injectsMainActivity(mainActivity: MainActivity)
}