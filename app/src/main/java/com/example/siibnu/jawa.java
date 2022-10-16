package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class jawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);
    }
    public void banten(View view) {
        Intent tangguh = new Intent(jawa.this, banten.class);
        startActivity(tangguh);
    }
    public void jabar(View view) {
        Intent tangguh = new Intent(jawa.this, jabar.class);
        startActivity(tangguh);
    }
    public void jateng(View view) {
        Intent tangguh = new Intent(jawa.this, jateng.class);
        startActivity(tangguh);
    }
    public void jatim(View view) {
        Intent tangguh = new Intent(jawa.this, jatim.class);
        startActivity(tangguh);
    }
    public void diy(View view) {
        Intent tangguh = new Intent(jawa.this, diy.class);
        startActivity(tangguh);
    }
    public void dki(View view) {
        Intent tangguh = new Intent(jawa.this, dki.class);
        startActivity(tangguh);
    }
}