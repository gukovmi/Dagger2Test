package com.example.dagger2test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger2test.models.Car
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        App.component.injectsMainActivity(this)

        carTextView.text = car.engine.fuel.fuelType
    }
}