package com.example.adore.double_j;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class howtoplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoplay);
    }
    public void back(View v)
    {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
