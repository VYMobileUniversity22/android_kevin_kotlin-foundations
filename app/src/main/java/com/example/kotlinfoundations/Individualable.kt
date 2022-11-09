package com.example.kotlinfoundations

import kotlin.math.pow
import kotlin.random.Random

interface Individualable {

    fun calculateBMI(weight: Double, height: Double) {
        var operation = weight / height * height

        //If its below optimal return -1
        //If its above optimal return 1
        //If none of this return 0

    }

    fun isOverAge(age: Int): Boolean {
        if (age > 18){
            return true
        }else if(age < 18){
            return false
        }
        return true
    }

    private fun checkGender() {

    }

    //Generate a 8-digit number
    fun generatePassport() {
        val randomPassport = List(5) { Random.nextInt(0, 9) }
        println(randomPassport)
    }

    //toString



}