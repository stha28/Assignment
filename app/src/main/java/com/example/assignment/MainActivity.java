package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.assignment.Fragment.AutomorphicFragment;
import com.example.assignment.Fragment.CircleFragment;
import com.example.assignment.Fragment.PalindromeFragment;
import com.example.assignment.Fragment.ReverseFragment;
import com.example.assignment.Fragment.ReverseStringFragment;
import com.example.assignment.Fragment.SumFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnSum,btnPalindrome,btnReverse,btnCircle,btnReverseStr,btnAutomorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum=findViewById(R.id.btnSum);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnReverse=findViewById(R.id.btnReverse);
        btnCircle=findViewById(R.id.btnCircle);
        btnReverseStr=findViewById(R.id.btnReverseStr);
        btnAutomorphic=findViewById(R.id.btnAutomrphic);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                SumFragment sumFragment=new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.commit();
            }
        });

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                CircleFragment circleFragment=new CircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,circleFragment);
                fragmentTransaction.commit();
            }
        });

        btnPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                PalindromeFragment palindromeFragment=new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseFragment reverseFragment=new ReverseFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseFragment);
                fragmentTransaction.commit();
            }
        });

        btnReverseStr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ReverseStringFragment reverseStringFragment=new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseStringFragment);
                fragmentTransaction.commit();
            }
        });

        btnAutomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.commit();
            }
        });


    }
}
