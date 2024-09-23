import java.lang.NumberFormatException

/*
Вывести для чисел от 1 до 5 их текстовое представление: 1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то вывести: «ошибка»
*/

fun main() {
    try {
    val integer = readln().toInt()

    when(integer){
        1 -> println("один")
        2 -> println("два")
        3 -> println("три")
        4 -> println("четыре")
        5 -> println("пять")
        else -> println("ошибка")
    } }
    catch (e: NumberFormatException) {
        println("Введено большое число или не число вовсе. Пожалуйста, введите целое число.")
    }
}