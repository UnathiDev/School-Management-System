/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *
 * @author unath
 */
public class Student {
    private String name, lastName, IDNumber, dateOfBirth, gender, nationality, emailAddress, phoneNumber, physicalAddress;
    String studentAddress;
    private int age;

    public Student() {
    }
    
    public Student(String name, String lastName, String IDNumber, String dateOfBirth, String gender, String nationality, String emailAddress, String phoneNumber, String physicalAddress, String studentAddress, int age) {
        this.name = name;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.physicalAddress = physicalAddress;
        this.studentAddress = studentAddress;
        this.age = age;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
     * FORMAT: Surname(3 characters) - Code @ skye.edu.za
     * CODE: (age + gender) / 3
     * e.g.: James Okhue = OKH11-((age + gender)/3)@skye.edu.za
     * @return the studentAddress
     */
    public String getStudentAddress() {
        return studentAddress; 
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
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
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
     * @return the physicalAddress
     */
    public String getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * @param physicalAddress the physicalAddress to set
     */
    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
