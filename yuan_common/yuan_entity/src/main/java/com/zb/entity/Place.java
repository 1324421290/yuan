package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Place implements Serializable {
    //
    private Integer placeId;
    //
    private String placeName;
    //get set 方法
    public void setPlaceId (Integer  placeId){
        this.placeId=placeId;
    }
    public  Integer getPlaceId(){
        return this.placeId;
    }
    public void setPlaceName (String  placeName){
        this.placeName=placeName;
    }
    public  String getPlaceName(){
        return this.placeName;
    }
}
