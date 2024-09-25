package lyambda

import User4

/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun lyambda.convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

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
    val emp6 = User4("Alan", 34)

    val users = listOf(emp0, emp1, emp2, emp3, emp5, emp4, emp6)

    val userNames = convertToStrings(users) { it.name }
    println(userNames)

    val userInfo = convertToStrings(users) { "${it.name} ${it.age} лет" }
    println(userInfo)
}

fun convertToStrings(users: List<User4>, conversion: (User4) -> String): List<String> {
    return users.map(conversion)
}
