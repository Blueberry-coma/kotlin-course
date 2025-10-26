package org.example.lessons.lessons.lesson15.geometric

open class Geometric(
    open val name: String = "Фигура",
    open val color: String = "Черный"
) {
    open fun calculateArea(): Double {
        println("Расчет площади для базовой фигуры не определен")
        return 0.0
    }

    open fun calculatePerimeter(): Double {
        println("Расчет периметра для базовой фигуры не определен")
        return 0.0
    }

    open fun displayInfo() {
        println("$name (цвет: $color)")
    }
}