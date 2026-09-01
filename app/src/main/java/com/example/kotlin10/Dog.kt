package com.example.kotlin10

class Dog (name: String, age: Int): Pet(name, age), Pettable {

    override fun speak(): String {
        return "bark"
    }

    override fun pet() {
        println("Doggie $name is being petted")
    }
}