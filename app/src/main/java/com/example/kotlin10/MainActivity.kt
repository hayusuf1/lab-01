package com.example.kotlin10

import android.os.Bundle
import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin10.ui.theme.Kotlin10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cat = Cat("Coco", 6)
        val dog = Dog("Mochi", 6)
        val scorpion = Scorpion("Stinger", 32)

        val pets = mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        println(pets)

        // OR val pets= mutableListOf(cat, dog, scorpion)

        val pettablePets = mutableListOf<Pettable>()

        pettablePets.add(cat)
        pettablePets.add(dog)
       // pettablePets.add(scorpion)

        println(pettablePets)
        // Or val pettablePets = mutableListOf<Pettable>(cat, dog, scorpion)

        val happy = Happy("2026-09-01")
        val sad = Sad("2026-08-31")

        val petMoods = mutableListOf(happy, sad)

        println(petMoods)
    }
}
