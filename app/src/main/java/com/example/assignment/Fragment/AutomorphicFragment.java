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
public class AutomorphicFragment extends Fragment implements View.OnClickListener{
    private Button btnCheck2;
    private EditText etNumber2;
    private TextView tvAutomorphic;



    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_automorphic, container, false);

        btnCheck2=view.findViewById(R.id.btnCheck2);
        etNumber2=view.findViewById(R.id.etNumber2);
        tvAutomorphic=view.findViewById(R.id.tvAutomorphic);

        btnCheck2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etNumber2.getText())) {
            etNumber2.setError("Enter the number");
            etNumber2.requestFocus();
        }
        else {
            int num = Integer.parseInt(etNumber2.getText().toString());
            int sq_num = num * num;

            String str_num = Integer.toString(num);
            String square = Integer.toString(sq_num);

            if (square.endsWith(str_num)) {
                tvAutomorphic.setText(num + " is a Automorphic Number");
            }
            else{
                tvAutomorphic.setText(num + " is not a Automorphic Number");
            }
        }

    }
}
