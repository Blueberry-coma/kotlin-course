package org.example.lessons.lesson09

fun main() {
    //1
    val array1 = arrayOf(1, 2, 3, 4, 5)
    println(array1.contentToString())

    //2
    val array2 = arrayOfNulls<Int>(10)

    //3
    val array3 = DoubleArray(5)
    for (i in 0 until 5) {
        array3[i] = i * 2.0
    }

    //4
    val array4 = IntArray(5)
    for (i in array1.indices) {
        array4[i] = i * 3
    }

    //5
    val array5 = arrayOf<String?>(null, "Hello", "World")
    println(array5.contentToString())

    //6
    val originalArray = intArrayOf(10, 20, 30, 40, 50)
    val copiedArray = IntArray(originalArray.size)

    var i = 0
    while (i < originalArray.size) {
        copiedArray[i] = originalArray[i]
        i++
    }

    //7
    val array71 = intArrayOf(10, 20, 30, 40, 50)
    val array72 = intArrayOf(5, 15, 10, 20, 25)
    val resultArray = IntArray(array71.size)

    for (i in array71.indices) {
        resultArray[i] = array1[i] - array72[i]
    }

    //8
    val numbers = intArrayOf(2, 8, 5, 1, 9, 3)
    var ind = -1
    var i1 = 0

    while (i1 < numbers.size) {
        if (numbers[i] == 5) {
            ind = i
            break
        }
        i++
    }

    //9
    val numbers9 = intArrayOf(2, 7, 4, 9, 6, 3, 8, 1, 5)

    println("Проверка чётности элементов массива:")
    println("Массив: ${numbers.contentToString()}")
    println()

    for (number in numbers9) {
        val parity = if (number % 2 == 0) "чётное" else "нечётное"
        println("$number - $parity")
    }

}

fun List() {
    //1
    val emptyList2 = listOf<Int>()

    //2
    val list2: List<String> = listOf("Hello", "World", "Kotlin")

    //3
    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println("Список 2: $list3")

    //4
    val numbers4 = mutableListOf(1, 2, 3, 4, 5)
    println("Исходный список: $numbers4")

    numbers4.add(6)
    numbers4.add(7)
    numbers4.add(8)

    //5
    val words5 = mutableListOf("Hello", "World", "Kotlin", "World", "Programming")
    println("Исходный список: $words5")
    val removed = words5.remove("World")

    //6
    val numbers6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Вывод элементов с помощью for (элементы):")
    for (number in numbers6) {
        println(number)
    }

    //7
    val fruits = listOf("apple", "banana", "orange", "grape", "kiwi")
    println("Список: $fruits")
    val secondElement = fruits[1]
    println("Второй элемент: \"$secondElement\"")

    //8
    val numbers8 = mutableListOf(10, 20, 30, 40, 50)
    println("Исходный список: $numbers8")
    numbers8[2] = 300

    //9
    val fruits9 = listOf("Apple", "Banana", "Cherry")
    val vegetables9 = listOf("Carrot", "Broccoli", "Spinach")

    println("Фрукты: $fruits9")
    println("Овощи: $vegetables9")
    val foodList = mutableListOf<String>()
    for (fruit in fruits9) {
        foodList.add(fruit)
    }
    for (vegetable in vegetables9) {
        foodList.add(vegetable)
    }
    println("Все продукты: $foodList")

}

fun Set() {
    //1
    val emptySet1: Set<Int> = emptySet()

    //2
    val set2 = setOf(1, 2, 3)

    //3
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")

    //4
    val languages4 = mutableSetOf("Kotlin", "Java", "Python")
    languages4.add("Swift")
    languages4.add("Go")

    //5
    val numbers5 = mutableSetOf(1, 2, 3, 4, 5)
    numbers5.remove(2)

    //6
    val numbers7 = setOf(1, 5, 3, 8, 2, 7)
    for (number in numbers7) {
        println(number)
    }
}