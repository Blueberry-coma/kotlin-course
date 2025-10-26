package org.example.lessons.lessons.lesson15.geometric

open class Quadrilateral(
    override val color: String = "Оранжевый",
    val sideA: Double,
    val sideB: Double,
    val sideC: Double,
    val sideD: Double
) : Polygon(
    name = "Четырехугольник",
    color = color,
    sides = 4,
    vertices = listOf(sideA, sideB, sideC, sideD)
) {
    override fun displayInfo() {
        super.displayInfo()
        println("Площадь: ${"%.2f".format(calculateArea())}")
    }

    override fun calculateArea(): Double {
        println("Для общего четырехугольника площадь рассчитывается сложно")
        return 0.0
    }
}