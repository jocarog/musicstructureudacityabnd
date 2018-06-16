package com.example.android.musike;

import android.support.v7.app.AppCompatActivity;

public class SongList  {

    // Song name
    private String mSong;

    // Songs Name
    private String mArtist;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new song object.
     *
     *
     * */
    public SongList(String mSongName, String mArtistName, int imageResourceId) {
        mSong = mSongName;
        mArtist = mArtistName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the song name
     */
    public String getSongName() {
        return mSong;
    }

    /**
     * Get the Songs number
     */
    public String getArtistName() {
        return mArtist;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}