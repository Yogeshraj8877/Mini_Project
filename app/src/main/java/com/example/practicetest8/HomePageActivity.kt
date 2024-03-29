package com.example.practicetest8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        LoadFragment(HomeFragment())
        val buttomNav= findViewById<BottomNavigationView>(R.id.bottomNav)
        buttomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->LoadFragment(HomeFragment(

                ))
                R.id.product->LoadFragment(ProductFragment())
                R.id.profile->LoadFragment(ProfileFragment())

            }
            true
        }
    }
    private fun LoadFragment(framgment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,framgment).commit()
    }
}
