package com.aknur.fragmentsputdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements Ifragments {

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.acthides);

    }

    @Override
    public void onSendText(String text) {
        fragmentManager = getSupportFragmentManager();
        GetDataFragment fragment = (GetDataFragment) fragmentManager.findFragmentById(R.id.second_fragment);
        transaction = fragmentManager.beginTransaction();
        fragment.showText(text);
    }

    @Override
    public void hide(String text) {
        linearLayout=findViewById(R.id.acthides);
        if(text.equals("hide")){
            linearLayout.setVisibility(View.GONE);
        }
        else if(text.equals("show")){
            linearLayout.setVisibility(View.VISIBLE);
        }
    }

}