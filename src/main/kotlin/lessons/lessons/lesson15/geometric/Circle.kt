package org.example.lessons.lessons.lesson15.geometric

class Circle(
    override val name: String = "Круг",
    override val color: String = "Красный",
    val radius: Double = 0.0
) : Geometric(name, color) {

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Радиус: $radius")
        println("Площадь: ${"%.2f".format(calculateArea())}")
        println("Длина окружности: ${"%.2f".format(calculatePerimeter())}")
    }
}