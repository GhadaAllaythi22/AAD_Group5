// ا
//import
import java.util.*;

public class User {
    
    public String fname;
    public String lname;
    public String gender;
    public String ID;
    public String password;
    public String location;
    public String phoneNumber;
    public String email;
    
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

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return fname + lname;
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
}
