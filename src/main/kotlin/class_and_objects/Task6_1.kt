package class_and_objects/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rect1 = Rectangle(3, 5)
    val rect2 = Rectangle(6, 6)
    val rect3 = Rectangle(8, 4)
    val rect4 = Rectangle(6, 9)

    println(rect1.getSquare())
    println(rect2.getSquare())
    println(rect3.getSquare())
    println(rect4.getSquare())

    println(rect1.getPerimeter())
    println(rect2.getPerimeter())
    println(rect3.getPerimeter())
    println(rect4.getPerimeter())

    println(rect1.isSquare())
    println(rect2.isSquare())
    println(rect3.isSquare())
    println(rect4.isSquare())
}

class Rectangle(
    val width: Int,
    val height: Int
) {
    fun getSquare(): Int {
        return (width * height)
    }

    fun getPerimeter(): Int {
        return (2 * (width + height))
    }

    fun isSquare(): Boolean {
        return (width == height)
    }
}