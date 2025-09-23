package com.example.taskeco.task2.models.animals
class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name barks")
    }
}