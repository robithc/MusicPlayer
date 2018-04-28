package com.example.android.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
//based on a data source, which is a list of {@link Song} objects.
//

public class SongAdapter extends ArrayAdapter<Song> {
    protected View mView;

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    //@param context is the current context. Used to inflate the layout file.
    //@param androidFlavors is a  List of Song objects to display in a list

    public SongAdapter(Activity context, ArrayList<Song> Song) {

        super(context, 0, Song);
    }

    // @param position The position in the list of data that should be displayed in the
    // list item view.
    // @param convertView The recycled view to populate.
    // @param parent The parent ViewGroup that is used for inflation.
    // @return The View for the position in the AdapterView.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the song name from the current song name object and
        // set this text on the name TextView

        songNameTextView.setText(currentSong.getSongName());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistNameTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the artist name from the current artist name object and
        // set this text on the number TextView
        artistNameTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID song_image
        ImageView songArt = listItemView.findViewById(R.id.song_art);
        //Get the image resource ID from the current Song Art object and
        // set the image to songArt
        songArt.setImageResource(currentSong.getImageSongArt());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}