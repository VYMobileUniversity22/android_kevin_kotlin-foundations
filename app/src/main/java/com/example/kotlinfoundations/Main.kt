package com.example.kotlinfoundations

fun main() {

    println("Enter a name: ")
    var name: String? = readLine()
    println("Enter an age: ")
    var age: Int? = readLine()?.toInt()
    println("Enter a gender (M or F): ")
    var gender: String? = readLine()
    println("Enter an weight: ")
    var weight: Double? = readLine()?.toDouble()
    println("Enter an height: ")
    var height: Double? = readLine()?.toDouble()
    var passport = ""

    //println("$name $age $gender $weight $height")

    val object1: Individual = Individual(name, age, gender, passport, weight, height)
    val object2: Individual = Individual(name = "Alberto", age = 42, gender = "M")
    val object3: Individual = Individual(name = "Miguel", age = 37, gender = "M", passport = "", weight = 10.0, height = 1.71, counter = 0)

    //Check if you're an adult or not
    if(age != null){
        val isOverAge = object1.isOverAge(age)
        if(isOverAge){
            println("You're an adult")
        }else{
            println("You're not an adult")
        }
    } else {
        println("Enter an age")
    }

    //Check if you're in an optimal weight or height
    if (weight != null && height != null) {
        val bmi = object1.calculateBMI(weight, height)
        if(bmi == -1){
            println("You're not on an optimal weight")
        } else if(bmi == 1){
            println("You're above optimal weight")
        } else{
            println("You're on a good weight")
        }
    } else {
        println("Error: Enter a weight, height or both")
    }

    //Print object input info
    println("Name: $name, Age: $age, Gender: $gender, weight: $weight, Height: $height")

    //Show every object data
    val objectList: List<Individual> = listOf(object1, object2, object3)
    objectList.forEach{
        println("Name: " + it.getName()) //Return each object name
        println("Age: " + it.getAge())
        println("Gender: " + it.getGender())
        println("Passport: " + it.generatePassport()) //Generate a passport for each object
        println("Weight: " + it.getWeight())
        println("Height: " + it.getHeight())
    }

}