import `null-safety`.SomeEmployee

/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val emp1 = SomeEmployee("Michail", 50000)
    val emp2 = SomeEmployee("Liza", 60000)
    val emp3 = SomeEmployee("Roman", 75000)
    val emp4 = SomeEmployee("Olga", 80000)

    val employees = listOf(emp1, emp2, emp3, emp4)

    try {
        val foundEmployee = findEmployeeBySalary(employees, 75000)
        foundEmployee.callToClient("Клиент Иванов")

        val notFoundEmployee = findEmployeeBySalary(employees, 100000)
        notFoundEmployee.callToClient("Клиент Петров")
    } catch (e: NullPointerException) {
        println(e.message)
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee {
    for (empl in employees)
        if (empl.salary == salary)
            return empl

    throw NullPointerException("Сотрудника с зп ${salary} не нашли")
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}