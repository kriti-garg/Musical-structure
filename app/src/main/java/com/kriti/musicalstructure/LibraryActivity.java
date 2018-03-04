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

        TextView buy = findViewById(R.id.lib1);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(LibraryActivity.this, PlayingActivity.class);
                startActivity(buyIntent);
            }
        });
        TextView buy1 = findViewById(R.id.lib2);
        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent buyIntent1 = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(buyIntent1);
            }
        });
        TextView buy2 = findViewById(R.id.lib3);
        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent2 = new Intent(LibraryActivity.this, PaymentActivity.class);
                startActivity(buyIntent2);
            }
        });
    }
}
