package org.example.lessons.lesson14

object Moon {
    var isViseable : Boolean = false
    var phase : String = "Full Moon"
    fun show() {
        isViseable = true
    }
    fun hide() {
        isViseable = false
    }
}

fun main() {
    println("Phase: ${Moon.phase}")
    Moon.show()
}