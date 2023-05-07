package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getSt = findViewById<Button>(R.id.getStartedBtn)
        getSt.setOnClickListener {
            val leagueIntent = Intent (this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}