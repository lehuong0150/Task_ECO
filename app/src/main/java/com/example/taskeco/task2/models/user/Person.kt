package com.example.taskeco.task2.models.user
class Person(var name: String, var age: Int) {
    //Primary Constructor
    init {
        println("Person Created: $name, Age: $age")
    }

    //Secondary Constructor
    constructor(name: String) : this(name, 0) {
        println("Secondary Constructor Called")
    }
}