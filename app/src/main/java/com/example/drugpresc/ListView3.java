package com.example.drugpresc;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListView3 extends AppCompatActivity {

    DatabaseHelper3 dbh3;
    private ListView listView;
    ArrayList<DietInfo> infodiet;
    DietInfo dietInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view4);
        dbh3=new DatabaseHelper3(this);
        infodiet=new ArrayList<>();
        listView=(ListView) findViewById(R.id.lv4);
        Cursor data=dbh3.getAlldata();
        if(data.getCount()==0){
            Toast.makeText(ListView3.this,"Nothing To Show",Toast.LENGTH_LONG).show();
        }
        else {
            while (data.moveToNext()){
                dietInfo=new DietInfo(data.getString(0),data.getString(1),data.getString(2),data.getString(3),data.getString(4));
                infodiet.add(dietInfo);

            }
            FColumn_ListAdapter adapter3=new FColumn_ListAdapter(this,R.layout.list_adapter_view_3,infodiet);
            listView.setAdapter(adapter3);
        }

    }
}
