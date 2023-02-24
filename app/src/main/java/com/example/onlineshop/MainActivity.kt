package com.example.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlineshop.feature.sign_in.SignInFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val bottomBar: BottomNavigationView by lazy { findViewById(R.id.bnvBar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar.itemIconTintList = null

        supportFragmentManager.beginTransaction().replace(R.id.container, SignInFragment())
            .commit()
    }
}