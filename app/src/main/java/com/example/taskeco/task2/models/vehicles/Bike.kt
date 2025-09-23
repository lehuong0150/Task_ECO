package com.example.taskeco.task2.models.vehicles

import com.example.taskeco.task2.models.Drivable


class Bike(
    name: String? = null,
    speed: Int? = null
) : Vehicle(name, speed), Drivable {
    fun ringBell() = println("$name says: Ring ring!")
    override fun start() {
        TODO("Not yet implemented")
    }

    override fun drive() {
        println("I go to by bike!!!")
    }
}