package com.example.drugpresc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton prescfb=(ImageButton) findViewById(R.id.bpresc);
        ImageButton druglist=(ImageButton) findViewById(R.id.bdlist);
        ImageButton antisep=(ImageButton) findViewById(R.id.banti);
        ImageButton dropb=(ImageButton) findViewById(R.id.bdrops);
        ImageButton syrupb=(ImageButton) findViewById(R.id.bsyrups);
        ImageButton dietb=(ImageButton) findViewById(R.id.bdiets);


        prescfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(MainActivity.this,PrescriptionForm.class);
                startActivity(in1);
            }
        });

        druglist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(MainActivity.this,Druglistmain.class);
                startActivity(in2);
            }
        });


        antisep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4=new Intent(MainActivity.this,AntiSeptics.class);
                startActivity(in4);
            }
        });

        dropb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5=new Intent(MainActivity.this,Drops.class);
                startActivity(in5);
            }
        });
        syrupb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6=new Intent(MainActivity.this,Syrups.class);
                startActivity(in6);
            }
        });

        dietb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7=new Intent(MainActivity.this,DietMain.class);
                startActivity(in7);
            }
        });



    }
}
