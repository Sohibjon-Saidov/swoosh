package controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.swoosh.R

class activity_finish : AppCompatActivity() {

    lateinit var searchLt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        searchLt = findViewById<TextView>(R.id.searchLeagueText)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLt.text = "Looking for $league $skill league near you..."
    }
}