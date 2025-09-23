package com.example.taskeco.task2

import com.example.taskeco.task2.extensions.isPalindrome

/*
    4. Hàm & Extension Function
        Hàm thông thường
        Hàm một dòng
        Default Parameter & Named Argument
        Extension Function
 */
fun main() {
    demoFunction()
    demoOneLineFunction()
    demoDefaultParameter()
    demoNamedArgument()
    demoExtensionFunction()
}

//Hàm thông thường
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun demoFunction() {
    val result = sum(10, 20)
    println("Sum = $result")
}

//Hàm một dòng
fun divide(a: Int, b: Int) = a.toDouble() / b
fun demoOneLineFunction() {
    val result = divide(15, 10)
    println("Divide = $result")
}

//Default Parameter
fun notification(name: String, message: String = " you have a new message.") {
    println("$name, $message!")
}

fun demoDefaultParameter() {
    notification("My") //gọi bằng default parameter
}

//Named Argument
fun greet(name: String, message: String = "Xin chào") {
    println("$message, $name!")
}

fun demoNamedArgument() {
    greet(message = "Chào mừng", name = "Hạnh") //gọi bằng named argument
}

//Extension function
fun demoExtensionFunction() {
    println("madam".isPalindrome()) //true
    println("hello".isPalindrome()) //false
}

