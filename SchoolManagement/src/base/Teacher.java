/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 * Handles all teacher related information
 */
public class Teacher {
    private String firstName, lastName, IDNumber, address, phoneNumber, gender, nationality, accessLevel, type;
    private boolean administrativePrivileges, formTeacher; 

    /**
     * A constructor that creates a teacher object
     * @param firstName
     * @param lastName
     * @param IDNumber format YYMMDDSSSSCAZ
     * @param address
     * @param phoneNumber
     * @param gender
     * @param nationality
     * @param accessLevel
     * @param administrativePrivileges
     * @param formTeacher 
     */
    public Teacher(String firstName, String lastName, String IDNumber, String address, String phoneNumber, String gender, String nationality, String accessLevel, boolean administrativePrivileges, boolean formTeacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.nationality = nationality;
        this.accessLevel = accessLevel;
        this.administrativePrivileges = administrativePrivileges;
        this.formTeacher = formTeacher;
    }
    
    String getSkyeEmail(){
        /**
         * @Example format: JOHN DOE = DOE-J@skye.edu.za
         */
        return getLastName().toUpperCase() + "-" + getFirstName().toUpperCase().charAt(0) + "@skye.edu.za";
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the IDNumber
     */
    public String getIDNumber() {
        return IDNumber;
    }

    /**
     * @param IDNumber the IDNumber to set
     */
    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the accessLevel
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * @param accessLevel the accessLevel to set
     */
    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * @return the administrativePrivileges
     */
    public boolean isAdministrativePrivileges() {
        return administrativePrivileges;
    }

    /**
     * @param administrativePrivileges the administrativePrivileges to set
     */
    public void setAdministrativePrivileges(boolean administrativePrivileges) {
        this.administrativePrivileges = administrativePrivileges;
    }

    /**
     * @return the formTeacher
     */
    public boolean isFormTeacher() {
        return formTeacher;
    }

    /**
     * @param formTeacher the formTeacher to set
     */
    public void setFormTeacher(boolean formTeacher) {
        this.formTeacher = formTeacher;
    }
    
    public String getTeacherType(char c){
        if (c == 'T') {
            //No login rigths
           type = "Form Teacher"; //Teaches and has a register class, no admin
        } else if (c == 'A') {
            //Given login rights
           type = "Admin"; //Teaches, no register class, admin
        } else if (c == 'I') {
            //Given login rights
            type = "Integral"; //Handles everything at once
        }
        return type;
    }
}
