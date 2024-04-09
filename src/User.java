
//import
import java.util.*;


public class User {
// User-specific variables

    public String fname;
    public String lname;
    public String gender;
    public String ID;
    public String password;
    public String location;
    public String phoneNumber;
    public String email;

    public User() {
    }
    
// constructer
    
    public User(String fname, String lname, String gender, String ID, String password, String location, String phoneNumber, String email) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.ID = ID;
        this.password = password;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
//      Setters
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//  Getters  
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getID() {
        return ID;
    }
    
    public String getGender() {
        return gender;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    
    
    // sign up method nedded to make the new user put his\her personal info and save them in array list
    
     public void signUp(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first name: ");
        String fname = scanner.next();

        System.out.print("Enter last name: ");
        String lname = scanner.next();
        
        System.out.print("Enter gender: ");
        String gender = scanner.next();

        System.out.print("Enter ID: ");
        String id = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        System.out.print("Enter location: ");
        String location = scanner.next();

        System.out.print("Enter phone number: ");
        String phone = scanner.next();

        System.out.print("Enter email: ");
        String email = scanner.next();

        
         User newUser= new User(fname,lname,gender,id,password,location,phone,email);
         users.add(newUser);

         System.out.println("User added successfully!");
}
     
     // log in method needed to make the existing user put his\her ID&password to access the system
     
      public void login(ArrayList<User> users , ArrayList<Volunteer> volunteers) {
         Scanner scanner = new Scanner(System.in);

         scanner = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        String id = scanner.next();
        
        System.out.print("Enter Password: ");
        scanner.nextLine(); 
        String password = scanner.next();
        
//        if the inputs data match with exisiting inputs the system will send a message to user with his\her name and invoke volunteer request method
        for (User user : users) {
            if (user.ID .equals(id) && user.password.equals(password)) {
                System.out.println("Login successful! Welcome " + user.fname + " " + user.lname);
                
                
                String choise; 
                do{
                    System.out.println("choice V for volunteeringRequest or C for CountVolunteerHoursWorking or E for exit the system: ");
                    choise = scanner.next(); // to enter the person choise 
                    switch(choise.toUpperCase()){
                        case "V":
                            Volunteer.volunteeringRequest( volunteers, id, password);
                            break;
                        case "C":
                            Volunteer.CountVolunteerHoursWorking( volunteers);
                            break;
                        case "E":
                            System.out.println("Logging out, see you later!");
                            return;
                        default:
                           System.out.println("Invalid choice, please try again.");
                           break; 
                    }
                    }while(!choise.equalsIgnoreCase("E"));
                return;
                
                
                
                
            }
        }
//        if it is unmatch inputs the system will send a message to the user and try again
        System.out.println("Invalid ID or Password. Please try again.and if you don’t have account please sign up");
    }
     
    
}
