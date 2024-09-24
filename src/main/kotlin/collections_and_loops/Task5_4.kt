/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department и возвращает средний возраст сотрудников этого отдела
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

    val empList1 = listOf(emp0, emp2, emp4, emp6)
    val empList2 = listOf(emp1, emp3, emp5, emp7, emp7, emp8)

    val dep1 = Department5("IT", empList1)
    val dep2 = Department5("logistic", empList2)

    println(getAverageAgesDepEmployees(dep1))
    println(getAverageAgesDepEmployees(dep2))
}

fun getAverageAgesDepEmployees(depEmpl: Department5): Int {
    var sumAges = 0
    val listAges: MutableList<Int> = mutableListOf()

    for (ages in depEmpl.employee5s) {
        listAges.add(ages.age)
    }

    for (empl in listAges) {
        sumAges += empl
    }
    return sumAges / depEmpl.employee5s.size
}