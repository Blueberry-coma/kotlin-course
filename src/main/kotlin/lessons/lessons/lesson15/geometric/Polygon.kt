package org.example.lessons.lessons.lesson15.geometric

open class Polygon(
    override var name: String = "Многоугольник",
    override val color: String = "Синий",
    val sides: Int = 0,
    val vertices: List<Double> = emptyList()
) : Geometric(name, color) {

    override fun calculatePerimeter(): Double {
        return vertices.sum()
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Количество сторон: $sides")
        println("Периметр: ${calculatePerimeter()}")
    }
}