package com.example.kotlinfoundations

import java.util.*

class Individual(
    private var name: String = "",
    private var age: Int = 0,
    private var passport: String?,
    private var gender: String = "M",
    private var weight: Double = 0.0,
    private var height: Double = 0.0,
    private var counter: Int = 0
): Individualable {

    constructor(name: String, age: Int, gender: String) : this(passport = "")
    constructor(name: String?, age: Int?, passport: String?, gender: String?, weight: Double?, height: Double?) : this(passport = "")


    //getters to access private var on Main.kt (objectList.forEach)
    fun getName(): String {
        return this.name
    }
    fun setName(name: String){
        this.name = name
    }

    fun getAge(): Int {
        return this.age
    }
    fun setAge(name: Int){
        this.age = age
    }

    fun getGender(): String {
        return this.gender
    }
    fun setGender(gender: String){
        this.gender = gender
    }

    fun getWeight(): Double {
        return this.weight
    }
    fun setWeight(weight: Double){
        this.weight = weight
    }

    fun getHeight(): Double {
        return this.height
    }
    fun setHeight(height: Double){
        this.height = height
    }

}

