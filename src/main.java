// Import

import java.util.*;

public class main {
//   create Scanner to make users can enter their inputs 
    static Scanner scanner = new Scanner(System.in);
//  create array list for new users and volunteers 
    static ArrayList<User> Users = new ArrayList<>();
    static ArrayList<Volunteer> volunteers = new ArrayList<>();

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HI, My name is Ghada Khalid");
        System.out.println("HI, My name is Hadeel Alweldi");
        System.out.println("HI, My name is bayan alharbi");
        System.out.println("HI, My name is Maha Almalki");
        System.out.println("السلام عليكم ,, هالة حمدي");

        // ---------------------------- Implementation of the Keswa Alsedah Aisha Project -------------------------------  
//           --------------------implements 1st method volunteering request ------------------------
        String choice = null;
// Create an object of the User class to invoke the instance methods signUp and login from the User class in the main class
        User user = new User();
// do-while loop to let the user to choose if he\she wants to signup or login or exit the system 
        do {
            System.out.print("choice S for signup or L for Login or E for exit the system: ");
            choice = scanner.next();
            if (choice.equalsIgnoreCase("S")) {
                user.signUp(Users);
            } else if (choice.equalsIgnoreCase("L")) { // user choose if he volunteer or manager to login 
                System.out.print("Are you a Manager or a Volunteer? (M/V): ");
                String usertype = scanner.next();              
               
                // this step to access log in process to the manger 
                // then can show the statistcs 
                switch (usertype.toUpperCase()) {
                    case "M":
                        // the manager has valid ID & password is given from the company and does not needed to varify
                        user.managerLogin(volunteers);
                        break;
                    case "V":
                        user.login(Users, volunteers);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;

                }

            } else {
                System.out.println("please try again");
            }
        } while (!choice.equalsIgnoreCase("E"));

     
    }

}
