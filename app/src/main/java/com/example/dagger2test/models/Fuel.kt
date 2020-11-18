package com.example.dagger2test.models


import javax.inject.Inject
import kotlin.random.Random

class Fuel @Inject constructor() {
    val fuelType = if (Random.nextBoolean()) {
        "benzine"
    } else {
        "diesel"
    }
}