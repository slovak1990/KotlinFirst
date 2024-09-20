import kotlin.math.max

/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    println(getMaxNumber(a, b))
}

fun getMaxNumber(first: Int, second: Int): Int {
    return if (first == second)
        0
    else
        max(first, second)
}