package com.example.taskeco.task3.demo

import com.example.taskeco.task3.database.EmployeeDB.employeeList
import com.example.taskeco.task3.database.EmployeeDB.managerList
import com.example.taskeco.task3.model.Identifiable
import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager

fun <T : Identifiable> addUniqueItem(list: MutableList<T>, item: T): Boolean {
    return if (list.none { it.id == item.id }) {
        list.add(item)
        true
    } else false
}

fun demoGenerics() {
    val m1 = Manager(
        id = "M004",
        name = "Vu Hai Hung",
        email = "hung10@example.com",
        phone = "0911111111",
        teamSize = 5
    )

    val e1 = Employee(
        id = "E004",
        name = "Huynh Vu Thao Trang",
        email = "tranglt@example.com",
        phone = "0903459989",
        address = address {
            district = "Cau Giay"
            city = "Ha Noi"
            detailAddress {
                stress = "Quan Hoa"
                describe = "No. 235"
            }
        },
        type = RoleSealClass.Developer(LanguageEnum.PYTHON)
    )
    addUniqueItem(managerList, m1)
    addUniqueItem(employeeList, e1)
    println("List Employee after add: \n" + getList(Employee::class))
    println("List Manager after add: \n" + getList(Manager::class))
}