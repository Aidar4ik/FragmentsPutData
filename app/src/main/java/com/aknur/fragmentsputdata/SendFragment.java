package com.aknur.fragmentsputdata;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class SendFragment extends Fragment {

    EditText editText;
    Button btnAdd;
    Button btnHide;
    Button btnShow;
    Ifragments ifragments;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        ifragments = (Ifragments) context;
    }


    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_send, container, false);
        editText = view.findViewById(R.id.etText);
        btnAdd = view.findViewById(R.id.added);
        btnHide = view.findViewById(R.id.hided);
        btnShow = view.findViewById(R.id.showed);


        btnAdd.setOnClickListener(view1 -> {
            String text = editText.getText().toString();
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.onSendText(text);
            editText.setText("");
        });

        btnHide.setOnClickListener(view12 -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.hide("hide");
        });

        btnShow.setOnClickListener(view13 -> {
            MainActivity mainActivity = (MainActivity) getActivity();
            mainActivity.hide("show");
        });

        return view;
    }

}
