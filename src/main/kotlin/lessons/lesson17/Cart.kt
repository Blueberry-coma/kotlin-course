package org.example.lessons.lesson17

class Cart {
    private val items = mutableMapOf<String, Int>()

    // Базовый метод - добавляет одну единицу товара
    fun addToCart(itemId: String) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
        println("Добавлен товар: $itemId (теперь: ${items[itemId]} шт.)")
    }

    // Перегрузка 1: itemId и количество
    fun addToCart(itemId: String, amount: Int) {
        require(amount > 0) { "Количество должно быть положительным" }
        items[itemId] = items.getOrDefault(itemId, 0) + amount
        println("Добавлено $amount шт. товара: $itemId (теперь: ${items[itemId]} шт.)")
    }

    // Перегрузка 2: словарь из id и количества
    fun addToCart(newItems: Map<String, Int>) {
        newItems.forEach { (itemId, amount) ->
            if (amount > 0) {
                items[itemId] = items.getOrDefault(itemId, 0) + amount
                println("Добавлено $amount шт. товара: $itemId (теперь: ${items[itemId]} шт.)")
            }
        }
    }

    // Перегрузка 3: список id (добавляет по одной единице)
    fun addToCart(itemIds: List<String>) {
        itemIds.forEach { itemId ->
            items[itemId] = items.getOrDefault(itemId, 0) + 1
            println("Добавлен товар: $itemId (теперь: ${items[itemId]} шт.)")
        }
    }
}