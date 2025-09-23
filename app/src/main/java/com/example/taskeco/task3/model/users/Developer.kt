package com.example.taskeco.task3.model.users

import com.example.taskeco.task3.model.Identifiable
import com.example.taskeco.task3.demo.LanguageEnum
import com.example.taskeco.task3.demo.RoleSealClass

class Developer(
    id: String,
    name: String,
    email: String,
    phone: String,
    address: String,
    private val language: LanguageEnum
) :
    Employee(id, name, email, phone, address,type= RoleSealClass.Developer(language)),
    Identifiable {
}