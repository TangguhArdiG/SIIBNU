package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class lampung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampung);

        TextView textView = (TextView) findViewById(R.id.link);
        Linkify.addLinks(textView, Linkify.WEB_URLS);
    }
}