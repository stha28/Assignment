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

import com.example.assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseFragment extends Fragment implements View.OnClickListener {
    private Button btnCheck1;
    private EditText etNumber1;
    private TextView tvReverse;


    public ReverseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse, container, false);

        btnCheck1=view.findViewById(R.id.btnCheck1);
        etNumber1=view.findViewById(R.id.etNumber1);
        tvReverse=view.findViewById(R.id.tvReverse);

        btnCheck1.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etNumber1.getText())){
            etNumber1.setError("Enter the number");
            etNumber1.requestFocus();
        }
        else {
            int number = Integer.parseInt(etNumber1.getText().toString());
            int num = number, reversed = 0;
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            tvReverse.setText("The reverse of the number is " + reversed);
        }
    }
}
