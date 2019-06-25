package com.example.drugpresc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Druglistmain extends AppCompatActivity {
    private ImageButton addd;
    private Button Vl;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druglistmain);
        addd=(ImageButton) findViewById(R.id.addb);
        Vl=(Button) findViewById(R.id.viewl);
        addd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Druglistmain.this,DrugList.class);
                startActivity(i);
            }
        });
        Vl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i2=new Intent(Druglistmain.this, ListView1.class);
               startActivity(i2);

            }
        });
    }
}
