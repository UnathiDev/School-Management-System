/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
*   1. User enters credentials (username, password).
*   2. System verifies credentials against the database.
*   3. If valid, proceed to the appropriate user role (admin, teacher). If invalid, display an error message.
*/

public class Login {
    private String username, password;
    private char role;

    /**
     *  A constructor that creates a user login object
     * @param username
     * @param password
     * @param role
     */  
    public Login(String username, String password, char role) {
        if (!username.isEmpty() && !password.isEmpty()) {
            this.username = username;
            this.password = password;
            this.role = role;
        }
    }

    /**
     *  An mutator method that writes the username field
     * @param username
     */  
    public void setUsername(String username) {
        if (!username.isEmpty()) {
            this.username = username;
        }
    }

    /**
     *  An accesor method that reads the username field
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     *  An mutator method that writes the password field
     * @param password
     */    
    public void setPassword(String password) {
        if (!password.isEmpty()) {
            this.password = password;
        }
    }
    
    /**
     *  An accesor method that reads the password field
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     *  An mutator method that writes the role field
     * @param role
     */
    public void setRole(char role) {
        this.role = role;
    }

    /**
     *  An accesor method that reads the role field
     * @param userRole
     * @return the role
     */
    public char getRole(String userRole) {
        if (userRole.equalsIgnoreCase("admin")) {
            role = 'A';
        }else if (userRole.equalsIgnoreCase("teacher")) {
            role = 'T';
        }
        return role;
    }
}
