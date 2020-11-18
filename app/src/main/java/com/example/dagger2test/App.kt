package com.example.dagger2test

import android.app.Application
import com.example.dagger2test.di.AppComponent
import com.example.dagger2test.di.DaggerAppComponent


class App : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.create()
    }


}