package com.example.taskeco.task3.demo

import com.example.taskeco.task3.model.Identifiable

//Demo generic
fun <T : Identifiable> addUniqueItem(list: MutableList<T>, item: T): Boolean {
    return if (list.none { it.id == item.id }) {
        list.add(item)
        true
    } else false
}