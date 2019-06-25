package com.example.drugpresc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Diet extends AppCompatActivity {

    private EditText diet;
    private EditText vitamin;
    private EditText protein;
    private EditText carbs;
    private EditText fats;

    private Button buttond;
    DatabaseHelper3 dbh3;
    private Button viewd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        diet = (EditText) findViewById(R.id.pd);
        vitamin = (EditText) findViewById(R.id.vit);
        protein = (EditText) findViewById(R.id.pro);
        carbs = (EditText) findViewById(R.id.carbs);
        fats = (EditText) findViewById(R.id.fats);
        buttond = (Button) findViewById(R.id.diet);
        viewd = (Button) findViewById(R.id.viewdiet);

        dbh3 = new DatabaseHelper3(this);

        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dietb = diet.getText().toString();

                String vitaminb = vitamin.getText().toString();
                String proteinb = protein.getText().toString();

                String carb = carbs.getText().toString();
                String fatb = fats.getText().toString();

                dbh3.insert(dietb, vitaminb, proteinb, carb, fatb);
                Toast.makeText(getApplicationContext(), "Data Inserted Succesfully", Toast.LENGTH_LONG).show();


            }
        });
        viewd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentd = new Intent(Diet.this, ListView3.class);
                startActivity(intentd);
            }
        });
    }
}