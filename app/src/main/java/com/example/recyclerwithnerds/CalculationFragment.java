package com.example.recyclerwithnerds;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CalculationFragment extends Fragment {
     EditText firstNumber;
     EditText secondNumber;
     Button button;
    int sum = 0;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.calculation_fragment, container, false);

        firstNumber = rootView.findViewById(R.id.ed_first_number);
        secondNumber = rootView.findViewById(R.id.ed_second_number);
        button = rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sum = Integer.parseInt(firstNumber.getText().toString()) + Integer.parseInt(secondNumber.getText().toString());
                button.setText("sum = " + sum);
            }
        });
        return rootView;
    }
}
