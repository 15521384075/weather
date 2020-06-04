package com.example.weather.database;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String CountyName(){
        return CountyName;
    }
    public void setCountyName(String CountyName){
        this.CountyName=CountyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
