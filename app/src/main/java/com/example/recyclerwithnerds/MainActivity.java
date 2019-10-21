package com.example.recyclerwithnerds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        StringFragment stringFragment = new StringFragment();
        CalculationFragment calculationFragment = new CalculationFragment();
        SwitchFragment switchFragment = new SwitchFragment();

        fragmentManager.beginTransaction().add(R.id.fragment1,stringFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment2,calculationFragment).commit();
        fragmentManager.beginTransaction().add(R.id.fragment3,switchFragment).commit();
    }


}
