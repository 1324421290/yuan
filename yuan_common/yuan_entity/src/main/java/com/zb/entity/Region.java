package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Region implements Serializable {
    //
    private Integer regId;
    //
    private Integer placeId;
    //
    private String regName;
    //get set 方法
    public void setRegId (Integer  regId){
        this.regId=regId;
    }
    public  Integer getRegId(){
        return this.regId;
    }
    public void setPlaceId (Integer  placeId){
        this.placeId=placeId;
    }
    public  Integer getPlaceId(){
        return this.placeId;
    }
    public void setRegName (String  regName){
        this.regName=regName;
    }
    public  String getRegName(){
        return this.regName;
    }
}
