package org.example.lessons.lessons.lesson15.geometric

class Rectangle(
    override val color: String = "Фиолетовый",
    val width: Double,
    val height: Double
) : Quadrilateral(
    color = color,
    sideA = width,
    sideB = height,
    sideC = width,
    sideD = height
) {
    init {
        name = "Прямоугольник"
    }

    override fun calculateArea(): Double {
        return width * height
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Ширина: $width, Высота: $height")
    }

}