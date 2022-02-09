package com.company;

public class registerDetails {
    private String name;
    private long ID;
    private String County;
    private long phone_no;

    public  registerDetails(String name,long ID,String County,long phone_no){
        System.out.println("wAIT FOR THE PROCESS...");
        this.name = name;
        this.ID = ID;
        this.County=County;
        this.phone_no = phone_no;
    }
    public String getName(){
        return name;
    }

    public long getID() {
        return ID;
    }
    public String getCounty(){
        return County;
    }

    public long getPhone_no() {
        return phone_no;
    }
    public void setCounty(String newCounty){
        County=newCounty;

    }
}
