fun main() {
    val emp0 = User0("Michail", 19)
    val emp1 = User0("Liza", 14)
    val emp2 = User0("Roman", 23)
    val emp3 = User0("Kirill", 14)
    val emp4 = User0("Olga", 21)
    val emp5 = User0("Rolan", 33)
    val emp6 = User0("Alan", 34)

    val users = listOf(emp0, emp1, emp2, emp3, emp5, emp4, emp6)


    println(filterUserByAge(users, 18))
    println(filterUserByFirstLetter(users, 'A'))
    println(filterUserByCondition(users, ::conditionAgeMore18))
    println(filterUserByCondition(users) { it.age > 18 })
    println(filterUserByCondition(users) { it.name[0] == 'O' })
    println(filterUserByCondition(users, ::conditionFirstLetter))
    println(users.filter { it.age > 18 })
    println(users.filter { it.name[0] == 'O' })
}

fun conditionAgeMore18(user: User0): Boolean {
    return user.age > 18
}

fun conditionFirstLetter(user: User0): Boolean {
    return user.name[0] == 'O'
}

fun filterUserByCondition(users: List<User0>, condition: (User0) -> Boolean): List<User0> {
    val filterUsers = mutableListOf<User0>()
    for (user in users)
        if (condition(user))
            filterUsers.add(user)
    return filterUsers
}

data class User0(val name: String, val age: Int)

fun filterUserByAge(users: List<User0>, minAge: Int): List<User0> {
    val filterUsers = mutableListOf<User0>()
    for (user in users)
        if (user.age > minAge)
            filterUsers.add(user)
    return filterUsers
}

fun filterUserByFirstLetter(users: List<User0>, firstLetter: Char): List<User0> {
    val filterUsers = mutableListOf<User0>()
    for (user in users)
        if (user.name[0] == firstLetter)
            filterUsers.add(user)
    return filterUsers
}