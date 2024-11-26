/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *
 * @author unath
 */
public class StudentNextOfKin {
    private String IDNumber, fullName, relationship, primaryPhoneNumber, secondaryPhoneNumber, emailAddress, physicalAddress, occupation;

    public StudentNextOfKin(String IDNumber, String fullName, String relationship, String primaryPhoneNumber, String secondaryPhoneNumber, String emailAddress, String physicalAddress, String occupation) {
        this.IDNumber = IDNumber;
        this.fullName = fullName;
        this.relationship = relationship;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.secondaryPhoneNumber = secondaryPhoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
        this.occupation = occupation;
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
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * @return the primaryPhoneNumber
     */
    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * @param primaryPhoneNumber the primaryPhoneNumber to set
     */
    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    /**
     * @return the secondaryPhoneNumber
     */
    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    /**
     * @param secondaryPhoneNumber the secondaryPhoneNumber to set
     */
    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
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
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    
}
