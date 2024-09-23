package data_classes/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = User("Kirill", 23, 3)
    val user2 = User("Olga", 19, 1)
    val user3 = User("Nikolay", 38, 12)
    val car1 = Car("Audi", 12)
    val car2 = Car("BMW", 12)

    println(checkCarSharing(user1))
    println(checkCarSharing(user2))
    println(getCarSharingAuto(user1, car1))
    println(getCarSharingAuto(user2, car2))
    println(getCarSharingAuto(user3, car2))
}


fun checkCarSharing(user: User): String {
    return if (user.age == 0)
        "подрасти чуток"
    else if (user.experience == 0)
        "нужен водительский опыт"
    else if (user.age < 21 || (user.age == 21 && user.experience < 2))
        "рано для каршеринга, приходи попозже"
    else
        if (user.age >= 26 && user.experience >= 6)
            "тебе доступны Audi и BMW"
        else
            "можешь кататься на крестьянских авто"
}

fun getCarSharingAuto(user:User, car:Car): String {
    return if (user.age == 0)
        "подрасти чуток"
    else if (user.experience == 0)
        "нужен водительский опыт"
    else if (user.age < 21 || (user.age == 21 && user.experience < 2))
        "рано для каршеринга, приходи попозже"
    else
        if (user.age >= 26 && user.experience >= 6 && (car.model.lowercase() == "audi" || car.model.lowercase() == "bmw"))
            "тебе доступнa ${car.model}"
        else
            "можешь кататься на крестьянских авто"
}

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val model: String, val price: Int)