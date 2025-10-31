package org.example.lessons.lesson17

abstract class Shape(val name: String) {


    open fun area(): Double {
        return 0.0
    }

    open fun displayInfo() {
        println("Фигура: $name")
        println("   📏 Площадь: ${"%.2f".format(area())}")
    }
}

class Circle(
    val radius: Double
) : Shape("Круг") {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun displayInfo() {
        println("Фигура: $name")
        println("Радиус: $radius")
        println("Площадь: ${"%.2f".format(area())}")
        println("Длина окружности: ${"%.2f".format(2 * Math.PI * radius)}")
    }
}

class Square(
    val side: Double
) : Shape("Квадрат") {

    override fun area(): Double {
        return side * side
    }

    override fun displayInfo() {
        println("Фигура: $name")
        println("Сторона: $side")
        println("Площадь: ${"%.2f".format(area())}")
        println("Периметр: ${"%.2f".format(4 * side)}")
    }
}

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val angle: Double // угол между сторонами A и B в градусах
) : Shape("Треугольник") {

    override fun area(): Double {
        val angleInRadians = Math.toRadians(angle)
        return 0.5 * sideA * sideB * Math.sin(angleInRadians)
    }

    override fun displayInfo() {
        println("Фигура: $name")
        println("Стороны: $sideA, $sideB")
        println("Угол между сторонами: ${angle}°")
        println("Площадь: ${"%.2f".format(area())}")
    }
}
