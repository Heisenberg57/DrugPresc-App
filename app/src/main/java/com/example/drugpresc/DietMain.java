package com.example.drugpresc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DietMain extends AppCompatActivity {
    private ImageButton adddi;
    private Button vld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm);
        adddi=(ImageButton) findViewById(R.id.addd);
        vld=(Button) findViewById(R.id.viewld);
        adddi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id=new Intent(DietMain.this,Diet.class);
                startActivity(id);
            }
        });
        vld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id1=new Intent(DietMain.this,ListView3.class);
                startActivity(id1);
            }
        });
    }
}
