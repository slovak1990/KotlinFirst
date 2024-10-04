package `null-safety`/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val emp1 = SomeEmployee("Michail", 50000)
    val emp2 = SomeEmployee("Liza", 60000)
    val emp3 = SomeEmployee("Roman", 75000)
    val emp4 = SomeEmployee("Olga", 80000)

    val employees = listOf(emp1, emp2, emp3, emp4)

    val foundEmployee = findEmployeeBySalary(employees, 75000)
    foundEmployee?.callToClient("Клиент Иванов")

    val notFoundEmployee = findEmployeeBySalary(employees, 100000)
    notFoundEmployee?.callToClient("Клиент Петров")
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    return employees.find { it.salary == salary }
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}