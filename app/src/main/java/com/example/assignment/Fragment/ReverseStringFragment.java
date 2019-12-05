package com.example.assignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.assignment.R;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment implements View.OnClickListener {
    private Button btnCheck2;
    private EditText etString;
    private TextView tvReverseStr;
    private HashMap<Character, Integer> charCountMap;

    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_string2, container, false);

        btnCheck2=view.findViewById(R.id.btnCheck2);
        etString=view.findViewById(R.id.etString);
        tvReverseStr=view.findViewById(R.id.tvReverseStr);
        charCountMap=new HashMap<>();
        btnCheck2.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (!etString.getText().toString().isEmpty()) {
            StringBuffer c = new StringBuffer(etString.getText().toString());
            tvReverseStr.setText("The reverse of the string is " + c.reverse().toString());
        } else {
            etString.setError("Enter the string");
            etString.requestFocus();
        }

    }
}
