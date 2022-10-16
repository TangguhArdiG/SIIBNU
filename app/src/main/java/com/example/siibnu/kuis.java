package com.example.siibnu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class kuis extends AppCompatActivity {

    String[] list_answer = {
            "c. kujang",
            "b. riau",
            "a. sumatera barat",
            "c. palangkaraya",
            "a. sulawesi timur",
            "a. kalimantan barat",
            "c. jawa tengah",
            "b. lampung",
            "d. banten",
            "d. honai",
            "a. rencong",
            "c. aceh",
            "b. soleram",
            "c. medan",
            "d. sumatera utara",
            "a. piso gaja dompak",
            "d. sumatera barat",
            "b. kerambit",
            "b. bubungan lima",
            "d. riau",
            "c. tanjung pinang",
            "a. kepulauan riau",
            "c. kepulauan riau",
            "b. banten",
            "d. sumatera selatan",
            "c. bangka belitung",
            "a. bangka belitung",
            "a. tari bulouh",
            "d. serang",
            "c. jaya raya",
            "b. rumah kebaya",
            "a. jakarta",
            "d. bubuy bulan",
            "b. jawa barat",
            "c. jawa barat",
            "d. semarang",
            "c. yogyakarta",
            "a. jawa timur",
            "d. kalimantan barat",
            "b. papua barat",
            "c. karya swadaya",
            "d. gorontalo",
            "a. makassar",
            "c. pedang bara sangihe",
            "d. sulawesi tenggara",
            "a. sundu",
            "c. bali",
            "a. kalimantan selatan",
            "b. samarinda",
            "c. papua"
    };

    Button play;
    VideoView videoView;
    Button btn_selanjutnya;
    RadioGroup radio_jawaban;
    int poin;
    int now_sequence;
    ArrayList<Integer> sequence;
    private View btn_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        poin = getIntent().getIntExtra("poin", 0);
        now_sequence = getIntent().getIntExtra("now_sequence", 0);
        sequence = getIntent().getIntegerArrayListExtra("sequence");

//        Log.d("SEQUENCE_INTENT", Arrays.toString(sequence));

        switch (sequence.get(now_sequence)) {
            case 1:
                setContentView(R.layout.soal_1);
                break;

            case 2:
                setContentView(R.layout.soal_2);
                break;

            case 3:
                setContentView(R.layout.soal_3);
                break;

            case 4:
                setContentView(R.layout.soal_4);
                break;

            case 5:
                setContentView(R.layout.soal_5);
                break;

            case 6:
                setContentView(R.layout.soal_6);
                break;

            case 7:
                setContentView(R.layout.soal_7);
                break;

            case 8:
                setContentView(R.layout.soal_8);
                break;

            case 9:
                setContentView(R.layout.soal_9);
                break;

            case 10:
                setContentView(R.layout.soal_10);
                break;

            case 11:
                setContentView(R.layout.soal_11);
                break;

            case 12:
                setContentView(R.layout.soal_12);
                break;

            case 13:
                setContentView(R.layout.soal_13);
                break;

            case 14:
                setContentView(R.layout.soal_14);
                break;

            case 15:
                setContentView(R.layout.soal_15);
                break;

            case 16:
                setContentView(R.layout.soal_16);
                break;

            case 17:
                setContentView(R.layout.soal_17);
                break;

            case 18:
                setContentView(R.layout.soal_18);
                break;

            case 19:
                setContentView(R.layout.soal_19);
                break;

            case 20:
                setContentView(R.layout.soal_20);
                break;

            case 21:
                setContentView(R.layout.soal_21);
                break;

            case 22:
                setContentView(R.layout.soal_22);
                break;

            case 23:
                setContentView(R.layout.soal_23);
                break;

            case 24:
                setContentView(R.layout.soal_24);
                break;

            case 25:
                setContentView(R.layout.soal_25);
                break;

            case 26:
                setContentView(R.layout.soal_26);
                break;

            case 27:
                setContentView(R.layout.soal_27);
                break;

            case 28:
                setContentView(R.layout.soal_28);
                break;

            case 29:
                setContentView(R.layout.soal_29);
                break;

            case 30:
                setContentView(R.layout.soal_30);
                break;

            case 31:
                setContentView(R.layout.soal_31);
                break;

            case 32:
                setContentView(R.layout.soal_32);
                break;

            case 33:
                setContentView(R.layout.soal_33);
                break;

            case 34:
                setContentView(R.layout.soal_34);
                break;

            case 35:
                setContentView(R.layout.soal_35);
                break;

            case 36:
                setContentView(R.layout.soal_36);
                break;

            case 37:
                setContentView(R.layout.soal_37);
                break;

            case 38:
                setContentView(R.layout.soal_38);
                break;

            case 39:
                setContentView(R.layout.soal_39);
                break;

            case 40:
                setContentView(R.layout.soal_40);
                break;

            case 41:
                setContentView(R.layout.soal_41);
                break;

            case 42:
                setContentView(R.layout.soal_42);
                break;

            case 43:
                setContentView(R.layout.soal_43);
                break;

            case 44:
                setContentView(R.layout.soal_44);
                break;

            case 45:
                setContentView(R.layout.soal_45);
                break;

            case 46:
                setContentView(R.layout.soal_46);
                break;

            case 47:
                setContentView(R.layout.soal_47);
                break;

            case 48:
                setContentView(R.layout.soal_48);
                break;

            case 49:
                setContentView(R.layout.soal_49);
                break;

            case 50:
                setContentView(R.layout.soal_50);
                break;
        }

        btn_play = findViewById(R.id.videoView);
        btn_selanjutnya = findViewById(R.id.btn_selanjutnya);
        radio_jawaban = findViewById(R.id.radio_jawaban);

        if (now_sequence == 9) {
            btn_selanjutnya.setText("Selesai");
        }

        btn_selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){

                int id_radio = radio_jawaban.getCheckedRadioButtonId();
                String answer = ((RadioButton) findViewById(id_radio)).getText().toString();
                Log.d("RADIO ANSWER", answer);
                Log.d("LIST ANSWER", list_answer[sequence.get(now_sequence)-1]);
                if (answer.toLowerCase().equals(list_answer[sequence.get(now_sequence)-1])) {
                    poin += 10;
                }
                Log.d("POIN", String.valueOf(poin));

                if (now_sequence < 9) {
                    now_sequence++;
                    Intent i = new Intent(kuis.this, kuis.class);
                    i.putExtra("now_sequence", now_sequence);
                    i.putExtra("sequence", sequence);
                    i.putExtra("poin", poin);
                    startActivity(i);
                    finish();
                } else {
                    Intent i = new Intent(kuis.this, hasil.class);
                    i.putExtra("nilai", poin);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
