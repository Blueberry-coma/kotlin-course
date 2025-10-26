package org.example.lessons.lessons.lesson15.education

class highSchool(
    override val name: String = "Средняя школа",
    override val location: String = "Город",
    override val foundationYear: Int = 2000,
    override val studentCount: Int = 0,
    val specialization: String = "Общеобразовательная",
    val hasGymnasium: Boolean = false
) : school(name, location, foundationYear, studentCount) {

    override fun calculateBudget(): Double {
        val baseBudget = super.calculateBudget()
        return baseBudget + if (hasGymnasium) 1000000.0 else 0.0
    }

    override fun displayInfo() {
        super.displayInfo()
        println("🎯 Профиль: $specialization")
        println("🏛️ Гимназические классы: ${if (hasGymnasium) "Да" else "Нет"}")
    }
}