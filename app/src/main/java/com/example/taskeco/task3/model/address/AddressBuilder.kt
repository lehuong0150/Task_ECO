package com.example.taskeco.task3.model.address

class AddressBuilder {
    var district: String = "Dong Da"
    var city: String = "Ha Noi"
    private var detail: DetailAddress? = null

    fun detailAddress(block: DetailAddress.() -> Unit) {
        detail = DetailAddress().apply(block)
    }

    fun build(): Address = Address(district, city, detail)
}