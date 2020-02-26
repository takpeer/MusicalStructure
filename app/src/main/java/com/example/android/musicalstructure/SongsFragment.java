package com.example.android.musicalstructure;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class SongsFragment extends Fragment
{
    RelativeLayout firstSong, secondSong, thirdSong, fourthSong, fifthSong, sixthSong, seventhSong;
    String firstSongUrl, secondSongURl, thirdSongUrl, fourthSongUrl, fifthSongUrl, sixthSongUrl, seventhSongUrl;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        firstSongUrl = "https://www.youtube.com/watch?v=l0U7SxXHkPY";
        secondSongURl = "https://www.youtube.com/watch?v=S2cPMa6fRq8";
        thirdSongUrl = "https://www.youtube.com/watch?v=ia1iuXbEaYQ";
        fourthSongUrl = "https://www.youtube.com/watch?v=egVAW6l_QU8";
        fifthSongUrl = "https://www.youtube.com/watch?v=SlPhMPnQ58k";
        sixthSongUrl = "https://www.youtube.com/watch?v=ojZvMrM4GIY";
        seventhSongUrl = "https://www.youtube.com/watch?v=wXhTHyIgQ_U";
        View view = inflater.inflate(R.layout.song_fragment, container, false);
        firstSong = view.findViewById(R.id.first_song);
        secondSong = view.findViewById(R.id.second_song);
        thirdSong = view.findViewById(R.id.third_song);
        fourthSong = view.findViewById(R.id.fourth_song);
        fifthSong = view.findViewById(R.id.fifth_song);
        sixthSong = view.findViewById(R.id.sixth_song);
        seventhSong = view.findViewById(R.id.seventh_song);
        onClickedSongs(firstSong, firstSongUrl);
        onClickedSongs(secondSong, secondSongURl);
        onClickedSongs(thirdSong, thirdSongUrl);
        onClickedSongs(fourthSong, fourthSongUrl);
        onClickedSongs(fifthSong, fifthSongUrl);
        onClickedSongs(sixthSong, sixthSongUrl);
        onClickedSongs(seventhSong, seventhSongUrl);

        return view;
    }

    private void onClickedSongs(final RelativeLayout song, final String songUrl){
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Uri uri = Uri.parse(songUrl);
            Intent songIntent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(songIntent);
            }
        });
    }
}
