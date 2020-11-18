package com.example.dagger2test.modules

import com.example.dagger2test.models.Car
import com.example.dagger2test.models.Engine
import com.example.dagger2test.models.Fuel
import dagger.Module
import dagger.Provides

@Module
class CarModule {
    @Provides
    fun provideCar(engine: Engine): Car =
        Car(engine)

    @Provides
    fun provideEngine(fuel: Fuel): Engine =
        Engine(fuel)

    @Provides
    fun provideFuel(): Fuel =
        Fuel()
}