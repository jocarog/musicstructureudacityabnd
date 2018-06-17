package com.example.android.musike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// All pictures used here have been obtained from unsplash.com
// Music list based off of https://www.billboard.com/charts/pop-songs
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView ( R.layout.activity_main );

        //Find the View that shows the Spanish Songs category
        TextView spanishSongs = (TextView) findViewById ( R.id.category_spanish_songs );

        //Set a click listener on the SpanishSongs View
        spanishSongs.setOnClickListener ( new View.OnClickListener () {
                                              // The code in this method will be executed when the songs category is clicked on.
                                              @Override
                                              public void onClick(View view) {
                                                  // Create a new intent to open the SpanishSongs Category
                                                  Intent spanish_songs = new Intent ( MainActivity.this, SpanishSongs.class );
                                                  // Start the new activity
                                                  startActivity ( spanish_songs );
                                              }
                                          }
        );

        // Find the View that shows the english songs category
        TextView englishSongs = (TextView) findViewById ( R.id.category_english_songs );

        //set a click listener on the english songs category  view
        englishSongs.setOnClickListener ( new View.OnClickListener () {
                                              // The code in this method will be executed when the top english category is clicked on.
                                              @Override
                                              public void onClick(View view) {
                                                  //Create a new intent to open the English Songs category
                                                  Intent english_songs = new Intent ( MainActivity.this, EnglishSongs.class );

                                                  //Start the new activity
                                                  startActivity ( english_songs );
                                              }
                                          }
        );

    }
}