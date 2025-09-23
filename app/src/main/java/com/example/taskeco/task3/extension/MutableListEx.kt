package com.example.taskeco.task3.extension

import com.example.taskeco.task3.model.Identifiable

fun <T : Identifiable> MutableList<T>.findById(id: String): T? {
    return this.find { it.id == id }
}
