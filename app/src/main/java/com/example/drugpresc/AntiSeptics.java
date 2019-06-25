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

public class AntiSeptics extends AppCompatActivity  {
    private EditText btype;
    private EditText asname;
    private EditText asfreq;
    private  Button asb;
    private Button r;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anti_septics);
        btype=(EditText)findViewById(R.id.bananti);
        asname=(EditText)findViewById(R.id.titanti);
        asfreq=(EditText)findViewById(R.id.quaanti);
        r=(Button) findViewById(R.id.r);


      asb=(Button)findViewById(R.id.sr2);
        asb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences1=getSharedPreferences("mydata2", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor2=sharedPreferences1.edit();
                editor2.putString("typeb",btype.getText().toString());
                editor2.putString("titlea",asname.getText().toString());
                editor2.putString("quantitya",asfreq.getText().toString());
                editor2.commit();
                Toast.makeText(AntiSeptics.this,"Stored Succcesfully",Toast.LENGTH_SHORT).show();

            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir=new Intent(AntiSeptics.this,AntiSepAlarm.class);
                startActivity(ir);
            }
        });

    }
}