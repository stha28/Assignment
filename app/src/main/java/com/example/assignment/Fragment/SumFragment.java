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
public class SumFragment extends Fragment implements View.OnClickListener{
    private Button btnAdd;
    private EditText etFirst, etSecond;
    private TextView tvSum;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_sum2,container,false);

        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        btnAdd=view.findViewById(R.id.btnAdd);
        tvSum=view.findViewById(R.id.tvSum);

        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etFirst.getText().toString())){
            etFirst.setError("Enter First number");
            etFirst.requestFocus();
        }
        else if(TextUtils.isEmpty(etSecond.getText().toString())){
            etSecond.setError("Enter Second Number");
            etSecond.requestFocus();
        }
        else {
            //Calculation
            int first=Integer.parseInt(etFirst.getText().toString());
            int second=Integer.parseInt(etSecond.getText().toString());
            int result=first+second;
            tvSum.setText("Sum is " + result);
        }

    }
}
