package org.example.lessons.lesson07

fun main() {

    //1. Напишите цикл for, который выводит числа от 1 до 5
    for (i in 1..5)
        println(i)

    //2. Напишите цикл for, который выводит четные числа от 1 до 10
    for (i in 2..10 step 2)
        println(i)

    //3.Создайте цикл for, который выводит числа от 5 до 1
    for (i in 5 downTo 1)
        println(i)

    //4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2
    for (i in 5 downTo 1)
        println(i -2)

    //5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9
    for (i in 1..10 step 2)
        println(i)

    //6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20
    for (i in 1..20 step 3)
        println(i)

    //7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size
    val size = 15
    for (i in 3 until size step 2)
        println(i)

    //8. Создайте цикл while, который выводит квадраты чисел от 1 до 5
    var i = 1
    while (i <= 5) {
        println(i * i)
    i++}

    // 9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var lk = 10
    while (lk >= 5) {
        println(lk)
        lk--
    }

    //10. Используйте цикл do while, чтобы вывести числа от 5 до 1
    var numeric = 5
    do {
        println(numeric)
        numeric--
    } while (numeric > 0)

    //11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5
    var counter = 5
    do {
        println(counter)
        counter++

    } while (counter < 10)

    //12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    //13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10
    var n = 1
    while (true) { // бесконечный цикл
        println(lk)
        n++
        if (n > 10) {
            break}

    //14. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа
        for (p in 1..10) {
            if (p % 2 == 0) {
                continue
            }
            println(p)
        }
    //15. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3
        var lk = 1

        while (lk <= 10) {
            if (lk % 3 == 0) {
                lk++
                continue
            }
            println(lk)
            lk++
        }

}}