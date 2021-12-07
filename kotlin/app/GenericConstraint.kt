package app

// contoh Where Keyword
interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, i'm Vice President")
    }
}

class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
    // val data1 = Company(Employee()) // Error CanSayHello
    // val data2 = Company(Manager())  // Error CanSayHello
    val data3 = Company(VicePresident())
    // val data4 = Company("String") // Error not Employee
}