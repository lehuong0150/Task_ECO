package com.example.taskeco.task3.demo

import com.example.taskeco.task3.model.address.Address
import com.example.taskeco.task3.model.address.AddressBuilder

fun address(block: AddressBuilder.() -> Unit): Address {
    val builder = AddressBuilder()
    builder.block()
    return builder.build()
}

fun demoDomainSpecificLanguage() {
    val myAddress = address {
        district = "Hac Thanh"
        city = "Thanh Hoa"
        detailAddress {
            stress = "Tran Phú"
            describe = "No. 12, Lane 81"
        }
    }

    println(myAddress)
}
