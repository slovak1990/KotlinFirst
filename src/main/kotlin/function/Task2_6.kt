/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    val age = readln().toInt()
    val experience = readln().toInt()
    val car = readln()

    println(getCarSharingAuto(age, experience, car))
}

fun getCarSharingAuto(age: Int, experience: Int, car:String): String {
    return if (age == 0)
        "подрасти чуток"
    else if (experience == 0)
        "нужен водительский опыт"
    else if (age < 21 || (age == 21 && experience < 2))
        "рано для каршеринга, приходи попозже"
    else
        if (age >= 26 && experience >= 6 && (car.lowercase() == "audi" || car.lowercase() == "bmw"))
            "тебе доступнa $car"
        else
           "можешь кататься на крестьянских авто"
}