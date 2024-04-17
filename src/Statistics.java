
import java.util.ArrayList;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Statistics {
    
    private int totalVolunteers;
    private int totalWorkHours;

    public Statistics() {
    }

    public Statistics(int totalVolunteers, int totalWorkHours) {
        this.totalVolunteers = totalVolunteers;
        this.totalWorkHours = totalWorkHours;
    }

    public int getTotalVolunteers() {
        return totalVolunteers;
    }

    public void setTotalVolunteers(int totalVolunteers) {
        this.totalVolunteers = totalVolunteers;
    }

    public int getTotalWorkHours() {
        return totalWorkHours;
    }

    public void setTotalWorkHours(ArrayList<Volunteer> volunteers) {
      // this.totalWorkHours = totalWorkHours;
      int total = 0;
        for (int i = 0; i < volunteers.size(); i++) {
            total += volunteers.get(i).getWorkhoursnumber();
        }

      totalWorkHours = total;      
    }
    
    public void CountVolunteerInCity(ArrayList<Volunteer> volunteers) {
        
        String[] cities = {"Jeddah", "Mecca", "Yanbu", "Hail", "Dammam", "Riyadh"};
        
            int[] CountVolunteerIneachCity = new int[cities.length];

            // Count the number of volunteers in each city
            for (Volunteer volunteer : volunteers) {
                String city = volunteer.getCity();
                for (int i = 0; i < cities.length; i++) {
                    if (city.equalsIgnoreCase(cities[i])) {
                        CountVolunteerIneachCity[i]++;
                        break;
                    }
                }
            }

            // Display the number of volunteers in each city
            
            for (int i = 0; i < cities.length; i++) {
                System.out.println(cities[i] + "\t" + CountVolunteerIneachCity[i]);
            }
        
    }
    
}
