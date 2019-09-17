package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Comment implements Serializable {
    //
    private Integer commentId;
    //
    private Integer Starclass;
    //
    private String commentcontent;
    //get set 方法
    public void setCommentId (Integer  commentId){
        this.commentId=commentId;
    }
    public  Integer getCommentId(){
        return this.commentId;
    }
    public void setStarclass (Integer  Starclass){
        this.Starclass=Starclass;
    }
    public  Integer getStarclass(){
        return this.Starclass;
    }
    public void setCommentcontent (String  commentcontent){
        this.commentcontent=commentcontent;
    }
    public  String getCommentcontent(){
        return this.commentcontent;
    }
}
