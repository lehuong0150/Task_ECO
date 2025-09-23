package com.example.lib_task.Task1
/*
    1. Cú pháp cơ bản của Kotlin
    Biến & Hằng số
    Kiểu dữ liệu (Int, Float, Boolean, String, Char, Double, Long)
    Toán tử (+, -, *, /, %, +=, -=, ==, !=, >, <, &&, ||)
    Ép kiểu (toInt(), toString(), toDouble(),...)
    Chuỗi & String Template ("Hello, $name")
 */
fun main(){
    demoVariable()
    demoDataType()
    demoOperator()
    demoConversion()
    demoStringTemplate()
}
fun demoVariable(){
    //mutable variable
    var name = "Dao Thi My"
    name = "My Dao"
    println("Mutable variable: $name")

    //immutable variable
    val age = 20
    //age = 21  // Error
    println("Immutable variable: $age")
}

fun demoDataType(){
    val intVar: Int = 10
    val floatVar: Float = 10.5f
    val doubleVar: Double = 20.99
    val booleanVar: Boolean = true
    val charVar: Char = 'A'
    val stringVar: String = "Hello, Kotlin!"

    println("Int: $intVar")
    println("Float: $floatVar")
    println("Double: $doubleVar")
    println("Boolean: $booleanVar")
    println("Char: $charVar")
    println("String: $stringVar")
}

fun demoOperator(){
    val a = 10
    val b = 3

    // Arithmetic Operators +,-,*,/,%
    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    // Assignment Operators +=, -=
    var c = 5
    c += 2
    println("c after += 2: $c")
    c -= 1
    println("c after -= 1: $c")

    // Comparison Operators ==, !=, >, <
    println("a == b: ${a == b}")
    println("a != b: ${a != b}")
    println("a > b: ${a > b}")
    println("a < b: ${a < b}")

    // Logical Operators &&, ||
    val x = true
    val y = false
    println("x && y: ${x && y}")
    println("x || y: ${x || y}")
}

fun demoConversion(){
    val intVar: Int = 10
    val doubleVar: Double = intVar.toDouble()
    val stringVar: String = intVar.toString()

    println("Int: $intVar")
    println("Int to Double: $doubleVar")
    println("Int to String: $stringVar")
}

fun demoStringTemplate(){
    val name = "Dao Thi My"
    val age = 20
    println("Hello, my name is $name and I am $age years old.")
}