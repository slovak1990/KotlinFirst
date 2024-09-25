package lyambda

import User4

/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val emp0 = User4("Michail", 19)
    val emp1 = User4("Liza", 14)
    val emp2 = User4("Roman", 23)
    val emp3 = User4("Kirill", 14)
    val emp4 = User4("Olga", 21)
    val emp5 = User4("Rolan", 33)
    val emp6 = User4("Liza", 34)

    val users = listOf(emp0, emp1, emp2, emp3, emp5, emp4, emp6)

    val countName = elementsCount(users) { it.name == "Liza" }
    println(countName)

    val countAges = elementsCount(users) { it.age > 21 }
    println(countAges)
}

fun elementsCount(users: List<User4>, condition: (User4) -> Boolean): Int {
    var count = 0
    for (user in users) {
        if (condition(user)) {
            count++
        }
    }
    return count
}