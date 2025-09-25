package com.example.taskeco.task3.model.address

data class Address(
    var district: String = "Dong Da",
    var city: String = "Ha Noi",
    var detailAddress: DetailAddress? = null
)
