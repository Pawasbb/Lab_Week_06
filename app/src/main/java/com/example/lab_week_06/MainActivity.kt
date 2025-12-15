package com.example.lab_week_06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val catList = listOf(
            Cat("Persian", "Long fur cat", android.R.drawable.ic_menu_gallery),
            Cat("Maine Coon", "Big body cat", android.R.drawable.ic_menu_gallery),
            Cat("Siamese", "Blue eyes cat", android.R.drawable.ic_menu_gallery),
            Cat("Bengal", "Wild pattern cat", android.R.drawable.ic_menu_gallery),
            Cat("Sphynx", "Hairless cat", android.R.drawable.ic_menu_gallery),
            Cat("Ragdoll", "Cute calm cat", android.R.drawable.ic_menu_gallery),
            Cat("British Shorthair", "Round face cat", android.R.drawable.ic_menu_gallery),
            Cat("Scottish Fold", "Folded ear cat", android.R.drawable.ic_menu_gallery),
            Cat("Abyssinian", "Active cat", android.R.drawable.ic_menu_gallery),
            Cat("Norwegian Forest", "Thick fur cat", android.R.drawable.ic_menu_gallery)
        )


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CatAdapter(catList)
    }
}
