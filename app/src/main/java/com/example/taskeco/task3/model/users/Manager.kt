package com.example.taskeco.task3.model.users

import com.example.taskeco.task3.model.Identifiable

class Manager(
    override var id: String,
    name: String,
    email: String,
    phone: String,
    private val teamSize: Int,
) : Person(id, name, email, phone), Identifiable {
    override fun getRole(): String {
        return "Manager"
    }

    override fun toString(): String {
        return "id: $getId, name: $name, email: $email, phone: $phone, teamSize: $teamSize.\n"
    }
}