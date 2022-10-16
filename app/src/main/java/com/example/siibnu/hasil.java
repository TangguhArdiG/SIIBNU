package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class hasil extends AppCompatActivity {

    TextView txt_nilai, txt_keterangan, txt_comment;
    Button btn_cobalagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        txt_nilai = findViewById(R.id.txt_nilai);
        txt_keterangan = findViewById(R.id.txt_keterangan);
        txt_comment = findViewById(R.id.txt_commemt);
        btn_cobalagi = findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if(nilai >= 100) {
            txt_comment.setText("'Sempurna'");
            txt_keterangan.setText("Grade A+");
        }else if(nilai >= 90) {
            txt_comment.setText("'Sangat Baik'");
            txt_keterangan.setText("Grade A");
        }else if(nilai >= 80) {
            txt_comment.setText("'Baik'");
            txt_keterangan.setText("Grade B");
        }else if(nilai >= 70) {
            txt_comment.setText("'Cukup Baik'");
            txt_keterangan.setText("Grade C");
        }else if(nilai >= 60) {
            txt_comment.setText("'Kurang Baik'");
            txt_keterangan.setText("Grade D");
        }else {
            txt_comment.setText("'Sangat Kurang'");
            txt_keterangan.setText("Grade E");
        }

        btn_cobalagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for (int i = 1; i <=50; i++) {
                    arr.add(i);
                }
                Collections.shuffle(arr);

                Intent i = new Intent(hasil.this, kuis.class);
                i.putExtra("poin", 0);
                i.putExtra("now_sequence", 0);
                i.putExtra("sequence", arr);
                i.putIntegerArrayListExtra("sequence", arr);
                startActivity(i);
                finish();
            }
        });
    }
}