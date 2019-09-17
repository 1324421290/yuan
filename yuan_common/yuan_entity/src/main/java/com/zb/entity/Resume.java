package com.zb.entity;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Resume implements Serializable {
    //
    private Integer resumeId;
    //
    private String resumeName;
    //
    private Integer teamId;
    //
    private String role;
    //
    private String company;
    //
    private String experience;
    //
    private String salary;
    //
    private String PartTime;
    //
    private Integer regId;
    //
    private String ability;
    //
    private String rojectexp;

    private String roleName;

    private String placeName;

    private String regName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getRegName() {
        return regName;
    }

    public void setRegName(String regName) {
        this.regName = regName;
    }

    //get set 方法
    public void setResumeId (Integer  resumeId){
        this.resumeId=resumeId;
    }
    public  Integer getResumeId(){
        return this.resumeId;
    }
    public void setResumeName (String  resumeName){
        this.resumeName=resumeName;
    }
    public  String getResumeName(){
        return this.resumeName;
    }
    public void setTeamId (Integer  teamId){
        this.teamId=teamId;
    }
    public  Integer getTeamId(){
        return this.teamId;
    }
    public void setRole (String  role){
        this.role=role;
    }
    public  String getRole(){
        return this.role;
    }
    public void setCompany (String  company){
        this.company=company;
    }
    public  String getCompany(){
        return this.company;
    }
    public void setExperience (String  experience){
        this.experience=experience;
    }
    public  String getExperience(){
        return this.experience;
    }
    public void setSalary (String  salary){
        this.salary=salary;
    }
    public  String getSalary(){
        return this.salary;
    }
    public void setPartTime (String  PartTime){
        this.PartTime=PartTime;
    }
    public  String getPartTime(){
        return this.PartTime;
    }
    public void setRegId (Integer  regId){
        this.regId=regId;
    }
    public  Integer getRegId(){
        return this.regId;
    }
    public void setAbility (String  ability){
        this.ability=ability;
    }
    public  String getAbility(){
        return this.ability;
    }
    public void setRojectexp (String  rojectexp){
        this.rojectexp=rojectexp;
    }
    public  String getRojectexp(){
        return this.rojectexp;
    }
}
