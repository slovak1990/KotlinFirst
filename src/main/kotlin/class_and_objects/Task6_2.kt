package class_and_objects/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val rect1 = Round(3)
    val rect2 = Round(6)

    println(rect1.getSquareRadius())
    println(rect1.getOkruzhnostRadius())
    println(rect2.getSquareRadius())
    println(rect2.getOkruzhnostRadius())
}

class Round (
    val radius: Int
) {
    fun getSquareRadius(): Double {
        return (Math.PI* radius * radius)
    }

    fun getOkruzhnostRadius(): Double {
        return (2*Math.PI*radius)
    }
}