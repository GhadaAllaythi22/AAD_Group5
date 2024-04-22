
import java.util.ArrayList;

public class Statistics {
    // Statistics-specific variables

    private int totalVolunteers;
    private int totalWorkHours;

    // constructers 
    public Statistics() {
    }

    public Statistics(int totalVolunteers, int totalWorkHours) {
        this.totalVolunteers = totalVolunteers;
        this.totalWorkHours = totalWorkHours;
    }

    // Setters
    public void setTotalVolunteers(int totalVolunteers) {
        this.totalVolunteers = totalVolunteers;
    }

    public void setTotalWorkHours(ArrayList<Volunteer> volunteers) {
        this.totalWorkHours = totalWorkHours;
        int total = 0;
        for (int i = 0; i < volunteers.size(); i++) {
            total += volunteers.get(i).getWorkhoursnumber();
        }

        totalWorkHours = total;
    }

    //  Getters
    public int getTotalVolunteers() {
        return totalVolunteers;
    }

    public int getTotalWorkHours() {
        return totalWorkHours;
    }

    /* sprint 4: CountVolunteerInCity method: this method will count how many volunteer is volunteered in each city 
    firt in will take volunteers variable from array list. after that we add array of cities provided in the company 
    and array to count the numbers saved for each city. the core of the method is the calculating part which is 
    for loop takes each volunteer and compare for each city if are equal it will count +1 until 
    it finish all cities and all volunteers from the saved array list> 
    finally, it will print each city in the array and numbers of volunteers in this city 
     
     */
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
