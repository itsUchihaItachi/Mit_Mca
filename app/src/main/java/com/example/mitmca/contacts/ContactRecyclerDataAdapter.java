package com.example.mitmca.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mitmca.R;
import com.example.mitmca.RecyclerDataAdapter;

import java.util.ArrayList;

public class ContactRecyclerDataAdapter extends RecyclerView.Adapter<ContactRecyclerDataAdapter.DataViewHolder> {

    private ArrayList<ContactDataItem> dataList;

    public ContactRecyclerDataAdapter(ArrayList<ContactDataItem> dataList) {
        this.dataList = dataList;
    }

    public ContactRecyclerDataAdapter.DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null, false);
        return new ContactRecyclerDataAdapter.DataViewHolder(itemView);
    }

    public void onBindViewHolder(@NonNull RecyclerDataAdapter.DataViewHolder holder, final int position) {
        ContactDataItem dataItem = dataList.get(position);
        holder.imageView.setImageResource(dataItem.resId);
        holder.titleTextView.setText(dataItem.title);


}
