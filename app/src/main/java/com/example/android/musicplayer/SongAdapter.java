package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

// {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
//based on a data source, which is a list of {@link Song} objects.
//

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    //@param context is the current context. Used to inflate the layout file.
    //@param androidFlavors is a  List of Song objects to display in a list

    public SongAdapter(Activity context, ArrayList<Song> albumOneList) {
        super(context, 0, albumOneList);
    }

    // @param position The position in the list of data that should be displayed in the
    // list item view.
    // @param convertView The recycled view to populate.
    // @param parent The parent ViewGroup that is used for inflation.
    // @return The View for the position in the AdapterView.
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_layout, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the album_layout.xml layout with the ID artist_name_text_view
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        // Get the version name from the current Song object and
        // set this text on the artistName TextView

        artistNameTextView.setText(currentSong.getArtistName());

        // Find the TextView in the album_layout.xml layout with the ID song_name_text_view
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        // Get the song name from the current Song object and
        // set this text on the songName TextView
        songNameTextView.setText(currentSong.getSongName());

        // Return the whole list item layout (containing 2 TextViews )
        // so that it can be shown in the ListView
        return listItemView;
    }
}