package org.example.lessons.lesson14

class emotions(val type: String, val intensity: Int) {
    fun express () {
    println("Эмоция: $type, Интенсивность: $intensity")
    }
}

fun main() {
    val emotion = emotions(type = "Радость", intensity = 8)
    emotion.express()
}
