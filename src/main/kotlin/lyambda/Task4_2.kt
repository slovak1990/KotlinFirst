package lyambda

import User4

/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


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

    val isUserExist = containsElement(users) { it.name == "Liza" }
    println(isUserExist)

    val haveUserByAge19 = containsElement(users) { it.age < 14 }
    println(haveUserByAge19)
}

fun containsElement(users: List<User4>, condition: (User4) -> Boolean): Boolean {
    for (user in users) {
        if (condition(user)) {
            return true
        }
    }
    return false
}