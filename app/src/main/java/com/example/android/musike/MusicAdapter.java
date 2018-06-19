package com.example.android.musike;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<SongList> {

    public MusicAdapter(Context context, ArrayList<SongList> list) {
    super ( context, 0, list );

    }

    public View getView(int position, View convertView, ViewGroup parent) {
    View listItemView = convertView;
    if (listItemView == null)
    listItemView = LayoutInflater.from ( getContext () ).inflate
    ( R.layout.list_order, parent, false );

    SongList currentSong = getItem ( position );

    ImageView iconView = (ImageView) listItemView.findViewById ( R.id.imageView_icon );
    iconView.setImageResource ( currentSong.getImageResourceId () );

    TextView name = (TextView) listItemView.findViewById ( R.id.song_title );
    name.setText ( currentSong.getSongName () );

    TextView artist = (TextView) listItemView.findViewById ( R.id.artist_name );
    artist.setText ( currentSong.getArtistName () );

    return listItemView;
    }
}