package com.example.kotlinfoundations

import java.util.*

fun main() {
    val individual: Individual = Individual(name = "Kevin", age = 29, gender = 'M')

}

class Individual(
    private var name: String = "",
    private var age: Int = 0,
    private var passport: String,
    private var gender: Char = 'M',
    private var weight: Int = 0,
    private var height: Int = 0,
    private var counter: Int = 0
): Individualable {

    constructor(name: String, age: Int, gender: Char) : this(passport = "")
    constructor(name: String, age: Int, passport: String, gender: String, weight: Int, height: Int) : this(passport = "")

}

