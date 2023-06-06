package com.abrarsardar.FriendCafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Book_Table extends AppCompatActivity {
    Button submitbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_table);
        getSupportActionBar().setTitle("Book Table");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        submitbt=findViewById(R.id.btSubmitBT);
        submitbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Book_Table.this, "Submit...", Toast.LENGTH_SHORT).show(); }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}