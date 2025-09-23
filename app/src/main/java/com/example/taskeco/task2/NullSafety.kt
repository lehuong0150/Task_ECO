package com.example.taskeco.task2

import com.example.taskeco.task2.models.vehicles.Car


/*
    5. Null Safety (An toàn với null)
        Nullable (?) và Non-nullable
        Elvis Operator (?:)
        Safe Call (?.)
        Not-null Assertion (!!)
 */
fun main() {
    demoNullSafetyCar()
}

fun demoNullSafetyCar() {

    var car: Car? = Car("Toyota", 100, 4)

    // Safe Call (?.)
    println("Car name length (safe call): ${car?.name?.length}")

    // Elvis Operator (?:)
    val seats = car?.seats ?: -1
    println("Car seats: $seats")

    // Not-null Assertion (!!)
    val speed = car!!.speed!!   // ép buộc non-null
    println("Car speed: $speed")

    // Nullable Car
    car = null
    println("Nullable car safe call: ${car?.name}") // sẽ in null, không crash
}

