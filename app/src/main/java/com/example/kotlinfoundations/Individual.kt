package com.example.kotlinfoundations

import java.util.*

class Individual(
    private var name: String = "",
    private var age: Int = 0,
    private var passport: String,
    private var gender: String = "M",
    private var weight: Int = 0,
    private var height: Int = 0,
    private var counter: Int = 0
): Individualable {

    constructor(name: String, age: Int, gender: Char) : this(passport = "")
    constructor(name: String, age: Int, passport: String, gender: String, weight: Int, height: Int) : this(passport = "")

    fun setName(name: String){
        this.name = name
    }
    fun setAge(name: Int){
        this.age = age
    }
    fun setGender(gender: String){
        this.gender = gender
    }
    fun setWeight(weight: Int){
        this.weight = weight
    }
    fun setHeight(height: Int){
        this.height = height
    }

}

