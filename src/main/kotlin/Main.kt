fun main() {
    val weekSales = listOf(19, 12, 14, 17, 23)
    var counter = 0

    for (sale in weekSales) {
        if (sale > 15)
            println(sale)
    counter++
}
    println(counter)
}
