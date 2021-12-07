package app

import data.Function

fun main() {
    val function = Function("Dendi")

    function.sayHello("Prayogo")
    function.sayHello<String>("Prayogo")

    function.sayHello(10)
    function.sayHello<Int>(10)
}