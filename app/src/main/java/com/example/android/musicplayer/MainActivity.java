package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create a textView for album 1
        TextView album_1_text = findViewById(R.id.album_1_text_View);
        //Set it to string
        album_1_text.setText(R.string.album1);
        //Set onClickListener
        //When clicked it will open Album1 Activity
        album_1_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumOneIntent = new Intent(MainActivity.this, Album1.class);

                startActivity(albumOneIntent);

            }
        });

        //Create textView for album 2
        TextView album_2_text = findViewById(R.id.album_2_text_View);
        //Set it to string
        album_2_text.setText(R.string.album2);
        //Set onClickListener
        //When clicked it will open Album2 Activity
        album_2_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumTwoIntent = new Intent(MainActivity.this, Album2.class);

                startActivity(albumTwoIntent);

            }
        });
    }
}




