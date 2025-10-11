package org.example.lessons.lesson10

fun main() {
    //1.
    val emptyMap = mapOf<Int, Int>()

    //2.
    val Map2 = mapOf<Float, Double>(1f to 1.1)
    println(Map2)

    //3.
    val Map3 = mutableMapOf<Int, String>()

    //4.
    val Map4 = mutableMapOf(1 to 2)
    Map4  [1] = 3
    Map4 [7] = 9
    println(Map4)

    //5.
    val Map5 = Map4.get(7)
    println(Map5)

    //6.
    val Map6 = mutableMapOf(1 to 2, 9 to 8)
    Map6.remove(9)
    println(Map6)

    //7.
    val Map7 = mapOf(
        10.0 to 2,
        15.5 to 3,
        8.0 to 0,  // Деление на ноль!
        12.0 to 4,
        7.5 to 0,  // Еще одно деление на ноль
        20.0 to 5
    )

    for ((key, value) in Map7) {
        val result = if (value == 0) {
            "бесконечность"
        } else {
            (key / value).toString()
        }
        println("$key / $value = $result")

        //8.
        val Map8 = mutableMapOf(1 to 2, 3 to 4)
        Map8[3] = 5
        println(Map8)

        //9.
        val map91 = mapOf("apple" to "яблоко", "book" to "книга", "cat" to "кот")
        val map92 = mapOf("dog" to "собака", "apple" to "яблочко", "house" to "дом")

        val mergedDict = mutableMapOf<String, String>()

        for ((key, value) in map91) {
            mergedDict[key] = value
        }

        for ((key, value) in map92) {
            mergedDict[key] = value
        }

        println("Первый словарь: $map91")
        println("Второй словарь: $map92")
        println("Объединенный словарь: $mergedDict")

        //10.
        val studentGrades = mutableMapOf<String, MutableList<Int>>()

        studentGrades["Анна"] = mutableListOf()
        studentGrades["Борис"] = mutableListOf()
        studentGrades["Виктор"] = mutableListOf()

        studentGrades["Анна"]!!.add(85)
        studentGrades["Анна"]!!.addAll(listOf(90, 88))

        studentGrades["Борис"]!!.addAll(listOf(78, 82, 79))
        studentGrades["Виктор"]!!.add(92)

        println("Оценки студентов: $studentGrades")

        //11.

}}