package `null-safety`/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val address1 = Address("prospekt Mira 12", "Moscow")
    val address2 = Address("ulitsa Lenina 3", "Ufa")
    val comp1 = Company("Und", address1)
    val comp2 = Company("foof", address2)
    val emp1 = Employee("Michail", comp1)
    val emp2 = Employee("Liza", comp2)
    val emp3 = Employee("Liza", null)

    println(employeeCity(emp1))
    println(employeeCity(emp2))
    println(employeeCity(emp3))
}

fun employeeCity(employee: Employee): String {
    return employee.company?.address?.city ?: "Неизвестен"
}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)