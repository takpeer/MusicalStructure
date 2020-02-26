package com.example.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistRecycleView extends RecyclerView.Adapter<ArtistRecycleView.ArtistViewHolder> {

    LayoutInflater mInflater;
    ArrayList<ArtistData> artists;
    ArtistRecycleView(Context context, ArrayList<ArtistData> artistData){
        mInflater = LayoutInflater.from(context);
        artists = artistData;
    }

    @NonNull
    @Override
    public ArtistViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = mInflater.inflate(R.layout.artist_item_list, viewGroup, false);
        return new ArtistViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArtistViewHolder artistViewHolder, int i) {

        String currentArtistName = artists.get(i).getArtistName();
        int currentArtistPic = artists.get(i).getImageResourceId();
        artistViewHolder.artist_name.setText(currentArtistName);
        artistViewHolder.artist_pic.setImageResource(currentArtistPic);

    }

    @Override
    public int getItemCount() {
        return artists.size();
    }

    class ArtistViewHolder extends RecyclerView.ViewHolder {
        TextView artist_name;
        ImageView artist_pic;
        public ArtistViewHolder(@NonNull View itemView) {
            super(itemView);
            artist_name = itemView.findViewById(R.id.artist_name);
            artist_pic = itemView.findViewById(R.id.artist_pic);
        }
    }
}
