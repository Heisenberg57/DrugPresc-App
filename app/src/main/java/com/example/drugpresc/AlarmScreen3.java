package com.example.drugpresc;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmScreen3 extends AppCompatActivity {
    private TextView dela1;
    private  TextView dela2;
    private TextView dela3;
    private Button dbutton;
    private static final String DEFAULT2="N/A";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_screen3);
        dela1 = (TextView) findViewById(R.id.deal1);
        dela2 = (TextView) findViewById(R.id.deal2);
        dela3 = (TextView) findViewById(R.id.deal3);
        dbutton = (Button) findViewById(R.id.beaad);
        dbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences3=getSharedPreferences("mydata3", Context.MODE_PRIVATE);
                String titled=sharedPreferences3.getString("titled",DEFAULT2);
                String partd=sharedPreferences3.getString("partd",DEFAULT2);
                String quantityd=sharedPreferences3.getString("quantityd",DEFAULT2);
                if (titled.equals(DEFAULT2)||partd.equals(DEFAULT2)||quantityd.equals(DEFAULT2)){
                    Toast.makeText(AlarmScreen3.this,"no data found",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AlarmScreen3.this," data found succesfully",Toast.LENGTH_LONG).show();
                    dela1.setText(titled);
                    dela2.setText(partd);
                    dela3.setText(quantityd);

                }


            }
        });
    }
}
