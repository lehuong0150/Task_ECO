package com.example.taskeco.task3.model.users

import com.example.taskeco.task3.demo.RoleSealClass
import com.example.taskeco.task3.model.address.Address

class Tester(
    id: String,
    name: String,
    email: String,
    phone: String,
    address: Address,
    private val workStatus: Boolean
) : Employee(id, name, email, phone, address, type = RoleSealClass.Tester(workStatus)) {

}