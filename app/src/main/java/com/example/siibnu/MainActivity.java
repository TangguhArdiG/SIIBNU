package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    private ImageButton btn_kuis;

    MediaPlayer audioBackground;
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioBackground = MediaPlayer.create(this, R.raw.my_sound);
        audioBackground.setLooping(false);
        audioBackground.setVolume(1,1);
        audioBackground.start();

        btn_kuis = (ImageButton) findViewById(R.id.btn_kuis);

        btn_kuis.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            ArrayList<Integer> arr = new ArrayList<Integer>();
                                            for (int i = 1; i <= 10; i++) {
                                                arr.add(i);
                                            }
                                            Collections.shuffle(arr);

                                            Intent i = new Intent(MainActivity.this, kuis.class);
                                            i.putExtra("poin", 0);
                                            i.putExtra("now_sequence", 0);
                                            i.putExtra("sequence", arr);
                                            i.putIntegerArrayListExtra("sequence", arr);
                                            startActivity(i);
                                        }
                                    }
        );
    }

    public void sumatra(View view) {
        Intent tangguh = new Intent(MainActivity.this, Sumatera.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void jawa(View view) {
        Intent tangguh = new Intent(MainActivity.this, jawa.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void kalimantan(View view) {
        Intent tangguh = new Intent(MainActivity.this, kalimantan.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void sulawesi(View view) {
        Intent tangguh = new Intent(MainActivity.this, sulawesi.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void bali(View view) {
        Intent tangguh = new Intent(MainActivity.this, bali.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void papua(View view) {
        Intent tangguh = new Intent(MainActivity.this, papua.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void nusa(View view) {
        Intent tangguh = new Intent(MainActivity.this, nusa.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void malukuu(View view) {
        Intent tangguh = new Intent(MainActivity.this, malukuu.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

    public void vidio(View view) {
        Intent tangguh = new Intent(MainActivity.this, vidio.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }
    public void kuis(View view) {
        Intent tangguh = new Intent(MainActivity.this, kuis.class);
        startActivity(tangguh);
        audioBackground.setVolume(0,0);
    }

}