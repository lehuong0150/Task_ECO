package com.example.taskeco

import com.example.taskeco.task2.models.vehicles.Bike
import com.example.taskeco.task2.models.vehicles.Car

data class Person(var name: String = "", var age: Int = 0)
fun main(){
    demoLet()
    demoRun()
    demoWith()
    demoApply()
    demoAlso()
}

fun demoLet() {
    val car: Car? = Car("Toyota", 100, 4)

    // Safe call + let
    car?.let {
        println("Car name: ${it.name}, speed: ${it.speed}, seats: ${it.seats}")
        it.honk()
    }?: println("No bike found!!!")

    // Elvis operator
    val carSpeed = car?.speed ?: 0
    println("Car speed = $carSpeed")

    // Not-null assertion (!!) -> nguy hiểm nếu car null
    val nameLength = car!!.name!!.length
    println("Car name length = $nameLength")
}

fun demoRun() {
    val bike: Bike? = Bike("Yamaha", 60)

    // run + safe call
    val description = bike?.run {
        "Bike(name=$name, speed=$speed)"
    } ?: "No bike found!!"
    println(description)
}

fun demoWith() {
    val car = Car("Honda", 120, 5)

    // with không cần safe call (object chắc chắn non-null)
    with(car) {
        println("Car: $name, Speed: $speed, Seats: $seats")
        honk()
    }
}

fun demoApply() {
    val bike = Bike().apply {
        name = "Trek"
        speed = 25
    }
    println("Bike after apply: name=${bike.name}, speed=${bike.speed}")
}

fun demoAlso() {
    val car = Car("BMW", 200, 2).also {
        println("Created car: ${it.name}, speed=${it.speed}, seats=${it.seats}")
    }
    car.drive()
}