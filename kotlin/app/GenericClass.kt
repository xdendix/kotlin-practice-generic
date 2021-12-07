package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Dendi", 100)
    myDataString.printlnData()

    val myDataInt: MyData<Int, String> = MyData<Int, String>(100, "Prayogo")
    myDataInt.printlnData()
}