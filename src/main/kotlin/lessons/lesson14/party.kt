package org.example.lessons.lesson14

class party (val location: String, val attendees: Int) {

    fun details() {
        println("Вечеринка проводится в: $location")
        println("Количество гостей: $attendees")
    }
}
fun main() {
    val party1 = party("доме", 15)
    party1.details()
}