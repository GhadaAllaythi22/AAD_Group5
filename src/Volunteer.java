/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gkmis
 */
public class Volunteer extends User {
     private String typeofvolunteer;
    private String date;
    private int workhoursnumber;

        // Constructor from user class and volunteer variables 
    public Volunteer(String typeofvolunteer, String date, int workhoursnumber, String fname, String lname, String ID, String password, String location, String phoneNumber, String email) {
        super(fname, lname, ID, password, location, phoneNumber, email);
        this.typeofvolunteer = typeofvolunteer;
        this.date = date;
        this.workhoursnumber = workhoursnumber;
    }

     // Constructor
    public Volunteer(String fname, String lname, String id, String password, String location, String phoneNumber, String email, String typeofvolunteer, String date, int workhoursnumber) {
        super(fname, lname, id, password, location, phoneNumber, email);
        this.typeofvolunteer = typeofvolunteer;
        this.date = date;
        this.workhoursnumber = workhoursnumber; }
    
    public String getTypeofvolunteer() {
        return typeofvolunteer;
    }

    public String getDate() {
        return date;
    }

    public int getWorkhoursnumber() {
        return workhoursnumber;
    }

    public void setTypeofvolunteer(String typeofvolunteer) {
        this.typeofvolunteer = typeofvolunteer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWorkhoursnumber(int workhoursnumber) {
        this.workhoursnumber = workhoursnumber;
    }
}
