package com.example.kotlin10

class Cat (name: String, age: Int): Pet(name, age), Pettable{

    override fun speak(): String{
        return "Meow"
    }

    override fun pet() {
        println("Cat $name is being petted")
    }
}