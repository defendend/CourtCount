package com.example.courtcounter

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel {

    var countTeamA = 0
    var countTeamB = 0

    fun plusThreePointTeamA() {
        countTeamA += 3
    }

    fun plusThreePointTeamB() {
        countTeamB += 3
    }

    fun plusTwoPointTeamA() {
        countTeamA += 2
    }

    fun plusTwoPointTeamB() {
        countTeamB += 2
    }

    fun plusOnePointTeamA() {
        countTeamA += 1
    }

    fun plusOnePointTeamB() {
        countTeamB += 1
    }



}