package com.example.taskeco.task3

import com.example.taskeco.task3.database.EmployeeDB
import com.example.taskeco.task3.demo.demoHigherFunction
import com.example.taskeco.task3.demo.getList
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager


fun main(){
    EmployeeDB.initData()

    //ung dung KotlinReflection
    println("List Manager: ")
    val managerList = getList(Manager::class)
    println(managerList)

    println("List Employee: ")
    val employeeList = getList(Employee::class)
    println(employeeList)

    demoHigherFunction()
}


