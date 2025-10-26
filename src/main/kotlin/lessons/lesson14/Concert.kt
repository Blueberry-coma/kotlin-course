package org.example.lessons.lesson14

class Concert(
    val group: String,
    val location: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun buyTicket(): Boolean {
        return if (soldTickets < capacity) {
            soldTickets++
            println("Билет на концерт $group успешно куплен!")
            println("   Осталось мест: ${capacity - soldTickets}")
            true
        } else {
            println("Извините, все билеты на концерт $group проданы!")
            false
        }
    }
}