
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author LENOVO
 */
public class Manger extends User {

    private String reportID;
    private int numberOfVoluntters;// we should remove it 
    private int numberOfDonors;
    private String[] activityStatistics; // like num of volunteers's work hours ....

    public Manger(String fname, String lname, String gender, String ID, String password, String location, String phoneNumber, String email) {
        super(fname, lname, gender, ID, password, location, phoneNumber, email);
        this.reportID = "";
        this.numberOfVoluntters = 0;
        this.numberOfDonors = 0;
        this.activityStatistics = new String[0]; //  empty array

    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public int getNumberOfVoluntters() {
        return numberOfVoluntters;
    }

    public void setNumberOfVoluntters(int numberOfVoluntters) {
        this.numberOfVoluntters = numberOfVoluntters;
    }

    public int getNumberOfDonors() {
        return numberOfDonors;
    }

    public void setNumberOfDonors(int numberOfDonors) {
        this.numberOfDonors = numberOfDonors;
    }

    public String[] getActivityStatistics() {
        return activityStatistics;
    }

    public void setActivityStatistics(String[] activityStatistics) {
        this.activityStatistics = activityStatistics;
    }

    public static void viewStatistics(ArrayList<Volunteer> volunteers) {

        Statistics statistics = new Statistics();

        System.out.println("Statistics:");

        System.out.println("> Number of all Volunteers are : " + volunteers.size());

        System.out.println("> Number of Volunteers in each City");
        statistics.CountVolunteerInCity(volunteers);

        System.out.println("> Total Volunteers's Work Hourse are:" + statistics.getTotalWorkHours());

    }

}
