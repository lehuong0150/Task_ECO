package com.example.taskeco.task2

//singleton voi companion object
fun main() {
    demoSingleton()
    demoLazySingleton()
    demoDCLSingleton()
    demoEagerSingleton()
}

class Singleton private constructor() {
    var data: String = "Dao Thi My"

    companion object {
        @Volatile
        private var instance: Singleton? = null
        fun getInstance(): Singleton {
            return instance ?: synchronized(this) {
                instance ?: Singleton().also { instance = it }
            }
        }
    }

    fun showData() {
        println("Singleton instance: $data")
    }
}

fun demoSingleton() {
    val s1 = Singleton.getInstance()
    s1.data = "Dao Thi My"
    s1.showData()
    val s2 = Singleton.getInstance()
    println("Are s1 and s2 the same instance? ${s1 === s2}")
}

//lazy singleton
class LazySingleton private constructor() {
    var data: String = "Dao Thi My"
    fun showData() {
        println("Name: $data")
    }

    companion object {
        val instance: LazySingleton by lazy { LazySingleton() }
    }
}

fun demoLazySingleton() {
    val lazy1 = LazySingleton.instance
    lazy1.data = "Vu Hong Hanh"
    lazy1.showData()
    val lazy2 = LazySingleton.instance
    lazy2.data = "Nguyen Van Long"
    println("Are lazy1 and lazy2 the same instance? ${lazy1 === lazy2}")
}

//double checked locking singleton
class dclSingleton private constructor() {
    var data: String = "Dao Thi My"
    fun showData() {
        println("Name: $data")
    }

    companion object {
        @Volatile
        private var INSTANCE: dclSingleton? = null
        fun getInstance(): dclSingleton {
            return INSTANCE ?: synchronized(this) {
                val instance = dclSingleton()
                INSTANCE = instance
                instance
            }
        }
    }
}

fun demoDCLSingleton() {
    val dcl1 = dclSingleton.getInstance()
    dcl1.data = "Le Huong"
    dcl1.showData()
    val dcl2 = dclSingleton.getInstance()
    println("Are dcl1 and dcl2 the same instance? ${dcl1 === dcl2}")
}

//eager singleton
object eagerSingleton {
    var data: String = "Dao Thi My"
    fun showData() {
        println("Name: $data")
    }
}

fun demoEagerSingleton() {
    val eager1 = eagerSingleton
    eager1.data = "Pham Thi Dung"
    eager1.showData()
    val eager2 = eagerSingleton
    println("Are eager1 and eager2 the same instance? ${eager1 === eager2}")
}
