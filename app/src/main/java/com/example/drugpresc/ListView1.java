package com.example.drugpresc;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListView1 extends AppCompatActivity {
    DatabaseHelper1 dbh;
    private ListView listView;
    ArrayList<DrugInfo> infolidt;
    DrugInfo drugInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        dbh=new DatabaseHelper1(this);
        infolidt=new ArrayList<>();
        listView=(ListView) findViewById(R.id.lv1);
        Cursor data=dbh.getAlldata();
        if(data.getCount()==0){
            Toast.makeText(ListView1.this,"Nothing To Show",Toast.LENGTH_LONG).show();
        }
        else {
            while (data.moveToNext()){
               drugInfo=new DrugInfo(data.getString(0),data.getString(1),data.getString(2),data.getString(3),data.getString(4));
               infolidt.add(drugInfo);

            }
            FiveColumn_ListAdapter adapter=new FiveColumn_ListAdapter(this,R.layout.list_adapter_view,infolidt);
            listView.setAdapter(adapter);
        }

    }
}
