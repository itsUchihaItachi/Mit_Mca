package com.example.mitmca;

<<<<<<< HEAD
import android.content.Intent;
import android.util.Log;
=======
>>>>>>> 4565028... Main menu icons changed
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

<<<<<<< HEAD
import com.example.mitmca.links.LinksHome;

=======
>>>>>>> 4565028... Main menu icons changed
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
<<<<<<< HEAD
    public void onBindViewHolder(@NonNull DataViewHolder holder, final int position) {
=======
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
>>>>>>> 4565028... Main menu icons changed
        DataItem dataItem = dataList.get(position);
        holder.imageView.setImageResource(dataItem.resId);
        holder.titleTextView.setText(dataItem.title);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
<<<<<<< HEAD
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        Intent intent = new Intent(v.getContext(), LinksHome.class);
                        v.getContext().startActivity(intent);
                        break;

                }

=======
                
>>>>>>> 4565028... Main menu icons changed
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
