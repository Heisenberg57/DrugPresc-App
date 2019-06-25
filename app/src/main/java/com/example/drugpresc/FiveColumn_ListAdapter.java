package com.example.drugpresc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FiveColumn_ListAdapter extends ArrayAdapter {
    private LayoutInflater layoutInflater;
    private ArrayList<DrugInfo> arrayListdrug;
    private int mViewResourceid;

    public  FiveColumn_ListAdapter(Context context,int textViewResourceid,ArrayList<DrugInfo> arrayListdrug){

        super(context,textViewResourceid,arrayListdrug);
        this.arrayListdrug=arrayListdrug;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceid=textViewResourceid;
    }
    public View getView(int position, View convertview, ViewGroup parents){
        convertview=layoutInflater.inflate(mViewResourceid,null);
        DrugInfo drugInfo=arrayListdrug.get(position);
        if(arrayListdrug!=null){

            TextView dtitle=(TextView) convertview.findViewById(R.id.la1);
            TextView dtype=(TextView) convertview.findViewById(R.id.la2);
            TextView dpot=(TextView) convertview.findViewById(R.id.la3);
            TextView dimp=(TextView) convertview.findViewById(R.id.la4);
            TextView dsef=(TextView) convertview.findViewById(R.id.la5);
            if(dtitle!=null){
                dtitle.setText((drugInfo.getDtitle()));
            }
            if(dtype!=null){
                dtype.setText((drugInfo.getDtype()));
            }
            if(dpot!=null){
                dpot.setText((drugInfo.getDpote()));
            }
            if(dimp!=null){
                dimp.setText((drugInfo.getDimp()));
            }
            if(dsef!=null){
                dsef.setText((drugInfo.getDsef()));
            }
        }
        return convertview;

    }
}
