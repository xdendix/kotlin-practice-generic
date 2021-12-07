package data

class Fruit(name: String, val quantity: Int) : Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}