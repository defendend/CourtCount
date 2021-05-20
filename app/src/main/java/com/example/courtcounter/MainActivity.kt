package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var countTeamA: Int = 0
    private var countTeamB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display()
    }

    private fun display() {
        displayTeamA()
        displayTeamB()
    }

    private fun displayTeamA() {
        val counterTeamA = findViewById(R.id.count_A) as TextView
        counterTeamA.text = "$countTeamA"
    }

    private fun displayTeamB() {
        val counterTeamB = findViewById(R.id.count_B) as TextView
        counterTeamB.text = "$countTeamB"
    }

    fun threePointA(view: View) {
        countTeamA += 3
        displayTeamA()
    }

    fun twoPointA(view: View) {
        countTeamA += 2
        displayTeamA()
    }

    fun onePointA(view: View) {
        countTeamA += 1
        displayTeamA()
    }

    fun threePointB(view: View) {
        countTeamB += 3
        displayTeamB()
    }

    fun twoPointB(view: View) {
        countTeamB += 2
        displayTeamB()
    }

    fun onePointB(view: View) {
        countTeamB += 1
        displayTeamB()
    }

    fun reset(view: View) {
        countTeamA = 0
        countTeamB = 0
        display()
    }
}