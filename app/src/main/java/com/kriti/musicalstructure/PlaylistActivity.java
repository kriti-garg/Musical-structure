package com.kriti.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView buy = findViewById(R.id.playlist1);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(PlaylistActivity.this, LibraryActivity.class);
                startActivity(buyIntent);
            }
        });
        TextView buy1 = findViewById(R.id.playlist2);
        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent1 = new Intent(PlaylistActivity.this, PlayingActivity.class);
                startActivity(buyIntent1);
            }
        });
        TextView buy2 = findViewById(R.id.playlist3);
        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent2 = new Intent(PlaylistActivity.this, PaymentActivity.class);
                startActivity(buyIntent2);
            }
        });
    }
}
