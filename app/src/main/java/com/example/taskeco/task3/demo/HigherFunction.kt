package com.example.taskeco.task3.demo

import com.example.taskeco.task3.model.users.Employee

//higher function
fun filterEmployees(
    employeeList: MutableList<Employee>,
    condition: (Employee) -> Boolean
): List<Employee> {
    return employeeList.filter(condition)
}

//demo higherFunction
fun demoHigherFunction(){
    println("List Developer: ")
    val developerList = filterEmployees(getList(Employee::class)){
            it.type is RoleSealClass.Developer
    }
    println(developerList)

    println("List Tester: ")
    val testerList = filterEmployees(getList(Employee:: class)){
             it.type is RoleSealClass.Tester
    }
    println(testerList)
}
