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

    println(name + " " + age + " " + gender + " " + weight + " " + height)
}