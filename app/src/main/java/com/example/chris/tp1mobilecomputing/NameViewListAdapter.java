package com.example.chris.tp1mobilecomputing;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NameViewListAdapter extends RecyclerView.Adapter<NameViewHolder>
{
    List<String> nameList;

    public NameViewListAdapter()
    {
        nameList = new ArrayList<>();
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_name, viewGroup, false);
        return new NameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder nameViewHolder, int i)
    {
        nameViewHolder.setContent(nameList.get(i));
    }

    @Override
    public int getItemCount()
    {
        return nameList.size();
    }

    public void updateData(List<String> nameList)
    {
        this.nameList.clear();
        this.nameList.addAll(nameList);
        notifyDataSetChanged();
    }
}
