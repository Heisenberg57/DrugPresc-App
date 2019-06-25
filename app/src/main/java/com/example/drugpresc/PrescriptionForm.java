package com.example.drugpresc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.RequiresApi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PrescriptionForm extends AppCompatActivity  {
    private Button brem;
    private EditText tite;
    private EditText qua;
    private EditText freq;
    private EditText bam;
    private Button storea;


    @TargetApi(Build.VERSION_CODES.O)
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription_form);
        tite=(EditText)findViewById(R.id.titledrug);
        qua=(EditText)findViewById(R.id.quantutydrug);
        freq=(EditText)findViewById(R.id.Frequency);
        bam=(EditText)findViewById(R.id.bam);

        brem=(Button)findViewById(R.id.gtrb);
        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inpf=new Intent(PrescriptionForm.this,PrescAlarm1.class);
                startActivity(inpf);
            }
        });
        storea=(Button)findViewById(R.id.rem);
        storea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("mydata", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("title",tite.getText().toString());
                editor.putString("quantity",qua.getText().toString());
                editor.putString("frequency",freq.getText().toString());
                editor.putString("bam",bam.getText().toString());
                editor.commit();
                Toast.makeText(PrescriptionForm.this,"Stored Succcesfully",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
