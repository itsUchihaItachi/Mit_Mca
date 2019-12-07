package com.example.mitmca.contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mitmca.R;

import java.util.ArrayList;

public class ContactRecyclerDataAdapter extends RecyclerView.Adapter<ContactRecyclerDataAdapter.DataViewHolder> {

    private ArrayList<ContactDataItem> dataList;

    public ContactRecyclerDataAdapter(ArrayList<ContactDataItem> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, null, false);
        return new ContactRecyclerDataAdapter.DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder,final int position) {
        ContactDataItem dataItem = dataList.get(position);
        holder.imageView.setImageResource(ContactDataItem.resId);
        holder.titleTextView.setText(ContactDataItem.title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public ImageView imageView;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            titleTextView = itemView.findViewById(R.id.contactList_text_view);
        }
    }
}
