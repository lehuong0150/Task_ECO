package com.example.taskeco.task2
import com.example.taskeco.task2.models.animals.Animal
import com.example.taskeco.task2.models.animals.Dog
import com.example.taskeco.task2.models.books.Book
import com.example.taskeco.task2.models.user.Person
import com.example.taskeco.task2.models.vehicles.Bike
import com.example.taskeco.task2.models.vehicles.Car

/*
    6. OOP (Lập trình hướng đối tượng)
        Class & Object
        Constructor (Primary & Secondary)
        Kế thừa (open class, override)
        Interface & Abstract Class
        Data Class
        Singleton (object)
 */
fun main(){
    demoClassObject()
    demoConstructor()
    demoInheritance()
    demoInterfaceAbstractClass()
    demoDataClass()
}
// Class & Object
fun demoClassObject(){
    val car1 = Car("Toyota", 20, 4)
    car1.honk()
}

// Constructor (Primary & Secondary)
fun demoConstructor(){
    val person1 = Person("Alice", 25)
    val person2 = Person("Bob")
    println("Person1: ${person1.name}, Age: ${person1.age}")
    println("Person2: ${person2.name}, Age: ${person2.age}")
}

// Kế thừa (open class, override)
fun demoInheritance(){
    val animal = Animal("Generic Animal")
    animal.sound()
    val dog = Dog("Buddy")
    dog.sound()
}

// Interface & Abstract Class
fun demoInterfaceAbstractClass(){
    val bike = Bike("Yamaha")
    bike.start()
    bike.drive()
}

// Data Class
fun demoDataClass(){
    val book1 = Book("1984", "George Orwell", 1949)
    val book2 = Book("1984", "George Orwell", 1949)

    println("Book1: $book1")
    println("Book2: $book2")
    println("Are book1 and book2 equal? ${book1 == book2}")

    val book3 = book1.copy(year = 1950)
    println("Book3 (copied from Book1 with new year): $book3")
}


