package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var countTeamA: Int = 0
    private var countTeamB: Int = 0

    private val modelView: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initObserves()
    }

    private fun initObserves() {
        val countTeamA = findViewById<TextView>(R.id.count_A)
        val countTeamB = findViewById<TextView>(R.id.count_B)
        modelView.countTeamA.observe(this) {
            countTeamA.text = it
        }

        modelView.countTeamB.observe(this) {
            countTeamB.text = it
        }

    }

    fun threePointA(view: View) {
        modelView.
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