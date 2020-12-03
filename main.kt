fun main(args: Array<String>) {

    Obj.dosmth(0)
    Obj.dosmth1(3)


}

fun firstArrayScore() {
    println("TABLICA NR1")
    println("Kwadraty liczb: " + firstArray().sqrt())
    println("Suma liczb: " + firstArray().firstSum)
}

fun secondArrayScore() {
    println("TABLICA NR2")
    println("Kwadraty liczb: " + secondArray().sqrt1())
    println("Suma liczb: " + secondArray().secondSum)
}


class firstArray {
    fun sqrt() {
        Obj.array.forEach {
            println(it * it)
        }
    }

    val firstSum = Obj.array.sum()
}

class secondArray {
    fun sqrt1() {
        Obj.array1.forEach {
            println(it * it)
        }
    }

    val secondSum = Obj.array1.sum()
}

object Obj {
    val array = mutableListOf<Int>()
    val array1 = mutableListOf<Int>()

    fun dosmth(num: Int) {
        for (num in num..num + 10) {
            array.add(num + 1);
        }
        println(array)
        firstArrayScore()

    }

    fun dosmth1(num1: Int) {
        for (num1 in num1..num1 + 5) {
            array1.add(num1 + 1);
        }
        println(array1)
        secondArrayScore()

    }
}


