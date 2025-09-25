package com.example.taskeco.task3.database

import com.example.taskeco.task3.model.users.Employee
import com.example.taskeco.task3.model.users.Manager
import com.example.taskeco.task3.demo.LanguageEnum
import com.example.taskeco.task3.demo.RoleSealClass
import com.example.taskeco.task3.demo.addUniqueItem
import com.example.taskeco.task3.demo.address
import com.example.taskeco.task3.model.address.Address

object EmployeeDB {
    val employeeList = mutableListOf<Employee>()
    val managerList = mutableListOf<Manager>()

    init {
        initEmployee()
        initManager()
    }

    private fun initEmployee() {
        // thêm vài employee mẫu
        val e1 = Employee(
            id = "E001",
            name = "Le Ngoc Lan Anh",
            email = "anhlan12@example.com",
            phone = "0901234567",
            address = Address(),
            type = RoleSealClass.Developer(LanguageEnum.KOTLIN)
        )
        val e2 = Employee(
            id = "E002",
            name = "Nguyen Hoang Long",
            email = "long34@example.com",
            phone = "0902345678",
            address = address {
                district = "Le Chan"
                city = "Hai Phong"
                detailAddress {
                    stress = "Tran Phú"
                    describe = "No. 12, Lane 11"
                }
            },
            type = RoleSealClass.Tester(true)
        )
        val e3 = Employee(
            id = "E001",
            name = "Nguyen Van Ha",
            email = "charlie@example.com",
            phone = "0903456789",
            address = address {
                district = "Hac Thanh"
                city = "Thanh Hoa"
                detailAddress {
                    stress = "Tran Phú"
                    describe = "No. 15"
                }
            },
            type = RoleSealClass.Developer(LanguageEnum.JAVA)
        )
        val e4 = Employee(
            id = "E003",
            name = "Luong Thi Trang",
            email = "tranglt@example.com",
            phone = "0903459989",
            address = address {
                district = "Hai Tien"
                city = "Nam Dinh"
                detailAddress {
                    stress = "Tran Phú"
                    describe = "No. 12, Lane 81"
                }
            },
            type = RoleSealClass.Developer(LanguageEnum.PYTHON)
        )

        addUniqueItem(employeeList, e1)
        addUniqueItem(employeeList, e2)
        addUniqueItem(employeeList, e3)
        addUniqueItem(employeeList, e4)
    }

    private fun initManager() {
        val m1 = Manager(
            id = "M001",
            name = "Vu Hai Hung",
            email = "hung10@example.com",
            phone = "0911111111",
            teamSize = 5
        )
        val m2 = Manager(
            id = "M002",
            name = "Nguyen Thao My",
            email = "thaomy05@example.com",
            phone = "0922222222",
            teamSize = 8
        )

        addUniqueItem(managerList, m1)
        addUniqueItem(managerList, m2)
    }
}