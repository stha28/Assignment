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
public class CircleFragment extends Fragment implements View.OnClickListener {
    private Button btnCalculate;
    private EditText etRadius;
    private TextView tvArea;


    public CircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_circle, container, false);

        btnCalculate=view.findViewById(R.id.btnCalculate);
        etRadius=view.findViewById(R.id.etRadius);
        tvArea=view.findViewById(R.id.tvArea);

        btnCalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etRadius.getText())){
            etRadius.setError("Enter the radius");
            etRadius.requestFocus();
        }
        else {
            int radius = Integer.parseInt(etRadius.getText().toString());
            double result = 3.14 * radius * radius;
            tvArea.setText("Area of Circle is " + result);
        }

    }
}
