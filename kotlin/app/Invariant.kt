package app

class Invariant<T>(var data: T) {
}

fun main() {
    val invariantString = Invariant("String")

    // val invariantAny: Invariant<Any> = invariantString // ERROR dan BAHAYA
    // invariantAny.data = 100 // BAHAYA
}