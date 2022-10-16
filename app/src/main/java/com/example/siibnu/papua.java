package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class papua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papua);
    }
    public void papuaa(View view) {
        Intent tangguh = new Intent(papua.this, papuaa.class);
        startActivity(tangguh);
    }
    public void papbar(View view) {
        Intent tangguh = new Intent(papua.this, papbar.class);
        startActivity(tangguh);
    }
}