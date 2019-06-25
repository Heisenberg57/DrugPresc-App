package com.example.drugpresc;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Syrups extends AppCompatActivity  {
    private EditText tsyr;
    private EditText qsyr;
    private  Button bsyr;
    private EditText bafsy;
    private Button balarm4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syrups);
        tsyr=(EditText)findViewById(R.id.titsy);
        qsyr=(EditText)findViewById(R.id.quantme);
        balarm4=(Button) findViewById(R.id.balarm4);
        bafsy=(EditText) findViewById(R.id.bafsy);


        bsyr=(Button)findViewById(R.id.sr1);
        bsyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences3=getSharedPreferences("mydata4", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor4=sharedPreferences3.edit();
                editor4.putString("titles",tsyr.getText().toString());
                editor4.putString("quantitys",qsyr.getText().toString());
                editor4.putString("bafsy",bafsy.getText().toString());
                editor4.commit();
                Toast.makeText(Syrups.this,"Stored Succcesfully",Toast.LENGTH_SHORT).show();

            }
        });
        balarm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir3=new Intent(Syrups.this,SyrupAlarm.class);
                startActivity(ir3);
            }
        });
    }
}
