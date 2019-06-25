package com.example.drugpresc;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmScreen2 extends AppCompatActivity {
    private TextView aela1;
    private  TextView aela2;
    private TextView aela3;
    private Button abutton;
    private static final String DEFAULT1="N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_screen2);
        aela1 = (TextView) findViewById(R.id.aeal1);
        aela2 = (TextView) findViewById(R.id.aeal2);
        aela3 = (TextView) findViewById(R.id.aeal3);
        abutton = (Button) findViewById(R.id.beaa);
        abutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences2=getSharedPreferences("mydata2", Context.MODE_PRIVATE);
                String typeb=sharedPreferences2.getString("typeb",DEFAULT1);
                String titlea=sharedPreferences2.getString("titlea",DEFAULT1);
                String quantitya=sharedPreferences2.getString("quantitya",DEFAULT1);
                if (typeb.equals(DEFAULT1)||titlea.equals(DEFAULT1)||quantitya.equals(DEFAULT1)){
                    Toast.makeText(AlarmScreen2.this,"no data found",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AlarmScreen2.this," data found succesfully",Toast.LENGTH_LONG).show();
                    aela1.setText(typeb);
                    aela2.setText(titlea);
                    aela3.setText(quantitya);

                }


            }
        });

    }
}
