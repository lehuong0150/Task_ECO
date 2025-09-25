@file:Suppress("UNCHECKED_CAST")

package com.example.taskeco.task3.demo

import com.example.taskeco.task3.database.EmployeeDB.employeeList
import com.example.taskeco.task3.database.EmployeeDB.managerList
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager
import kotlin.reflect.KClass

//Demo Kotlin Reflection (::class)
fun <T : Any> getList(type: KClass<T>): MutableList<T> {
    return when (type) {
        Employee::class -> {
            employeeList as MutableList<T>
        }

        Manager::class -> {
            managerList as MutableList<T>
        }

        else -> throw IllegalStateException("Not found type!!!!!")
    }
}

fun demoKotlinReflection() {

    println("List Manager: ")
    val managerList = getList(Manager::class)
    println(managerList)

    println("List Employee: ")
    val employeeList = getList(Employee::class)
    println(employeeList)
}