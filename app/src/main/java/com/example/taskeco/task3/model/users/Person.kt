package com.example.taskeco.task3.model.users

abstract class Person(
    private val id: String,
    protected val name: String,
    val email:String,
    open val phone:String
) {
    val getId = id
    abstract fun getRole(): String
}
