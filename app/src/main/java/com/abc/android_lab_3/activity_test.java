package com.abc.android_lab_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }
    public void clickDisplayCorrectToast(View view){
        Intent intent = new Intent( this, activity_test.class );
        startActivity(intent);
    }
}
