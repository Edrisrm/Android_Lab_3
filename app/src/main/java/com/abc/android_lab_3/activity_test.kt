package com.abc.android_lab_3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_test : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
    }

    fun clickDisplayCorrectToast(view: View) {
        val intent = Intent(this, activity_test::class.java)
        startActivity(intent)
    }
}
