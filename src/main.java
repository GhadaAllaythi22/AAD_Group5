
//import
import java.util.*;

public class main {
    static Scanner scanner=new Scanner (System.in);
    public static ArrayList<User>Users=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HI, My name is Ghada Khalid");
        System.out.println("HI, My name is Hadeel Alweldi");
        System.out.println("HI, My name is bayan alharbi");
        System.out.println("HI, My name is Maha Almalki");
        System.out.println("السلام عليكم ,, هالة حمدي");
        
        
        System.out.println(Users);
        // ArrayList<User>Users=new ArrayList<>();
          String choice = null;
        do{
            System.out.print("choice L for Login and S for signup or E for exit: ");
            choice=scanner.next();
        if(choice.equalsIgnoreCase("S")){
            signUp();
            
        }
        else if(choice.equalsIgnoreCase("L")){
            login();
        
        }else
            System.out.println("please try again");
        }while(!choice.equalsIgnoreCase("E"));
        System.out.println("");
    }
    
    
    public static void login() {
         scanner = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        String id = scanner.next();
        
        System.out.print("Enter Password: ");
        scanner.nextLine(); // Consume newline character
        String password = scanner.next();
        
        for (User user : Users) {
            if (user.ID .equals(id) && user.password.equals(password)) {
                System.out.println("Login successful! Welcome " + user.fname + " " + user.lname);
                volunteeringRequest(); // Call the volunteering request method
                return;
            }
        }
        
        System.out.println("Invalid ID or Password. Please try again.and if you don’t have account please sign up");
    }
    
    public static void volunteeringRequest() {
    scanner = new Scanner(System.in);
    System.out.print("Do you want to make a volunteering request? (Yes/No): ");
    String choice = scanner.next();

    if (choice.equalsIgnoreCase("Yes")) {
        System.out.print("Enter the type of volunteering: ");
        String type = scanner.next();

        System.out.print("Enter the work hours: ");
        int workhours = scanner.nextInt();

        System.out.print("Enter the date: ");
        String date = scanner.next();

        // اذا حط بيانات التطوع يقول انو ايوا خلاص نجح ادخال البيانات
        System.out.println("Volunteering request submitted successfully!");
    } else { // if he\she said No 
        return; // Exit the method
    }
}
    
    public static void signUp() {
         scanner = new Scanner(System.in);

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
         Users.add(newUser);

         System.out.println("User added successfully!");
}
 
 
 
//    public void NewVolunteerrequest (ArrayList<Volunteer>volunteers,User User, String typeofvolunteer,String date,int NumWork) {
//        volunteers.add(User, typeofvolunteer, date, NumWork);

//        System.out.println("Volunteer added successfully!");
        
}
