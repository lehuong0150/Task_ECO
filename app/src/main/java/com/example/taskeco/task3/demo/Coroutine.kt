package com.example.taskeco.task3.demo

import com.example.taskeco.task3.database.EmployeeDB.employeeList
import com.example.taskeco.task3.database.EmployeeDB.managerList
import com.example.taskeco.task3.extension.findById
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.Scanner
import kotlin.system.measureTimeMillis

//8. Coroutine (Lập trình bất đồng bộ)
//Suspend Function (suspend fun fetchData())
//Launch & Async & WithContext
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
suspend fun demoSuspendFunction() {
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
suspend fun demoAsync() = coroutineScope {
    val listTime = measureTimeMillis {
        val employeeList = async { getListEmployee() }
        val managerList = async { getListManager() }
        println("All people in office:\n ----Employee--- \n${employeeList.await()} \n ----Manager----\n ${managerList.await()}")
    }
    println("Completed in $listTime ms") // > 3000ms
}

//with context
suspend fun demoWithContext() = coroutineScope {
    println("Run start: ${Thread.currentThread().name}")

    val listTime = measureTimeMillis {
        val employeeList = withContext(Dispatchers.IO) { getListEmployee() }
        val managerList = withContext(Dispatchers.IO) { getListManager() }
        println("All people in office:\n ----Employee--- \n$employeeList \n ----Manager----\n $managerList")
    }
    println("Completed in $listTime ms") // > 5000ms
    println("Run end: ${Thread.currentThread().name}")
}

suspend fun getListEmployee(): MutableList<Employee> {
    delay(3000L)
    println("Run getListEmployee: ${Thread.currentThread().name}")
    return getList(Employee::class)
}

suspend fun getListManager(): MutableList<Manager> {
    delay(2000L)
    println("Run getManagerEmployee: ${Thread.currentThread().name}")
    return getList(Manager::class)
}

//GlobalScope
suspend fun demoGlobalScope() = coroutineScope {
    val managerFirst = getList(Manager::class).first()
    val request = launch {
        GlobalScope.launch {
            delay(500L)
            println("Manager first: $managerFirst")
        }
        launch {
            delay(100L)
            println("Name of manager first: ${managerFirst.name}")
            delay(500L)
            println("Number people in team of manager first: ${managerFirst.teamSize}")
        }
    }

    delay(200L)
    request.cancel()
    delay(1000L)
    println("Complete task!!!!")
}

//CoroutineScope
suspend fun demoCoroutineScope() = coroutineScope {
    launch {
        delay(200L)
        val managerFirst = getList(Manager::class).first()
        println("Manager first: $managerFirst")
    }

    coroutineScope {
        launch {
            delay(500L)
            val developerFirst = filterEmployees(getList(Employee::class)) {
                it.type is RoleSealClass.Developer
            }.first()
            println("Developer first: $developerFirst")
        }
        delay(100L)
        val testerFirst = filterEmployees(getList(Employee::class)) {
            it.type is RoleSealClass.Tester
        }.first()
        println("Tester first: $testerFirst")
    }
    println("Complete task!!!!")
}

//Dispatchers.IO
suspend fun demoDispatchersIO() = coroutineScope {
    // theo doi cac thread da su dung
    val threads = hashMapOf<Long, String>()

    val job = launch(Dispatchers.IO) {
        repeat(1000) {
            launch {
                // Lưu thread
                threads[Thread.currentThread().id] = Thread.currentThread().name
                // Mô phỏng gọi mạng
                delay(1_000)
            }
        }
    }

    val job2 = GlobalScope.launch {
        val timeMs = measureTimeMillis {
            job.join() // chờ job chính xong
        }
        println("Took ${threads.keys.size} threads and $timeMs ms.")
    }
    delay(500L)
    job2.join()
}

suspend fun main() {

    println("---------------Demo Suspend Function and Launch--------------")
    demoSuspendFunction()

    println("---------------Demo Async--------------")
    demoAsync()

    println("---------------Demo WithContext--------------")
    demoWithContext()

    println("---------------Demo CoroutineScope--------------")
    demoCoroutineScope()

    println("---------------Demo GlobalScope--------------")
    demoGlobalScope()

    println("---------------Demo Dispatchers IO----------------")
    demoDispatchersIO()
}

