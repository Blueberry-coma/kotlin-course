package org.example.lessons.lesson12

fun main() {

}
val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)
//1

//2
fun two(collection: Collection<Any>): Boolean {
    return collection.isEmpty()
}

//3
fun three(collection: Collection<Any>): Boolean {
    return collection.isNotEmpty()
}

//4
fun four(list: List<String>, index: Int, defaultValue: String): String {
    return list.getOrElse(index) { defaultValue }
}

//5
fun five(collection: Collection<Any>): String {
    return collection.joinToString()
}

//6.
fun six(numbers: List<Int>): Int {
    return numbers.sum()
}

//7
fun seven(numbers: List<Int>): Double {
    return numbers.average()
}

//8
fun eight(numbers: List<Int>): Int? {
    return numbers.maxOrNull()
}

//9
fun nine(numbers: List<Int>): Int? {
    return numbers.minOrNull()
}

//10
fun ten(numbers: List<Int>): Int? {
    return numbers.firstOrNull()
}

//11
fun eleven(numbers: List<Int>, element: Int): Boolean {
    return numbers.contains(element)
}

//12
fun tvelve(ages: List<Int>): List<Int> {
    return ages.filter { it in 18..30 }
}

//13
fun threeteen(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 != 0 || it % 3 != 0 }
}

//14
fun fourteen(strings: List<String?>): List<String> {
    return strings.filterNotNull()
}

//15
fun fifteen(words: List<String>): List<Int> {
    return words.mapIndexed { index, word -> word.length }
}

//16
fun sixteen(words: List<String>): Map<String, Int> {
    return words.associate { it.reversed() to it.length }
}

//17
fun seventeen(words: List<String>): List<String> {
    return words.sorted()
}

//18
fun eighteen(items: List<String>): List<String> {
    return items.take(3)
}

//19
fun nineteen(numbers: List<Int>) {
    numbers.forEach { number ->
        println("Квадрат $number = ${number * number}")
    }
}

//20
fun twenty(words: List<String>): Map<Char, List<String>> {
    return words.groupBy { it.first() }
}

//21
fun twentyOne(items: List<String>): List<String> {
    return items.toSet().toList()
}

//22
fun twentyTwo(numbers: List<Int>): List<Int> {
    return numbers.sortedDescending()
}

//23
fun twentyThree(items: List<String>): List<String> {
    return items.takeLast(3)
}