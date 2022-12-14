/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;

/**
 *
 * @author OZN cOxat
 */
public class User {
    String Username;
    String Password;
    
    Boolean Isadmin;

    public User(){}
    public User(String Username, String Password, Boolean Isadmin) {
        this.Username = Username;
        this.Password = Password;
        this.Isadmin = Isadmin;
    }

  //  User() {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }

    public Boolean getIsadmin() {
        return Isadmin;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setIsadmin(Boolean Isadmin) {
        this.Isadmin = Isadmin;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    
}
