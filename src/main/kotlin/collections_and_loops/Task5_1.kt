package collections_and_loops

import Employee5

/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса Employee  и возвращает средний возраст всех сотрудников.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val emp0 = Employee5("Michail", 12)
    val emp1 = Employee5("Liza", 51)
    val emp2 = Employee5("Roman", 2)
    val emp3 = Employee5("Kirill", 14)
    val emp4 = Employee5("Olga", 21)
    val emp5 = Employee5("Rolan", 33)
    val emp6 = Employee5("Alan", 34)
    val emp7 = Employee5("Anna", 54)
    val emp8 = Employee5("Artem", 61)

    val employees1 = listOf(emp0, emp2, emp4, emp6, emp8)
    val employees2 = listOf(emp1, emp3, emp5, emp7)

    println(getAverageAgesEmployees(employees1))
    println(getAverageAgesEmployees(employees2))
}

fun getAverageAgesEmployees(employees: List<Employee5>): Int {
    var sumAges = 0
    for(empl in employees) {
        sumAges += empl.age
    }
    return sumAges/employees.size
}