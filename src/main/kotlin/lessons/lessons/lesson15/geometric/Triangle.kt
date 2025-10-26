package org.example.lessons.lessons.lesson15.geometric

class Triangle(
    override val color: String = "Зеленый",
    val sideA: Double,
    val sideB: Double,
    val sideC: Double
) : Polygon(
    name = "Треугольник",
    color = color,
    sides = 3,
    vertices = listOf(sideA, sideB, sideC)
)

