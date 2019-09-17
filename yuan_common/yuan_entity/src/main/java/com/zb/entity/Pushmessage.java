package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Pushmessage implements Serializable {
    //
    private Integer pushId;
    //
    private Integer companyId;
    //
    private Date messageTime;
    //get set 方法
    public void setPushId (Integer  pushId){
        this.pushId=pushId;
    }
    public  Integer getPushId(){
        return this.pushId;
    }
    public void setCompanyId (Integer  companyId){
        this.companyId=companyId;
    }
    public  Integer getCompanyId(){
        return this.companyId;
    }
    public void setMessageTime (Date  messageTime){
        this.messageTime=messageTime;
    }
    public  Date getMessageTime(){
        return this.messageTime;
    }
}
