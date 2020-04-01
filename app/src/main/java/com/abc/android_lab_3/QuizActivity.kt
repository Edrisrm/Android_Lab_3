package com.abc.android_lab_3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Toast

class QuizActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    }

    fun clickDisplayCorrectToast(view: View) {
        Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()
    }

    fun clickDisplayIncorrectToast(view: View) {
        Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
    }

    public override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    public override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    public override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    public override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    public override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }

    companion object {

        private val TAG = "QuizActivity"
    }


}
