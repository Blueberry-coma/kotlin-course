package org.example.lessons.lessons.lesson15.education

open class baseClass(
    open val name: String = "Учебное заведение",
    open val location: String = "Город",
    open val foundationYear: Int = 2000,
    open val studentCount: Int = 0
) {
    open fun getEducationLevel(): String {
        return "Общее образование"
    }

    open fun calculateBudget(): Double {
        return studentCount * 10000.0 // Базовая формула
    }

    open fun displayInfo() {
        println("$name")
        println("$location")
        println("Год основания: $foundationYear")
        println("Количество учащихся: $studentCount")
        println("Уровень образования: ${getEducationLevel()}")
        println("Примерный бюджет: ${"%.2f".format(calculateBudget())} руб.")
    }
}