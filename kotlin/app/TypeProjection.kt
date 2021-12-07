package app

class Container<T>(var data: T)

fun copyContainer(from: Container<out Any>, to: Container<in Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Dendi")
    val container2: Container<Any> = Container("Prayogo")

    copyContainer(container1, container2)

    println(container1.data)
    println(container2.data)
}