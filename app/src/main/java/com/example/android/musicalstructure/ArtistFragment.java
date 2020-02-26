package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ArtistFragment extends Fragment {
    private RecyclerView mRecyclerView;
    ArrayList<ArtistData> artists;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        addArtists();

        View view =  inflater.inflate(R.layout.artist_recycle_view, container, false);
        mRecyclerView = view.findViewById(R.id.artist_recycle_view);
        ArtistRecycleView artistRecycleViewAdapter = new ArtistRecycleView(this.getActivity(), artists);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        mRecyclerView.setAdapter(artistRecycleViewAdapter);
        return view;
    }

     private void addArtists() {
          artists = new ArrayList<>();
         artists.add(new ArtistData(getString(R.string.artist1), R.drawable.post_malone_1vw));
         artists.add(new ArtistData(getString(R.string.artist2), R.drawable.ariana_grande_nxo));
         artists.add(new ArtistData(getString(R.string.artist3), R.drawable.billie_eilish_acb));
         artists.add(new ArtistData(getString(R.string.artist4), R.drawable.taylor_swift));
         artists.add(new ArtistData(getString(R.string.artist5), R.drawable.ed_sheeran_3vg));
         artists.add(new ArtistData(getString(R.string.artist6), R.drawable.jonas_brothers_r3d));
         artists.add(new ArtistData(getString(R.string.artist7), R.drawable.travis_scott_jll));
         artists.add(new ArtistData(getString(R.string.artist8), R.drawable.dababy_sfn));
         artists.add(new ArtistData(getString(R.string.artist9), R.drawable.cardi_b_n38));
         artists.add(new ArtistData(getString(R.string.artist10), R.drawable.shawn_mendes));
         artists.add(new ArtistData(getString(R.string.artist11), R.drawable.lizzo_w3u));
         artists.add(new ArtistData(getString(R.string.artist12), R.drawable.meek_mill));
         artists.add(new ArtistData(getString(R.string.artist13), R.drawable.queen_m21));
         artists.add(new ArtistData(getString(R.string.artist14), R.drawable.maroon_5_9st));
         artists.add(new ArtistData(getString(R.string.artist15), R.drawable.imagine_dragons_hy6));

     }
}
