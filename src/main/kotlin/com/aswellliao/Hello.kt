package com.aswellliao

fun main(args: Array<String>) {
    println("Hello world")
//    Human().hello()
    val h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("Hello Kotlin");
    }
}