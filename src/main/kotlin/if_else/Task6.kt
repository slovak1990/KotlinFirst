/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val age = readln().toInt()
    val experience = readln().toInt()
    val car = readln()

    if (age == 0)
        println("подрасти чуток")
    else if (experience == 0)
        println("нужен водительский опыт")
    else if (age < 21 || (age == 21 && experience < 2))
        println("рано для каршеринга, приходи попозже")
    else
        if (age >= 26 && experience >= 6 && (car == "Audi" || car == "BMW"))
            println("тебе доступнa $car")
        else
            println("можешь кататься на крестьянских авто")
}