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
fun demoHigherFunction() {
    println("List Developer: ")
    val developerList = filterEmployees(getList(Employee::class)) {
        it.type is RoleSealClass.Developer
    }
    println(developerList)

    println("List Tester: ")
    val testerList = filterEmployees(getList(Employee::class)) {
        it.type is RoleSealClass.Tester
    }
    println(testerList)
}

//lambda expression
fun demoLambdaExpression() {
    val employees = getList(Employee::class)

    // lấy tên nhân viên
    val names = employees.map { it.name }
    println("Employee Names: $names")

    //  đếm số Developer
    val devCount = employees.count { it.type is RoleSealClass.Developer }
    println("Number of Developers: $devCount")

    //  dem so nhan vien theo role
    val countByRole: (List<Employee>) -> Map<RoleSealClass, Int> =
        { list -> list.groupingBy { it.type }.eachCount() }
    println(countByRole(employees))
}