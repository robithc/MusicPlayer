package com.example.android.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Song} represents a song name and artist the user wants to listen.
 */

public class Song implements Parcelable {

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
    /**
     * song name
     */
    private String mSongName;
    /**
     * artist name
     */
    private String mArtistName;
    /**
     * Drawable resource ID (Song Art)
     */
    private int mImageSongArt;

    /**
     * Create a new Song object.
     *
     * @param songName   is the song name
     * @param artistName is the artist name
     */
    public Song(String songName, String artistName, int imageSongArt) {
        mSongName = songName;
        mArtistName = artistName;
        mImageSongArt = imageSongArt;
    }

    protected Song(Parcel in) {
        mSongName = in.readString();
        mArtistName = in.readString();
        mImageSongArt = in.readInt();
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the artist name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the Image resource ID
     */
    public int getImageSongArt() {
        return mImageSongArt;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSongName);
        dest.writeString(mArtistName);
        dest.writeInt(mImageSongArt);
    }
}