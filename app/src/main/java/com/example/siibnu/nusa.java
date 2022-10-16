package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nusa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nusa);
    }
    public void ntt(View view) {
        Intent tangguh = new Intent(nusa.this, ntt.class);
        startActivity(tangguh);
    }
    public void ntb(View view) {
        Intent tangguh = new Intent(nusa.this, ntb.class);
        startActivity(tangguh);
    }
}