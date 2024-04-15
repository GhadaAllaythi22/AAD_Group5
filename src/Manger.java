

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

    
    public void viewStatistics(ArrayList<Volunteer> volunteers) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Statistics:");
        System.out.println("Please Enter The Number of Statistics Type");
        System.out.println("------------------------------------------");
        System.out.println("> 1 : Number of all Volunteers");
        System.out.println("> 2 : Number of Volunteers in each City");
        System.out.println("> 3 : Total Volunteers's Work Hourse ");
        System.out.println("> 4 : Number of Volunteers in each Department "); // Sorting Clothes,Distribution,Marketing and Promotion
        
        int choice = scanner.nextInt();
        
        if(choice == 1){
            System.out.println("> Number of all Volunteers are :"+ volunteers.size()+1);
                   
        }else if (choice == 2){
            System.out.println("> Number of Volunteers in each City");
            
            for (int i = 0; i < 10; i++) {
                // we should change the previous code of cities 
                //to an array and include 2 columns one for city name , one to the num of volunteers   
            }
                
        }else if (choice == 3){
                  
            int total= 0;
            for (int i = 0; i < volunteers.size(); i++) {
               total+= volunteers.get(i).getWorkhoursnumber();     
            }
            
            System.out.println("> Total Volunteers's Work Hourse are:"+total +"for "+volunteers.size()+"Volunteers");
            
        }else if (choice == 4){
            
        }else{
            
        }
        
        
        
        
    }
    
}
