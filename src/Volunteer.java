
import java.util.*;

public class Volunteer extends User {
// volunteer-specific variables
     private String typeofvolunteer;
     private String date;
     private int workhoursnumber;
    private String city;


// Constructor from User class inheriited and volunteer variables 
    public Volunteer(String fname, String lname,String gender, String id, String password, String location, String phoneNumber, String email, String typeofvolunteer, String date, int workhoursnumber, String City) {
        super(fname, lname,gender, id, password, location, phoneNumber, email);
        this.typeofvolunteer = typeofvolunteer;
        this.date = date;
        this.workhoursnumber = workhoursnumber;
        this.city = City;
    }
    //new constrctor added by bayan

    public Volunteer( String ID,int workhoursnumber) {
        super( ID);
        this.workhoursnumber = workhoursnumber;
    }

    Volunteer(String maha, String ali, String jeddah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getCity() {
        return city;
    }

   
/*    sprint 2: Volunteering Request method: This method will take volunteers info from the array list and the ID and password 
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
         
         System.out.print("select the city: Jeddah, Mecca, Yanbu, Hail, Dammam, Riyadh");
         String city = scanner.next();

         
        for (User user : main.Users) {
            if (user.getID().equals(id) && user.getPassword().equals(password)) {
                Volunteer volunteering = new Volunteer(user.getFname(), user.getLname(), user.getGender(), id, password, user.getLocation(),
                user.getPhoneNumber(), user.getEmail(), type, date, workhours, city);
                main.volunteers.add(volunteering);
                // If the volunteering data is entered, it will say that the data is successfully submitted
            System.out.println("Volunteering request submitted successfully!");
            return;
            }
        }
              
        
        }
        else{
        return; // Exit the method
    }
    }
        //   -------------------- End of 1st method volunteeringRequest  ------------------------
        
        //Sprint 3
    //           --------------------implements 2nd method Count Volunteer Hours Working ------------------------
        /* Count Volunteer Hours Working method: After validating of login, the system will be asked to choose one of the services or to exit the system, when the user selecting the Count Volunteer Hours Working service 
         the method will gather all volunteer hours work from the array list of volunteers, then match each work hours with associated ID for the volunteer, then calculate and display the total work hours for the volunteer.
        */
        public static int CountVolunteerHoursWorking(String id, ArrayList<Volunteer> volunteers){
             
            int CuurentHourWork=0 ; // define the hour work variable with initon vaule to increment  
            
                //loop and check the volunteer id to in Volunteer arrayList to get his/her total hour work.
                for (Volunteer volunteer : volunteers) { 
                    if(volunteer.getID().equalsIgnoreCase(id)){
                      CuurentHourWork += volunteer.getWorkhoursnumber(); // get the current hour work snd then incemnt it to the var CuurentHourWork
                      
                    }
                }
                   
                        return CuurentHourWork;
        }
                        
        
                 
            
            
                    
           
       

   } //   -------------------- End of 2nd method Count Volunteer Hours Working ------------------------
