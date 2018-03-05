package com.kriti.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView library = findViewById(R.id.pay1);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libIntent = new Intent(PaymentActivity.this, LibraryActivity.class);
                startActivity(libIntent);
            }
        });
        TextView play = findViewById(R.id.pay2);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playIntent = new Intent(PaymentActivity.this, PlayingActivity.class);
                startActivity(playIntent);
            }
        });
        TextView payment = findViewById(R.id.pay3);
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(PaymentActivity.this, PlaylistActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
