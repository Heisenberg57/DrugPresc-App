package com.example.drugpresc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FColumn_ListAdapter extends ArrayAdapter {
    private LayoutInflater layoutInflater3;
    private ArrayList<DietInfo> arrayListdiet;
    private int mViewResourceid;

    public  FColumn_ListAdapter(Context context, int textViewResourceid, ArrayList<DietInfo> arrayListdiet){

        super(context,textViewResourceid,arrayListdiet);
        this.arrayListdiet=arrayListdiet;
        layoutInflater3=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceid=textViewResourceid;
    }
    public View getView(int position, View convertview, ViewGroup parents){
        convertview=layoutInflater3.inflate(mViewResourceid,null);
        DietInfo dietInfo=arrayListdiet.get(position);
        if(arrayListdiet!=null){

            TextView di=(TextView) convertview.findViewById(R.id.dla1);
            TextView vi=(TextView) convertview.findViewById(R.id.dla2);
            TextView pr=(TextView) convertview.findViewById(R.id.dla3);
            TextView ca=(TextView) convertview.findViewById(R.id.dla4);
            TextView fa=(TextView) convertview.findViewById(R.id.dla5);
            if(di!=null){
                di.setText((dietInfo.getDiet()));
            }
            if(vi!=null){
                vi.setText((dietInfo.getVit()));
            }
            if(pr!=null){
                pr.setText((dietInfo.getPro()));
            }
            if(ca!=null){
                ca.setText((dietInfo.getCarb()));
            }
            if(fa!=null){
                fa.setText((dietInfo.getFat()));
            }
        }
        return convertview;

    }
}

