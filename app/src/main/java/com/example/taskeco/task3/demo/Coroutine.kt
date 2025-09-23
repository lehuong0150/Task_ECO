package com.example.taskeco.task3.demo

import com.example.taskeco.task3.database.EmployeeDB.employeeList
import com.example.taskeco.task3.database.EmployeeDB.managerList
import com.example.taskeco.task3.extension.findById
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Scanner

//8. Coroutine (Lập trình bất đồng bộ)
//Suspend Function (suspend fun fetchData())
//Launch & Async
//Dispatcher (Dispatchers.Main, Dispatchers.IO)
//Scope (GlobalScope, CoroutineScope)

////Suspend Function (suspend fun fetchData())
suspend fun findEmployee(id: String): Employee? {
    delay(400L)
    return employeeList.findById(id)
}

suspend fun findManager(id: String): Manager? {
    delay(200L)
    return managerList.findById(id)
}

//launch
suspend fun demoSuspendFunction(){
    val scanner = Scanner(System.`in`)
    println("Input idEmployee, idManager: ")
    val idEmployee = scanner.nextLine()
    val idManager = scanner.nextLine()
    val finID = coroutineScope {
        launch {
            println("Employee has $idEmployee: ${findEmployee(idEmployee)}")
        }
        launch {
            println("Manager has $idManager : ${findManager(idManager)}")
        }
    }
    finID.join()
    println("Complete!!!!")
}

//async
//Dispatchers.Main
//Dispatchers.IO
//GlobalScope
//CoroutineScope

suspend fun main(){
    demoSuspendFunction()
}

