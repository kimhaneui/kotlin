package com.example.kotlin

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setValues()
        setupEvents()
    }
    override fun setupEvents() {
        testBtn.setOnClickListener {
            testTxt.text="버튼눌림"
        }
    }

    override fun setValues() {
        testTxt.setOnClickListener {

        }
    }
}