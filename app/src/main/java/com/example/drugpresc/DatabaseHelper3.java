package com.example.drugpresc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper3 extends SQLiteOpenHelper {
    public DatabaseHelper3 (Context context){
        super(context, "Diet.db",null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table dietdb(diet text primary key,vitamin text , protein text,carbohydrate text,fats text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS dietb");

    }
    public Boolean insert(String diet, String vitamin, String protein,String carbohydrate, String fats){
        SQLiteDatabase db3=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("diet",diet);
        contentValues.put("vitamin",vitamin);
        contentValues.put("protein",protein);
        contentValues.put("carbohydrate",carbohydrate);
        contentValues.put("fats",fats);

        Long ins=db3.insert("dietdb",null,contentValues);
        if(ins==-1) {
            return false;
        } else return true;


    }



    public Cursor getAlldata(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res=db.rawQuery("select * from dietdb",null);
        return res;


    }

}
