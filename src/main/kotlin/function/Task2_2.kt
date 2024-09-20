/*
Написать функцию, которая для двух целых чисел возвращает «первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    println(getMaxNumberMessage(a, b))
}

fun getMaxNumberMessage(first: Int, second: Int): String {
    return if (first == second)
        "числа равны"
    else if (first > second)
        "первое число больше"
    else
        "второе число больше"
}
