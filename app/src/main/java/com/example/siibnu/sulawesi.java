package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sulawesi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi);
    }
    public void sulsel(View view) {
        Intent tangguh = new Intent(sulawesi.this, sulsel.class);
        startActivity(tangguh);
    }

    public void sulteng(View view) {
        Intent tangguh = new Intent(sulawesi.this, sulteng.class);
        startActivity(tangguh);
    }

    public void sulut(View view) {
        Intent tangguh = new Intent(sulawesi.this, sulut.class);
        startActivity(tangguh);
    }

    public void sultengg(View view) {
        Intent tangguh = new Intent(sulawesi.this, sultengg.class);
        startActivity(tangguh);
    }

    public void sulbar(View view) {
        Intent tangguh = new Intent(sulawesi.this, sulbar.class);
        startActivity(tangguh);
    }

    public void gorontalo(View view) {
        Intent tangguh = new Intent(sulawesi.this, gorontalo.class);
        startActivity(tangguh);
    }

}