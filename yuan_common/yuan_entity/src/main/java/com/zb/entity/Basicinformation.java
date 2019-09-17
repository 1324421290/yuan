package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Basicinformation implements Serializable {
    //
    private Integer resumeId;
    //
    private String basicName;
    //
    private String personalname;
    //
    private String phone;
    //
    private String alipay;
    //get set 方法
    public void setResumeId (Integer  resumeId){
        this.resumeId=resumeId;
    }
    public  Integer getResumeId(){
        return this.resumeId;
    }
    public void setBasicName (String  basicName){
        this.basicName=basicName;
    }
    public  String getBasicName(){
        return this.basicName;
    }
    public void setPersonalname (String  personalname){
        this.personalname=personalname;
    }
    public  String getPersonalname(){
        return this.personalname;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setAlipay (String  alipay){
        this.alipay=alipay;
    }
    public  String getAlipay(){
        return this.alipay;
    }
}
