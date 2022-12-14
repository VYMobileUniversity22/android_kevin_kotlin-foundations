package com.example.kotlinfoundations

interface Individualable {

    fun calculateBMI(weight: Double, height:Double): Int{
        val bmi: Double = weight.toDouble() / (height * height)
        return if (bmi < 18.5) {
            -1
        } else if (bmi > 25) {
            1
        } else {
            0
        }
    }

    fun isOverAge(age: Int): Boolean {
        return age >= 18
    }

    fun checkGender(gender: Char): Char {
        if(gender != 'M' && gender != 'F') return 'M'
        return gender
    }

    fun String.toString(): String {
        return "Hola"
    }

    //Generate a 8-digit number
    fun generatePassport(): Int {
        return (10000000..99999999).random()
    }

}