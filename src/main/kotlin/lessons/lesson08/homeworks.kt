package org.example.lessons.lesson08

fun main() {
    val originalString1 = "Это невозможно выполнить за один день"
    val replacedString1 = originalString1.replace("невозможно", "совершенно точно возможно, просто требует времени")
    println(replacedString1)

    val orginalString2 = "Я не уверен в успехе этого проекта"
    val string2 = " ,но моя интуиция говорит об обратном"
    println(orginalString2+string2)

    val originalString3 = "Произошла катастрофа на сервере"
    val replacedString3 = originalString3.replace("катастрофа", "интересное событие")
    println(replacedString3)

    val originalString4 = "Этот код работает без проблем"
    val replacedString4 = originalString4.replace("без проблем", "с парой интересных вызовов на пути")
    println(replacedString4)

    val word1 = "удача"
    val word2 = "иногда "
    val word3 = " ,но не всегда"
    println(word2+word1+word3)

    val log1 = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val string1 = log1.split(">")
    println(string1)

    val cardNumber = "4539 1488 0343 6467"



}