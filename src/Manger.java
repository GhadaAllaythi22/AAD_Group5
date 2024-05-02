
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Manger extends User {



    
    static Date currentDate;
    private String reportID;
    private int numberOfVoluntters;  
    private int numberOfDonors;
    private String[] activityStatistics; 

    public Manger(String fname, String lname, String gender, String ID, String password, String location, String phoneNumber, String email) {
        super(fname, lname, gender, ID, password, location, phoneNumber, email);
        this.reportID = "";
        this.numberOfVoluntters = 0;
        this.numberOfDonors = 0;
        this.activityStatistics = new String[0]; //  empty array
        currentDate = new Date();

    }

    public Manger() {
    }

 

   
    
//    setters

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }
    
       public void setNumberOfVoluntters(int numberOfVoluntters) {
        this.numberOfVoluntters = numberOfVoluntters;
    }

    
    public void setNumberOfDonors(int numberOfDonors) {
        this.numberOfDonors = numberOfDonors;
    }
    
      public void setActivityStatistics(String[] activityStatistics) {
        this.activityStatistics = activityStatistics;
    }

    public static void setCurrentDate(Date currentDate) {
        Manger.currentDate = currentDate;
    }
      
      
//      getters 

    public int getNumberOfVoluntters() {
        return numberOfVoluntters;
    }

  public String getReportID() {
        return reportID;
    }
      
    public int getNumberOfDonors() {
        return numberOfDonors;
    }


    public String[] getActivityStatistics() {
        return activityStatistics;
    }

    public static Date getCurrentDate() {
        return new Date();
    }
    
  


    // sprint 5: viewStatistics method: this method will display the statistics for the volunteers and print it to the manager  

    static void viewStatistics(ArrayList<Volunteer> volunteers) {
        Statistics statistics = new Statistics();

//        we delete the date variable to make it in the testing successful because of date formating was causing an error 


        System.out.println("");
        System.out.println("-------------------- Statistics -----------------");
        System.out.println("> Number of all Volunteers are : " + volunteers.size());
        System.out.println("-------------------------------------");
        System.out.println("> Number of Volunteers in each City");
        statistics.CountVolunteerInCity(volunteers);
        System.out.println("-------------------------------------");
         statistics.setTotalWorkHours(volunteers);
        System.out.println("> Total Volunteers's Work Hourse are:" + statistics.getTotalWorkHours());
        System.out.println("-------------------------------------");    }

    
  

}
