package com.kriti.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        TextView nowPlayingButton = findViewById(R.id.lib1);
        nowPlayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playingIntent = new Intent(LibraryActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
        TextView playlistButton = findViewById(R.id.lib2);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        final TextView paymentButton = findViewById(R.id.lib3);
        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(LibraryActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
