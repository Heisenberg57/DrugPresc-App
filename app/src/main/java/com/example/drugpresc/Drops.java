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

public class Drops extends AppCompatActivity  {
    private EditText tdrops;
    private EditText pdrops;
    private EditText qdrops;
    private  Button bdrops;
    private Button balarm3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drops);
        tdrops=(EditText)findViewById(R.id.titdrop);
        pdrops=(EditText)findViewById(R.id.part);
        qdrops=(EditText)findViewById(R.id.quant);
        balarm3=(Button) findViewById(R.id.balarm3);


        bdrops=(Button)findViewById(R.id.srd1);
        bdrops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences2=getSharedPreferences("mydata3", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor3=sharedPreferences2.edit();
                editor3.putString("titled",tdrops.getText().toString());
                editor3.putString("partd",pdrops.getText().toString());
                editor3.putString("quantityd",qdrops.getText().toString());
                editor3.commit();
                Toast.makeText(Drops.this,"Stored Succcesfully",Toast.LENGTH_SHORT).show();

            }
        });
        balarm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ir2=new Intent(Drops.this,DropAlarm.class);
                startActivity(ir2);

            }
        });
    }
}
