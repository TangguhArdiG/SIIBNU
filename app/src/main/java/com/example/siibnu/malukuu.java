package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class malukuu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malukuu);
    }
    public void maluku(View view) {
        Intent tangguh = new Intent(malukuu.this, maluku.class);
        startActivity(tangguh);
    }

    public void malukut(View view) {
        Intent tangguh = new Intent(malukuu.this, malukut.class);
        startActivity(tangguh);
    }
}