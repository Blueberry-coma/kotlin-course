package org.example.lessons.lessons.lesson15.geometric

class Square(
    override val color: String = "Желтый",
    val side: Double
) : Rectangle(
    color = color,
    width = side,
    height = side
) {
    init {
        name = "Квадрат"
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Все стороны равны: $side")
    }
}
