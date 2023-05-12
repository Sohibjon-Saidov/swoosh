package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.ToggleButton

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    lateinit var mlb: ToggleButton
    lateinit var wlb: ToggleButton
    lateinit var clb: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        mlb = findViewById<ToggleButton>(R.id.mensLeagueBtn)
        wlb = findViewById<ToggleButton>(R.id.womensLeagueBtn)
        clb = findViewById<ToggleButton>(R.id.coedLeagueBtn)
    }
    fun onMensClicked(view: View) {
        wlb.isChecked = false
        clb.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        mlb.isChecked = false
        clb.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {
        wlb.isChecked = false
        mlb.isChecked = false

        selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select the league", Toast.LENGTH_SHORT).show()
        }
    }
}