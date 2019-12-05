package com.example.assignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private Button btnCheck;
    private EditText etNumber;
    private TextView tvPalindrome;

    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_palindrome2, container, false);

        btnCheck=view.findViewById(R.id.btnCheck);
        etNumber=view.findViewById(R.id.etNumber);
        tvPalindrome=view.findViewById(R.id.tvPalindrome);

        btnCheck.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etNumber.getText())) {
            etNumber.setError("Enter the number");
            etNumber.requestFocus();
        }
        else {
            int number;
            number = Integer.parseInt(etNumber.getText().toString());
            int q = number;
            int i, reverse = 0;
            for (i = 0; i <= number; i++) {
                reverse = reverse * 10;
                reverse = reverse + number % 10;
                number = number / 10;
                i = 0;
            }
            if (reverse == q) {
                tvPalindrome.setText(q + " is a Palindrome Number");
            } else {
                tvPalindrome.setText(q + " is not a Palindrome Number");
            }
        }
    }
}
