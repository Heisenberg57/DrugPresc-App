package com.example.drugpresc;

import android.support.v7.app.AppCompatActivity;

public class DrugInfo  {
    private  String dtitle;
    private  String dtype;
    private  String dpote;
    private  String dimp;
    private  String dsef;

    public  DrugInfo(String drtitle,String drtype,String drpote,String drimp,String drsef){
        dtitle=drtitle;
        dtype=drtype;
        dpote=drpote;
        dimp=drimp;
        dsef=drsef;



    }

    public String getDtitle() {
        return dtitle;
    }

    public String getDtype() {
        return dtype;
    }

    public String getDpote() {
        return dpote;
    }

    public String getDimp() {
        return dimp;
    }

    public String getDsef() {
        return dsef;
    }
}
