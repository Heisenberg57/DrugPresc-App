package com.example.drugpresc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper1 extends SQLiteOpenHelper {
 public DatabaseHelper1 (Context context){
     super(context, "Druglist.db",null,1);

 }

    @Override
    public void onCreate(SQLiteDatabase db) {
     db.execSQL("create table druglistdb(title text primary key,type text , potency text,impact text,sideeffects text,otc text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP TABLE IF EXISTS druglistdb");

    }
    public Boolean insert(String title, String type, String potency, String impact, String sideeffects, String otc){
     SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("title",title);
        contentValues.put("type",type);
        contentValues.put("potency",potency);
        contentValues.put("impact",impact);
        contentValues.put("sideeffects",sideeffects);
        contentValues.put("otc",otc);
        Long ins=db.insert("druglistdb",null,contentValues);
        if(ins==-1) {
            return false;
        } else return true;


    }



   public Cursor getAlldata(){
     SQLiteDatabase db=this.getWritableDatabase();
     Cursor res=db.rawQuery("select * from druglistdb",null);
     return res;


   }

}
