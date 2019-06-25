package com.example.drugpresc;

import                                                                                                                                                             android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmScreen1 extends AppCompatActivity {
    private TextView ela1;
    private TextView ela2;
    private TextView ela3;
    private TextView elaba;
    private Button button;
public static final String DEFAULT="N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_screen1);
        ela1 = (TextView) findViewById(R.id.eal1);
        ela2 = (TextView) findViewById(R.id.eal2);
        ela3 = (TextView) findViewById(R.id.eal3);
        elaba=(TextView) findViewById(R.id.elab);
        button = (Button) findViewById(R.id.ba);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("mydata", Context.MODE_PRIVATE);
                String title=sharedPreferences.getString("title",DEFAULT);
                String quantity=sharedPreferences.getString("quantity",DEFAULT);
                String frequency=sharedPreferences.getString("frequency",DEFAULT);
                String bam=sharedPreferences.getString("bam",DEFAULT);
                if (title.equals(DEFAULT)||quantity.equals(DEFAULT)||frequency.equals(DEFAULT)||bam.equals(DEFAULT)){
                    Toast.makeText(AlarmScreen1.this,"no data found",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AlarmScreen1.this," data found succesfully",Toast.LENGTH_LONG).show();
                    ela1.setText(title);
                    ela2.setText(quantity);
                    ela3.setText(frequency);
                    elaba.setText(bam);

                }


            }
        });


    }
}
