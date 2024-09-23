package collections_and_loops

import Car5
import data_classes.User

/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = User("Kirill", 23, 3)
    val user2 = User("Olga", 19, 1)
    val user3 = User("Nikolay", 38, 12)

    val cars = listOf(
        Car5("Audi", "Q7", 12.0),
        Car5("BMW", "M5", 16.9),
        Car5("Toyota", "Corolla", 1.8),
        Car5("Ford", "Focus", 2.0),
        Car5("Hyundai", "Elantra", 1.6)
    )

    println("Доступные тачки для ${user1.name}: ${getAvailableCars(user1, cars)}")
    println("Доступные тачки для ${user2.name}: ${getAvailableCars(user2, cars)}")
    println("Доступные тачки для ${user3.name}: ${getAvailableCars(user3, cars)}")
}

fun getAvailableCars(user: User, cars: List<Car5>): List<Car5> {
    val availableCars = mutableListOf<Car5>()
    for (car in cars) {
        if (user.age == 0 || user.experience == 0 || (user.age < 21 || (user.age == 21 && user.experience < 2))) {
            continue
        } else if (user.age >= 26 && user.experience >= 6 && car.brand.lowercase() in listOf("audi", "bmw")) {
            availableCars.add(car)
        } else if (car.brand.lowercase() !in listOf("audi", "bmw")) {
            availableCars.add(car)
        }
    }
    return availableCars
}