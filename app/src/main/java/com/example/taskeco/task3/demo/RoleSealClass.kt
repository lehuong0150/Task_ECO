package com.example.taskeco.task3.demo


sealed class RoleSealClass {
    data class Developer(val language: LanguageEnum) : RoleSealClass()
    data class Tester(val workStatus: Boolean) : RoleSealClass()
}