package com.example.drugpresc;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlarmScreen4 extends AppCompatActivity {
    private TextView sela1;
    private  TextView sela2;
    private  TextView bam2;
    private Button sbutton;
    private static final String DEFAULT3="N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_screen4);
        sela1 = (TextView) findViewById(R.id.syeal1);
        sela2 = (TextView) findViewById(R.id.syeal2);
        bam2=(TextView) findViewById(R.id.bam2);

        sbutton = (Button) findViewById(R.id.ba);
        sbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences3=getSharedPreferences("mydata4", Context.MODE_PRIVATE);
                String  titles=sharedPreferences3.getString("titles",DEFAULT3);
                String quantitys=sharedPreferences3.getString("quantitys",DEFAULT3);
                String bafsy=sharedPreferences3.getString("bafsy",DEFAULT3);
                if (titles.equals(DEFAULT3)||quantitys.equals(DEFAULT3)||bafsy.equals(DEFAULT3)){
                    Toast.makeText(AlarmScreen4.this,"no data found",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(AlarmScreen4.this," data found succesfully",Toast.LENGTH_LONG).show();
                    sela1.setText(titles);
                    sela2.setText(quantitys);
                    bam2.setText(bafsy);
                }


            }
        });

    }
}
