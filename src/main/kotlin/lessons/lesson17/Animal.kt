package org.example.lessons.lesson17

open class Animal(val name: String) {

    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Bark!$")
    }
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Meow!")
    }
}

class Bird(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name says: Tweet!")
    }
}