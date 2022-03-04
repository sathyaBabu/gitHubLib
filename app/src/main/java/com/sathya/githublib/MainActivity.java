package com.sathya.githublib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sathya.gittoast.Tosta;
// https://www.youtube.com/watch?v=dah4ZP3eOVk
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tosta.GitToast(this,"Sathya");
    }
}