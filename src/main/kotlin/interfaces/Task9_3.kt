package interfaces

import abstract_classes.Rectangle

/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val animal = Animal("тигр")
    val triangle = Rectangle("red", 4.6, 9.8)
    val collectList = listOf(animal, triangle)
    for(element in collectList)
        element.moveRight(10)
}