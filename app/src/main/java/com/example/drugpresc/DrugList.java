package com.example.drugpresc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class DrugList extends AppCompatActivity {
    private EditText dt;
    private Spinner dty;
    private Spinner dpt;
    private Spinner im;
    private EditText sef;
    private EditText otca;
    private Button dst;
    DatabaseHelper1 db1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_list);
        db1=new DatabaseHelper1(this);


        dt = (EditText) findViewById(R.id.drugt);
        dty = (Spinner) findViewById(R.id.Stype1);
        dpt = (Spinner) findViewById(R.id.potency);
        im = (Spinner) findViewById(R.id.impact);
        sef = (EditText) findViewById(R.id.sideeffects);
        otca = (EditText) findViewById(R.id.avail);
        dst = (Button) findViewById(R.id.list);
        dst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title=dt.getText().toString();
                String type=dty.getSelectedItem().toString();
                String potency=dpt.getSelectedItem().toString();
                String impact=im.getSelectedItem().toString();
                String sideeffects=sef.getText().toString();
                String otc=otca.getText().toString();
                db1.insert(title,type,potency,impact,sideeffects,otc);
                Toast.makeText(getApplicationContext(),"Data Inserted Succesfully",Toast.LENGTH_LONG).show();


            }
        });





    }
}