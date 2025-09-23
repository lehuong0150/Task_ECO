package com.example.taskeco.task2.models.vehicles

import com.example.taskeco.task2.models.Drivable


class Car(
    name: String? = null,
    speed: Int? = null,
    var seats: Int? = null
) :
    Vehicle(name, speed), Drivable {
    fun honk() = println("$name says: Beep beep!")
    override fun start() {
        TODO("Not yet implemented")
    }

    override fun drive() {
        println("Drive by car!!")
    }
}
