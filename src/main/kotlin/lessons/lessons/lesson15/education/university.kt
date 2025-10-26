package org.example.lessons.lessons.lesson15.education

open class university(
    override val name: String = "Университет",
    override val location: String = "Город",
    override val foundationYear: Int = 2000,
    override val studentCount: Int = 0,
    val accreditationLevel: String = "Федеральный",
    val researchCenters: Int = 0
) : baseClass(name, location, foundationYear, studentCount) {

    override fun getEducationLevel(): String {
        return "Высшее образование"
    }

    override fun calculateBudget(): Double {
        return studentCount * 50000.0 + researchCenters * 1000000.0
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Уровень аккредитации: $accreditationLevel")
        println("Научных центров: $researchCenters")
    }
}