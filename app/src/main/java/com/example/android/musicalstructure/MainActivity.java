package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nav = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.bottom_nav_container,
                new HomeFragment()).commit();
        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFrag = null;
                switch (menuItem.getItemId()){
                    case R.id.playlist:
                        selectedFrag = new PlaylistFragment();
                        break;
                    case R.id.songs:
                        selectedFrag = new SongsFragment();
                        break;
                    case R.id.home:
                        selectedFrag = new HomeFragment();
                        break;
                    case R.id.album:
                        selectedFrag = new AlbumFragment();
                        break;
                    case R.id.artist:
                        selectedFrag = new ArtistFragment();
                        break;

                }
                if (selectedFrag !=null)
                getSupportFragmentManager().beginTransaction().replace(R.id.bottom_nav_container, selectedFrag)
                        .commit();
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.genre){
            startActivity(new Intent(this, GenreActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
