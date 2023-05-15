package controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.ToggleButton
import com.example.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    lateinit var begginSb: ToggleButton
    lateinit var ballerSb: ToggleButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println()

        begginSb = findViewById<ToggleButton>(R.id.beginnerSkillBtn)
        ballerSb = findViewById<ToggleButton>(R.id.ballerSkillBtn)
    }

    fun onBallerClick(view: View) {
        begginSb.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSb.isChecked = false
        skill = "beginner"

    }

    fun onSkillFinishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, activity_finish::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)

        }else{
            Toast.makeText(this, "Please select level", Toast.LENGTH_SHORT).show()
        }
    }
}
