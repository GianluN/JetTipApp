package com.example.jettipapp.util

fun calculateTotalTip(totalBill: Double, tipPercetage: Int): Double {
    return if (totalBill > 1 && totalBill.toString().isNotEmpty()) (totalBill * tipPercetage) / 100
    else 0.0
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercetage: Int
): Double {
    val bill = calculateTotalTip(totalBill, tipPercetage) + totalBill
    return (bill / splitBy)
}