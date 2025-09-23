package com.example.taskeco.task3.model.users

import com.example.taskeco.task3.model.Identifiable
import com.example.taskeco.task3.model.Workable
import com.example.taskeco.task3.demo.RoleSealClass

open class Employee(
    override var id: String,
    name: String,
    email: String,
    phone: String,
    private val address: String,
    internal val type: RoleSealClass
) : Person(id, name, email, phone), Workable, Identifiable {
    override fun getRole(): String {
        return "Employee"
    }

    override fun work() {
        TODO("Not yet implemented")
    }

    private fun describe() = when (type) {
        is RoleSealClass.Developer -> "$name is a Developer coding in ${type.language}"
        is RoleSealClass.Tester -> {
            if (type.workStatus) {
                "$name has finished testing the task!"
            } else {
                "$name has not finished testing the task yet!"
            }
        }
        else -> "Not found type!!!!"
    }

    override fun toString(): String {
        return "Id: $id, Name: $name, Email: $email, Phone: $phone, Address: $address, Describe: ${describe()} \n"
    }
}