package com.example.mitmca;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mitmca.links.LinksHome;

import java.util.ArrayList;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder>{

    private ArrayList<DataItem> dataList;

    public RecyclerDataAdapter(ArrayList<DataItem> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null, false);
        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, final int position) {
        DataItem dataItem = dataList.get(position);
        holder.imageView.setImageResource(dataItem.resId);
        holder.titleTextView.setText(dataItem.title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 8:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;

                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView imageView;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            titleTextView = itemView.findViewById(R.id.title_text_view);
        }
    }
}
