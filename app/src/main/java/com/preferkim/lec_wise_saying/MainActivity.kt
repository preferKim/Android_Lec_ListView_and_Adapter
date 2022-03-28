package com.preferkim.lec_wise_saying

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 코틀린 리스트 사용법
        val testList = mutableListOf<String>()
        testList.add("a")
        testList.add("b")
        testList.add("c")

        Log.d("MainActivity", testList.toString())

        Log.d("MainActivity", testList[1])


    }

}