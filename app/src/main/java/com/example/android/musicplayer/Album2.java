package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class Album2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_layout);

        //Create ArrayList of songs objects
        ArrayList <Song> albumOneList = new ArrayList<>();
        //Add objects to ArrayList
        albumOneList.add(new Song("Artist 2","Track 1"));
        albumOneList.add(new Song("Artist 2","Track 2"));
        albumOneList.add(new Song("Artist 2","Track 3"));
        albumOneList.add(new Song("Artist 2","Track 4"));
        albumOneList.add(new Song("Artist 2","Track 5"));
        albumOneList.add(new Song("Artist 2","Track 6"));
        albumOneList.add(new Song("Artist 2","Track 7"));
        albumOneList.add(new Song("Artist 2","Track 8"));
        albumOneList.add(new Song("Artist 2","Track 9"));
        albumOneList.add(new Song("Artist 2","Track 10"));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, albumOneList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView2 = (ListView) findViewById(R.id.songs_listView);
        listView2.setAdapter(songAdapter);

    }
}
