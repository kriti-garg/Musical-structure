package com.kriti.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        TextView library = findViewById(R.id.play1);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libIntent = new Intent(PlayingActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        TextView playlist = findViewById(R.id.play2);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PlayingActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        TextView payment = findViewById(R.id.play3);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PlayingActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
