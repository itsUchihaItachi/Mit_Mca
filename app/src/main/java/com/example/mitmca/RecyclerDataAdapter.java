package com.example.mitmca;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mitmca.attandance.QrScan;
import com.example.mitmca.calendar.ShowEvent;
import com.example.mitmca.contacts.ContactMainActivity;
import com.example.mitmca.forums.ForumsMainActivity;
import com.example.mitmca.links.LinksHome;
import com.example.mitmca.news.NewsMainActivity;
import com.example.mitmca.paper.PaperMainActivity;
import com.example.mitmca.tt.TTMainActivity;

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
     //   Intent intent = new Intent();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position)
                {
                    case 0:
                        //Intent intent = new Intent(v.getContext(), newsMainActivity.class);
                        //v.getContext().startActivity(intent);

                        NewsMainActivity.start(v.getContext());
                        break;
                    case 1:
                        //Intent intent = new Intent(v.getContext(), LinksHome.class);
                        //v.getContext().startActivity(intent);

                        //LinksHome.start(v.getContext());

                        MapsActivity.start(v.getContext());
                        break;
                    case 2:
                        //Intent intent = new Intent(v.getContext(), CalendarMainActivity.class);
                        //v.getContext().startActivity(intent);

                        ShowEvent.start(v.getContext());
                        break;
                    case 3:
                       // Intent intent = new Intent(v.getContext(), TTMainActivity.class);
                        // v.getContext().startActivity(intent);

                        TTMainActivity.start(v.getContext());
                        break;
                    case 4:
                       // Intent intent = new Intent(v.getContext(), PaperMainActivity.class);
                       // v.getContext().startActivity(intent);

                        PaperMainActivity.start(v.getContext());
                        break;
                    case 5:
                        //Intent intent = new Intent(v.getContext(), ContactMainActivity.class);
                        //v.getContext().startActivity(intent);

                        ContactMainActivity.start(v.getContext());
                        break;
                    case 6:
                        //Intent intent = new Intent(v.getContext(), AttandanceMainActivity.class);
                        //v.getContext().startActivity(intent);
                        QrScan.start(v.getContext());
                        break;
                    case 7:
                        //Intent intent = new Intent(v.getContext(), ForumsMainActivity.class);
                        //v.getContext().startActivity(intent);

                        ForumsMainActivity.start(v.getContext());
                        break;
                    case 8:
                        //Intent intent = new Intent(v.getContext(), LinksHome.class);
                        //v.getContext().startActivity(intent);

                        LinksHome.start(v.getContext());
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
