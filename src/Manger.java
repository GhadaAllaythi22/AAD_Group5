
import java.util.*;

public class Manger extends User {

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

  

  

}
