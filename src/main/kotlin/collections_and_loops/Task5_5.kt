/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
*/

fun main() {
    val emp0 = Employee5("Michail", 19)
    val emp1 = Employee5("Liza", 51)
    val emp2 = Employee5("Roman", 23)
    val emp3 = Employee5("Kirill", 14)
    val emp4 = Employee5("Olga", 21)
    val emp5 = Employee5("Rolan", 33)
    val emp6 = Employee5("Alan", 34)
    val emp7 = Employee5("Anna", 54)
    val emp8 = Employee5("Artem", 61)
    val emp9 = Employee5("Denis", 34)
    val emp01 = Employee5("Algis", 87)
    val emp02 = Employee5("Sergey", 41)
    val emp03 = Employee5("Valera", 18)

    val dep1 = Department5("IT", listOf(emp0, emp2, emp6, emp9, emp02))
    val dep2 = Department5("logistic", listOf(emp1, emp3, emp7))
    val dep3 = Department5("food", listOf(emp5, emp7, emp01, emp03))
    val dep4 = Department5("TV", listOf(emp4, emp8))

    val comp1 = Company5("undex", listOf(dep1, dep3))
    val comp2 = Company5("foogle", listOf(dep2, dep4))

    println("Общее количество работников в компнании ${comp1.name} равно: ${totalNumberOfEmployees(comp1)}, средний возраст которых равен ${averageAgeOfEmployees(comp1)}")
    println("Общее количество работников в компнании ${comp2.name} равно: ${totalNumberOfEmployees(comp2)}, средний возраст которых равен ${averageAgeOfEmployees(comp2)}")
}

fun totalNumberOfEmployees(company: Company5): Int {
    var countEmp = 0
    for (department in company.department5s) {
        countEmp += department.employee5s.size
    }
    return countEmp
}

fun averageAgeOfEmployees(company: Company5): Int {
    var totalAge = 0
    var countEmp = 0
    for (department in company.department5s) {
        for (employee in department.employee5s) {
            totalAge += employee.age
            countEmp++
        }
    }
    return if (countEmp > 0) totalAge / countEmp else 0
}