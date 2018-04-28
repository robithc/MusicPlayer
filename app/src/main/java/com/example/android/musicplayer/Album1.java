package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Album1 extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        //Create ArrayList of songs objects
        final ArrayList<Song> albumOneList = new ArrayList<>();
        //Add objects to ArrayList
        albumOneList.add(new Song("Artist 1", "Track 1", 0));
        albumOneList.add(new Song("Artist 1", "Track 2", 0));
        albumOneList.add(new Song("Artist 1", "Track 3", 0));
        albumOneList.add(new Song("Artist 1", "Track 4", 0));
        albumOneList.add(new Song("Artist 1", "Track 5", 0));
        albumOneList.add(new Song("Artist 1", "Track 6", 0));
        albumOneList.add(new Song("Artist 1", "Track 7", 0));
        albumOneList.add(new Song("Artist 1", "Track 8", 0));
        albumOneList.add(new Song("Artist 1", "Track 9", 0));
        albumOneList.add(new Song("Artist 1", "Track 10", 0));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        final SongAdapter songAdapter = new SongAdapter(this, albumOneList);


// Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list_view);
        listView.setAdapter(songAdapter);

// set OnClickListener on listview to open NowPlaying activity.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Album1.this, NowPlaying.class);
                intent.putExtra(Constants.EXAMPLE_ITEM, albumOneList.get(position));

                startActivity(intent);

            }
        });




}
}
