package com.example.android.musike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.music_list );
        // Create a list of songs
        ArrayList<SongList> songs = new ArrayList<SongList> ();
        songs.add ( new SongList ( "Psycho", "Post Malone Featuring Ty Dolla $ign ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "The Middle", " Zedd, Maren Morris & Grey ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Mine", "Bazzi", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Never Be The Same", " Camila Cabello ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Wait", " Maroon 5 ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "No Tears Left To Cry", " Ariana Grande ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Friends", " Marshmello & Anne-Marie ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Whatever It Takes", " Imagine Dragons ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "In My Blood", " Shawn Mendes ", R.drawable.songsmall ) );
        songs.add ( new SongList ( "Delicate", " Taylor Swift ", R.drawable.songsmall ) );

        // Create a songs adapter, whose data source is a list of songs. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter;
        adapter = new MusicAdapter ( this, songs );

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById ( R.id.music_list );

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter ( adapter );
    }
}