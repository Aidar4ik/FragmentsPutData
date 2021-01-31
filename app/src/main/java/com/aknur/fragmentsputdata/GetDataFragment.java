package com.aknur.fragmentsputdata;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class GetDataFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<ItemRecycler> list;
    private GetDataApapter adapter;
    ItemRecycler itemRecycler;
    ItemRecycler s;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_get_data, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recycler_view);
        list=new ArrayList<>();

        adapter = new GetDataApapter(list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);
    }

    public void showText(String text){
        itemRecycler = new ItemRecycler(text);
        list.add(itemRecycler);
        adapter.notifyDataSetChanged();
    }
    public void getFragment(){

    }
}