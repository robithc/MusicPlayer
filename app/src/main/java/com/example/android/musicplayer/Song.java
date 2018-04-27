package com.example.android.musicplayer;


// {@link Song} represents song from album
// each object has 2 properties: artist name, song name
public class Song  {

    //Create string for artist name
    private String mArtistName;
    //Create string for song name
    private String mSongName;

    //Create new object
    // @param vArtistName is the name of artist
    //@param vSongName is the name of the song
    public Song(String vArtistName, String vSongName){
    mArtistName = vArtistName;
    mSongName = vSongName;
    }

    //Get the artist name
    public String getArtistName(){
        return mArtistName;
    }

    //Get the song name
    public String getSongName(){
        return mSongName;
    }
}
