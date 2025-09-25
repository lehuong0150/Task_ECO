package com.example.taskeco.task3.demo

import com.example.taskeco.task3.model.users.Employee

inline fun countNumberEmployee(employee: Employee, action: (Employee) -> Unit) {
    action(employee)
}

fun demoInline() {
    val employeeList = getList(Employee::class)
    println(employeeList)
    var countTester = 0
    var countDeveloper = 0
    for (item in employeeList) {
        countNumberEmployee(item) {
            if (item.type is RoleSealClass.Tester) {
                countTester += 1
            } else {
                countDeveloper += 1
            }
        }
    }
    println("Number employee is tester: $countTester")
    println("Number employee is developer: $countDeveloper")
}