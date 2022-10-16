package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sumatera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatera);
    }

    public void aceh(View view) {
        Intent tangguh = new Intent(Sumatera.this, aceh.class);
        startActivity(tangguh);
    }
    public void sumut(View view) {
        Intent tangguh = new Intent(Sumatera.this, sumut.class);
        startActivity(tangguh);
    }
    public void sumbar(View view) {
        Intent tangguh = new Intent(Sumatera.this, sumbar.class);
        startActivity(tangguh);
    }
    public void riau(View view) {
        Intent tangguh = new Intent(Sumatera.this, riau.class);
        startActivity(tangguh);
    }
    public void jambi(View view) {
        Intent tangguh = new Intent(Sumatera.this, jambi.class);
        startActivity(tangguh);
    }
    public void bengkulu(View view) {
        Intent tangguh = new Intent(Sumatera.this, bengkulu.class);
        startActivity(tangguh);
    }
    public void lampung(View view) {
        Intent tangguh = new Intent(Sumatera.this, lampung.class);
        startActivity(tangguh);
    }
    public void kepri(View view) {
        Intent tangguh = new Intent(Sumatera.this, kepri.class);
        startActivity(tangguh);
    }
    public void sumsel(View view) {
        Intent tangguh = new Intent(Sumatera.this, sumsel.class);
        startActivity(tangguh);
    }
    public void babel(View view) {
        Intent tangguh = new Intent(Sumatera.this, babel.class);
        startActivity(tangguh);
    }
}