package com.example.kotlin10

class Happy (date: String): Mood(date) {

    override fun moodType(): String{
        return "Happy!"
    }

}