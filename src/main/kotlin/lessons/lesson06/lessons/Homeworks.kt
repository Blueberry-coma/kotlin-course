package org.example.lessons.lesson06.lessons

fun main() {
// Задание 1: Определение сезона
    var month: Int = 0
    when (month) {
        in 1..2, 12 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Зима")
        else -> println("В году только 12 месяцев")
    }

    // Задание 2: Расчет возраста питомца
    var dogAge: Double = 3.0
    var humanAge: Double
    if (dogAge <= 2) {
        humanAge = dogAge * 10.5
        println("Возраст собаки по человеческим меркам " + humanAge + " лет")
    } else {
            humanAge = dogAge * 4 + 21
            println("Возраст собаки по человеческим меркам " + humanAge + " года")
    }

    // Задание 3: Определение способа перемещения
    var distance: Double = 6.0
    val text: String = "Лучший способ перемещения сенодня это "
    when (distance) {
        in 0.0..0.9->println (text + "пешком")
        in 1.0..4.9->println (text + "велосипед")
        else -> println(text + "автомобиль")
    }

    // Задание 4: Расчет бонусных баллов
    var bonus: Double
    var ammount: Double = 1100.0
    if (ammount <= 1000.0) {
        bonus = ammount *2 / 100
    } else {
        bonus = (ammount *3 / 100)+20 -30
    }
    println ("Сумма покупки "+ammount+ " рублей. Получено бонусов - " + bonus)

    // Задание 5: Определение типа документа
    val extension: String = "txt"
    val fileType: String = when(extension) {
        "txt", "doc", "docx", "pdf", "rtf" -> "текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp", "svg" -> "изображение"
        "xls", "xlsx", "csv" -> "таблица"
        else -> "неизвестный тип файла"
    }
    println("Тип файла: "+extension+". Это "+fileType)

    // Задание 6: Конвертация температуры
    val temp: Double = 40.0
    var un: String = "F"
    val result: Double
    when (un){
        "C"-> {result = temp * 9 / 5 + 32
            un = "F"}
        "F" -> {
            result = (temp - 32) * 5 / 9
            un = "C"
        }

    }

    // Задание 7: Подбор одежды по погоде
    val temperature: Int = 40
    val recomendation: String = when(temperature) {
        in -30..10 -> "куртка и шапка"
        in 11 .. 18 -> "ветровка"
        in 19..35 -> "шорты футболка"
        else -> "остаться дома"
    }
    println("Сегодня за окном "+temperature+" градусов. "+"Рккомендация: "+recomendation)

    // Задание 8: Подбор одежды по погоде
    val age: Int = 8
    val marker: String =  when (age) {
        in 0..9 -> "детские"
        in 10..18 -> "подростковые"
        else -> "18+"
    }
    println("Возраст зрителя: "+age+". Разрешенные фильмы: "+marker)
}

