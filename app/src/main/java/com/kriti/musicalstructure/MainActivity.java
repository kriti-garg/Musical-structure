package com.kriti.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView library = findViewById(R.id.library);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libIntent = new Intent(
                        MainActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        TextView play = findViewById(R.id.playing);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(
                        MainActivity.this, PlayingActivity.class);
                startActivity(playIntent);
            }
        });
        TextView playlist = findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(
                        MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
        TextView payment = findViewById(R.id.payment);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(
                        MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

    }
}
