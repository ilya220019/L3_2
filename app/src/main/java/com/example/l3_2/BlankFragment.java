package com.example.l3_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BlankFragment extends Fragment {
    Button btnPlus, btnMinus;
    TextView textView;
    int num = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
    }
    private void initView() {
        btnMinus = requireActivity().findViewById(R.id.btn_minus);
        btnPlus = requireActivity().findViewById(R.id.btn_plus);
        textView = requireActivity().findViewById(R.id.tv_number);

    }
    private void initListener() {
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num++;
                textView.setText(String.valueOf(num));

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num--;
                textView.setText(String.valueOf(num));

            }
        });
    }


}