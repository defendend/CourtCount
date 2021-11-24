package com.example.courtcounter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var countTeamA = MutableLiveData(0)
    var countTeamB = MutableLiveData(0)

    fun plusThreePointTeamA() {
        updateCountA(3)
    }

    fun plusTwoPointTeamA() {
        updateCountA(2)
    }

    fun plusOnePointTeamA() {
        updateCountA(1)
    }

    fun plusThreePointTeamB() {
        updateCountB(3)
    }

    fun plusTwoPointTeamB() {
        updateCountB(2)
    }

    fun plusOnePointTeamB() {
        updateCountB(1)
    }

    fun reset(){
        countTeamA.value = 0
        countTeamB.value = 0
    }

    private fun getCountAValue(): Int{
        return countTeamA.value?: 0
    }

    private fun getCountBValue(): Int{
        return countTeamB.value?: 0
    }

    private fun updateCountA(number : Int) {
        countTeamA.value = getCountAValue() + number
    }

    private fun updateCountB(number : Int){
        countTeamB.value = getCountBValue() + number
    }



}