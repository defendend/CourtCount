package com.example.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {

    private val modelView: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initObserves()
    }

    private fun initObserves() {
        val countTeamA = findViewById<TextView>(R.id.count_A)
        val countTeamB = findViewById<TextView>(R.id.count_B)
        modelView.countTeamA.observe(this){
            countTeamA.text = it.toString()
        }
        modelView.countTeamB.observe(this) {
            countTeamB.text = it.toString()
        }

    }

    fun threePointA(view: View) {
        modelView.plusThreePointTeamA()
    }

    fun twoPointA(view: View) {
        modelView.plusTwoPointTeamA()
    }

    fun onePointA(view: View) {
        modelView.plusOnePointTeamA()
    }

    fun threePointB(view: View) {
        modelView.plusThreePointTeamB()
    }

    fun twoPointB(view: View) {
        modelView.plusTwoPointTeamB()
    }

    fun onePointB(view: View) {
        modelView.plusOnePointTeamB()
    }

    fun reset(view: View) {
        modelView.reset()
    }
}