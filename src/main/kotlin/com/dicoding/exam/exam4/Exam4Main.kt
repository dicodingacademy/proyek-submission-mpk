package com.dicoding.exam.exam4

private fun main() {
    val petrolCar = Car("Honda", 2018)
    val evCar = ElectricCar("Hyundai", 2022, 75)

    println(petrolCar.getCarInfo())
    println(evCar.getCarInfo())
}
