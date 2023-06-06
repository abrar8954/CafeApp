package com.abrarsardar.FriendCafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Home_Delivery extends AppCompatActivity {
  Button submithd;
  TextView deliveryplusfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_delivery);
        getSupportActionBar().setTitle("Home Delivery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        submithd=findViewById(R.id.btSubmitHD);
        deliveryplusfood=findViewById(R.id.tvDPlusF);

        submithd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home_Delivery.this, "Submit...", Toast.LENGTH_SHORT).show();
                deliveryplusfood.setText("Delivery Charges + Food Charges = 400Rs");
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}