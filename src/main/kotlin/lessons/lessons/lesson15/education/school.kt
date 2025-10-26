package org.example.lessons.lessons.lesson15.education

open class school(
    override val name: String = "Школа",
    override val location: String = "Город",
    override val foundationYear: Int = 2000,
    override val studentCount: Int = 0,
    val schoolType: String = "Общеобразовательная",
    val hasSportFacilities: Boolean = false
) : baseClass(name, location, foundationYear, studentCount) {

    override fun getEducationLevel(): String {
        return "Среднее общее образование"
    }

    override fun calculateBudget(): Double {
        return studentCount * 15000.0 + if (hasSportFacilities) 500000.0 else 0.0
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Тип школы: $schoolType")
        println("Спортивные facilities: ${if (hasSportFacilities) "Да" else "Нет"}")
    }
}