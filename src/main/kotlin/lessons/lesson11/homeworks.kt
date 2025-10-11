package org.example.lessons.lesson11

fun main() {
    multiplyByTwo(4)
    }

fun exerciseOne() {
    println("This is exercise one")
}

fun exerciseTwo(a: Int, b: Int): Int {
    return a + b
}

fun exerciseThree(c: String) {
    println(c)
}

public fun exerciseFour(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0
    println(numbers.average())
    return numbers.average()
}

private fun exerciseFive(five: String?): Int? {
    return five?.length
}

fun exerciseSix(): Double? {
    return null
}

private fun exerciseSeven(n7: List<Int>?) {

}

fun exerciseEight(n8: Int):String? {
    return null
}

fun exerciseNine(): List<String?> {
    return emptyList()
}

fun exerciseTen(string: String?, number: Int?): Boolean? {
    return null
}

fun multiplyByTwo(n11: Int): Int{
    println(n11 * 2)
    return n11 * 2
}

fun isEven(n12: Int): Boolean {
    return n12 % 2 == 0
}

fun printNumbersUntil(n13: Int) {
    if (n13 < 1) return

    for (i in 1..n13) {
        println(i)
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}