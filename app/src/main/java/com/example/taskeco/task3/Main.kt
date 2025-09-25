package com.example.taskeco.task3

import com.example.taskeco.task3.demo.demoDomainSpecificLanguage
import com.example.taskeco.task3.demo.demoGenerics
import com.example.taskeco.task3.demo.demoHigherFunction
import com.example.taskeco.task3.demo.demoInline
import com.example.taskeco.task3.demo.demoKotlinReflection
import com.example.taskeco.task3.demo.demoLambdaExpression


fun main() {

    println("\n--------- Demo HigherFunction----------")
    demoHigherFunction()

    println("\n--------- Demo Lambda Expression---------")
    demoLambdaExpression()

    println("\n--------- Demo KotlinReflection---------- ")
    demoKotlinReflection()

    println("\n--------- Demo Generics---------- ")
    demoGenerics()

    println("\n--------- Demo Inline--------------")
    demoInline()

    println("\n--------- Demo Domain Specific Language-------------")
    demoDomainSpecificLanguage()

}


