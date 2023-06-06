package com.abrarsardar.FriendCafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pancakes extends AppCompatActivity {
TextView home, table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancakes);
        getSupportActionBar().setTitle("Pancakes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        home=findViewById(R.id.tvHome);
        table=findViewById(R.id.tvTable);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pancakes.this, Home_Delivery.class );
                startActivity(intent);
            }
        });

        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pancakes.this, Book_Table.class );
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}