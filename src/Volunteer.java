
import java.util.*;

public class Volunteer extends User {
// volunteer-specific variables
     private String typeofvolunteer;
     private String date;
     private int workhoursnumber;

        // Constructor from User class inheriited and volunteer variables 
    public Volunteer(String fname, String lname,String gender, String id, String password, String location, String phoneNumber, String email, String typeofvolunteer, String date, int workhoursnumber) {
        super(fname, lname,gender, id, password, location, phoneNumber, email);
        this.typeofvolunteer = typeofvolunteer;
        this.date = date;
        this.workhoursnumber = workhoursnumber;
    }
//    Setters
    
    public void setTypeofvolunteer(String typeofvolunteer) {
        this.typeofvolunteer = typeofvolunteer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setWorkhoursnumber(int workhoursnumber) {
        this.workhoursnumber = workhoursnumber;
    }
    
//    Getters
    public String getTypeofvolunteer() {
        return typeofvolunteer;
    }

    public String getDate() {
        return date;
    }

    public int getWorkhoursnumber() {
        return workhoursnumber;
    }

   
/*    Volunteering Request method: This method will take volunteers info from the array list and the ID and password 
                               to match them with existing user data. 
    after login the system will ask the user if he\she wants to make volunteering request if the answer was yes:
     he\she will enter 3 inputs( type of volunteering, work hours, date he\she wants) after thet the system will 
    go throgh loop it will match the ID&password and save the new data in volunteering object
    finally, the system will send a message to the user confirming the request was successful. */  
        public static void volunteeringRequest( ArrayList<Volunteer> volunteers, String id, String password) {
       
            Scanner scanner = new Scanner(System.in);
            
            
        System.out.print("Do you want to make a volunteering request? (Yes/No): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("Yes")){
         System.out.print("Enter the type of volunteering: ");
         String type = scanner.next();

         System.out.print("Enter the work hours: ");
         int workhours = scanner.nextInt();

         System.out.print("Enter the date: ");
         String date = scanner.next();

         
        for (User user : main.Users) {
            if (user.getID().equals(id) && user.getPassword().equals(password)) {
                Volunteer volunteering = new Volunteer(user.getFname(), user.getLname(), user.getGender(), id, password, user.getLocation(),
            user.getPhoneNumber(), user.getEmail(), type, date, workhours);
                main.volunteers.add(volunteering);
            }
        }
        
         // If the volunteering data is entered, it will say that the data is successfully submitted
         System.out.println("Volunteering request submitted successfully!");
        
        }
        else{
        return; // Exit the method
    }
        
    }
       //sprit3: count Volunteer Hours Working method
    /* public static void countVolunteerHoursWorking( ArrayList<Volunteer> volunteers){
                for (Volunteer volunteer : main.volunteers) {
                           volunteer.getWorkhoursnumber()
    
    
    }
    
}*/
}
