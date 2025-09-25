package com.example.taskeco.task3.model.users

abstract class Person(
    val id: String,
    val name: String,
    val email: String,
    val phone: String
) {
    val getId = id
    abstract fun getRole(): String
}
