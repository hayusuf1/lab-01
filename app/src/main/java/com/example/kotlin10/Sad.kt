package com.example.kotlin10

class Sad (date: String) : Mood(date) {

    override fun moodType(): String {
        return "Sad!"
    }

}