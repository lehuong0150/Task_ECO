package com.example.lib_task.Task1

/*
    2. Cấu trúc điều kiện và vòng lặp
    If - Else
    When (Thay thế switch-case trong Java)
    For Loop (for (i in 1..10) { }) (có bao nhiêu loại for)
    While & Do-While Loop
    ...
 */
fun main() {
    demoCondition()
    demoWhen()
    demoLoop()
    demoWhile()
    demoNestedLoop()
}

fun demoCondition() {
    val a = 30
    val b = 20
    //If - Else
    if (a > b) {
        println("$a lon hon $b")
    } else if (a == b) {
        println("$a bang $b")
    } else {
        println("$a nho hon $b")
    }
    //If - Else trong 1 dòng
    val max = if (a > b) a else b
    println("Max = $max")

    //If - Else if - Else trong 1 dòng
    val min = if (a < b) a else if (a == b) 0 else b
    println("Min = $min")
}

fun demoWhen() {
    val day = 3
    //When
    when (day) {
        1 -> println("Hom nay la thu 2")
        2 -> println("Hom nay la thu 3")
        3 -> println("Hom nay la thu 4")
        4 -> println("Hom nay la thu 5")
        5 -> println("Hom nay la thu 6")
        6 -> println("Hom nay la thu 7")
        7 -> println("Hom nay la chu nhat")
        else -> println("Khong biet hom nay la thu may")
    }

    //When thay the if-else if-else
    val time = 14
    val greeting = when (time) {
        in 0..11 -> "Chao buoi sang"
        in 12..17 -> "Chao buoi chieu"
        in 18..23 -> "Chao buoi toi"
        else -> "Gio khong hop le"
    }
    println(greeting)
    //When and else
    val a:Int = 5
    val result = when {
        a % 2 == 0 -> "a la so chan"
        a % 2 != 0 -> "a la so le"
        else -> "Khong biet a la so gi"
    }
    println(result)
}

fun demoLoop() {
    //For Loop
    println("For Loop tang dan:")
    for (i in 1..5) {
        print("$i ")
    }
    println("\nFor Loop giam dan:")
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println("\nFor Loop bo qua 1 so:")
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println("\nFor Loop reverse:")
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    println("\nFor Loop qua mang:")
    val arr = arrayOf("A", "B", "C", "D")
    for (item in arr) {
        print("$item ")
    }
    println("\nFor Loop qua list:")
    val list = listOf(1, 2, 3, 4, 5)
    for (item in list) {
        print("$item ")
    }
    println("\nFor Loop qua range:")
    val range = 1..5
    for (item in range) {
        print("$item ")
    }

    //for each
    println("\nFor Each qua list:")
    list.forEach { print("$it ") }
    println("\nFor Each qua array:")
    arr.forEach { print("$it ") }
}

fun demoWhile() {
    //While Loop
    println("\nWhile Loop:")
    var i = 1
    while (i <= 5) {
        print("$i ")
        i++
    }

    //Do-While Loop
    println("\nDo-While Loop:")
    var j = 1
    do {
        print("$j ")
        j++
    } while (j <= 5)

    //break and continue
    println("\nBreak and Continue in For Loop:")
    for (k in 1..10) {
        if (k == 5) {
            println("\nBreak at k = $k")
            break
        }
        if (k % 2 == 0) {
            continue //bo qua so chan
        }
        print("$k ")
    }
    println("\nBreak and Continue in While Loop:")
    var m = 1
    while (m <= 10) {
        if (m == 5) {
            println("\nBreak at m = $m")
            break
        }
        if (m % 2 == 0) {
            m++
            continue //bo qua so chan
        }
        print("$m ")
        m++
    }
}

fun demoNestedLoop() {
    println("\nNested Loop:")
    for (i in 1..3) {
        for (j in 1..3) {
            print("($i,$j) ")
        }
        println()
    }
}
