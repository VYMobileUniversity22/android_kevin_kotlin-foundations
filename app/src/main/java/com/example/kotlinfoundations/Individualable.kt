package com.example.kotlinfoundations

import kotlin.math.pow
import kotlin.random.Random

interface Individualable {

    fun calculateBMI(weight:Int, height:Double): Int{
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
        return if(gender == 'M' || gender == 'F') 'M'
        else gender

    }

    fun String.toString(): String {
        return "Hola"
    }

    //Generate a 8-digit number
    fun generatePassport(): Int {
        return (10000000..99999999).random()
    }



}