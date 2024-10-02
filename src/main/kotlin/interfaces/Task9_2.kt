package interfaces/*
Создайте класс Animal с полями name: String, x: Int, y: Int, который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

class Animal (val name: String): Movable {
    val x: Int = 0
    val y: Int = 0
    override fun moveLeft(step: Int) {
        println("Двигайся влево на ${step} шагов")
    }

    override fun moveRight(step: Int) {
        println("Двигайся вправо на ${step} шагов")
    }

    override fun moveDown(step: Int) {
        println("Двигайся вниз на ${step} шагов")
    }

    override fun moveUp(step: Int) {
        println("Двигайся вверх на ${step} шагов")
    }

}