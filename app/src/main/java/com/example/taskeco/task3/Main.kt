package com.example.taskeco.task3

import com.example.taskeco.task3.database.EmployeeDB
import com.example.taskeco.task3.database.EmployeeDB.managerList
import com.example.taskeco.task3.demo.addUniqueItem
import com.example.taskeco.task3.demo.demoGenerics
import com.example.taskeco.task3.demo.demoHigherFunction
import com.example.taskeco.task3.demo.demoKotlinReflection
import com.example.taskeco.task3.demo.getList
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager


fun main(){
    EmployeeDB.initData()
    println("--------- Demo HigherFunction---------- ")
    demoHigherFunction()

    println("--------- Demo KotlinReflection---------- ")
    demoKotlinReflection()

    println("--------- Demo Generics---------- ")
    demoGenerics()


}


