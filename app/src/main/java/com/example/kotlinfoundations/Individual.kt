package com.example.kotlinfoundations

import java.util.*

fun main() {

}

class Individual(
    private var name: String? = "",
    private var age: Int? = 0,
    private var passport: String?,
    private var gender: Char = 'M',
    private var weight: Int = 0,
    private var height: Int = 0,
) {

    private var counter: Int = 0

    constructor(name: String, age: Int, gender: String) : this(passport = "")
    constructor(name: String, age: Int, passport: String, gender: String, weight: Double, height: Double) : this(passport = "")

}

