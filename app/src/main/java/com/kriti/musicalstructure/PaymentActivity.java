package com.kriti.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView buy = findViewById(R.id.pay1);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(PaymentActivity.this, LibraryActivity.class);
                startActivity(buyIntent);
            }
        });
        TextView buy1 = findViewById(R.id.pay2);
        buy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent1 = new Intent(PaymentActivity.this, PlayingActivity.class);
                startActivity(buyIntent1);
            }
        });
        TextView buy2 = findViewById(R.id.pay3);
        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buyIntent2 = new Intent(PaymentActivity.this, PlaylistActivity.class);
                startActivity(buyIntent2);
            }
        });
    }
}
