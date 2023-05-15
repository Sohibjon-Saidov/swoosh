package controller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.swoosh.R


class MainActivity : BaseActivity() {
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