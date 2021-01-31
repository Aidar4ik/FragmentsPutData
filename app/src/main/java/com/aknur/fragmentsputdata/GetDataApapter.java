package com.aknur.fragmentsputdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class GetDataApapter extends RecyclerView.Adapter<GetDataApapter.MainViewHolder> {

    List<ItemRecycler> list;
    GetDataFragment context;

    public GetDataApapter(List<ItemRecycler> list, GetDataFragment context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public GetDataApapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GetDataApapter.MainViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.txtItem);
        }

        public void onBind(ItemRecycler itemRecycler) {
            textView.setText(itemRecycler.getText());
        }
    }
}
