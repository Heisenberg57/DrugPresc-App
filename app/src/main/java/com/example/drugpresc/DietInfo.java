package com.example.drugpresc;

public class DietInfo {
    private  String diet;
    private  String vit;
    private  String pro;
    private  String carb;
    private  String fat;

    public  DietInfo(String ddd,String vvv,String ppp,String ccc,String fff){
       diet=ddd;
       vit=vvv;
       pro=ppp;
       carb=ccc;
       fat=fff;



    }

    public String getDiet() {
        return diet;
    }

    public String getVit() {
        return vit;
    }

    public String getPro() {
        return pro;
    }

    public String getCarb() {
        return carb;
    }

    public String getFat() {
        return fat;
    }
}
