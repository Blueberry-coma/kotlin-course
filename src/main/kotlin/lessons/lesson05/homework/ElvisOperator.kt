package org.example.lessons.lesson05.homework

fun main() {
    // Задача 1
    val mainSound: Double = 20.0
    val mainKef: Double? = 1.0
    val defaultKef: Double= 0.5
    val finalSound = mainSound * (mainSound ?: defaultKef )

    // Задача 2
    val deliveryPrice: Double = 100.0 //рубли
    val shopingPrice: Double? = 1200.0 //рубли
    val insuranceKef: Double = 0.005 //процент
    val defaultInsurance: Double = 50.0 //рубли
    val insurancePrice = (shopingPrice ?: defaultInsurance) * insuranceKef
    val finalPrice = deliveryPrice + insurancePrice

    //Задача 3
    val davlenie: Double? = 735.0
    val message: String = "Давдение не указано"
    val final = davlenie ?: message
}