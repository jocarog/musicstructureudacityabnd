package com.example.android.musike;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SpanishSongs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.music_list );

        // Create a list of songs
        ArrayList<SongList> songs = new ArrayList<SongList> ();
        songs.add ( new SongList ( "Te bote", "Casper, Magico, Nio Garcia, Darrell, Nicky Jam, Ozuna & Bad Bunny", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Despacito", "Luis Fonsi & Daddy Yankee Featuring Justin Bieber ", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Dame Tu Cosita", "El Chombo", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Dura", "Daddy Yankee", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "X", "Nicky Jam x J Balvin", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Mi Gente", "J Balvin & Willy William Featuring Beyonce", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "El Farsante", " Ozuna & Romeo Santos ", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Sin Pijama", " Becky G + Natti Natasha ", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Oye Mujer", "Ray Mix", R.drawable.musicsmall ) );
        songs.add ( new SongList ( "Scooby Doo Pa Pa", "DJ Kass", R.drawable.musicsmall ) );

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