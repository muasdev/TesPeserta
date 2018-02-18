package com.example.muas.tespeserta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewMadrid, textViewPsg;
    Button buttonMadrid;
    Button buttonpsg;
    Button reset;
    int skorMadrid = 0;
    int skorpsg = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewMadrid = (TextView) findViewById(R.id.textView_skorMadrid);
        buttonMadrid = (Button) findViewById(R.id.button_madrid);

        textViewPsg = (TextView) findViewById(R.id.textView_skorpsg);
        buttonpsg = (Button) findViewById(R.id.button_psg);
        reset = (Button) findViewById(R.id.textView_reset);

        buttonMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorMadrid = skorMadrid + 1;
                textViewMadrid.setText(String.valueOf(skorMadrid));
            }
        });

        buttonpsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorpsg = skorpsg + 1;
                textViewPsg.setText(String.valueOf(skorpsg));
            }

        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewMadrid.setText("0");
                textViewPsg.setText("0");

            }
        });
    }

}