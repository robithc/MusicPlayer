package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Album2 extends AppCompatActivity{

    ArrayList<Song> albumTwoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);



        //Create ArrayList of songs objects
        final ArrayList<Song> albumTwoList = new ArrayList<>();
        //Add objects to ArrayList
        albumTwoList.add(new Song("Artist 2", "Track 1", 0));
        albumTwoList.add(new Song("Artist 2", "Track 2", 0));
        albumTwoList.add(new Song("Artist 2", "Track 3", 0));
        albumTwoList.add(new Song("Artist 2", "Track 4", 0));
        albumTwoList.add(new Song("Artist 2", "Track 5", 0));
        albumTwoList.add(new Song("Artist 2", "Track 6", 0));
        albumTwoList.add(new Song("Artist 2", "Track 7", 0));
        albumTwoList.add(new Song("Artist 2", "Track 8", 0));
        albumTwoList.add(new Song("Artist 2", "Track 9", 0));
        albumTwoList.add(new Song("Artist 2", "Track 10", 0));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, albumTwoList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView2 = (ListView) findViewById(R.id.song_list_view);
        listView2.setAdapter(songAdapter);

    }
}
