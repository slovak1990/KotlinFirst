import kotlin.math.max

/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */

fun main() {
    val first = 14
    val second = 15

    if (first == second)
            println("ravenstvo")
    else if (first > second)
        println(first)
    else
        println(second)
}