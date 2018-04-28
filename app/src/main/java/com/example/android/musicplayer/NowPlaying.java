package com.example.android.musicplayer;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);


        Intent intent = getIntent();
        Song exampleItem = intent.getParcelableExtra(Constants.EXAMPLE_ITEM);

        int songArt = exampleItem.getImageSongArt();
        String songName = exampleItem.getSongName();
        String artistName = exampleItem.getArtistName();

        ImageView imageView = findViewById(R.id.art_image);
        imageView.setImageResource(songArt);

        TextView textView1Song = findViewById(R.id.song_name_playing);
        textView1Song.setText(songName);

        TextView textView2Artist = findViewById(R.id.artist_name_playing);
        textView2Artist.setText(artistName);

    }


}