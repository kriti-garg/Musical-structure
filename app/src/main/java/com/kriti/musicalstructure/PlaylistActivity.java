package com.kriti.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView library = findViewById(R.id.playlist1);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libIntent = new Intent(PlaylistActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        TextView play = findViewById(R.id.playlist2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(PlaylistActivity.this, PlayingActivity.class);
                startActivity(playIntent);
            }
        });
        TextView payment = findViewById(R.id.playlist3);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PlaylistActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
