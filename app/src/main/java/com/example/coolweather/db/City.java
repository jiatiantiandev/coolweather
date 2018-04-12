package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 贾添添 on 2018/4/12.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public String getCityName(){
        return cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public int getProvinceCode(){
        return provinceCode;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }


}
