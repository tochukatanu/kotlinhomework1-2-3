package ru.netology

fun main() {

    var purchaseSum = 900 // var - условно, тк в теории меняется при ОС от пользователя
    val fixedDiscount = 100.0
    val discount = 0.05
    val monthlyDiscountRate = 0.01
    var total = 0.0
    val isRegularCustomer = false // при изменении на true применяется скидка постоянного покупателя
    if (purchaseSum < 0) {
        println("Сумма покупки не может быть отрицательной")
    }
//    total = if (0 < purchaseSum && purchaseSum < 1000) {
//        purchaseSum
//    } else if (1000 < purchaseSum && purchaseSum < 10_000) {
//        purchaseSum - fixedDiscount
//    } else {
//        purchaseSum - purchaseSum * discount
//    }
    total = when (purchaseSum) {
        in 0..1000 -> purchaseSum.toDouble()
        in 1001..10000 -> purchaseSum - fixedDiscount
        else -> purchaseSum - purchaseSum * discount
    }
    if (isRegularCustomer) {
        total -= total * monthlyDiscountRate
    }
    println("Сумма вашей покупки $total")
}