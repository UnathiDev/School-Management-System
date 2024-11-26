/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *  A class that creates a subject object
 */
public class Subject {
    private String subjectName, subjectEducator, educatorAddress;
    private int subjectGrade;

    /**
     * 
     * @param subjectName
     * @param subjectEducator
     * @param educatorAddress
     * @param subjectGrade 
     */
    public Subject(String subjectName, String subjectEducator, String educatorAddress, int subjectGrade) {
        if (!subjectName.isEmpty() && !subjectEducator.isEmpty() && !educatorAddress.isEmpty() && (subjectGrade > 0 || subjectGrade < 13)) {
            this.subjectName = subjectName;
            this.subjectEducator = subjectEducator;
            this.educatorAddress = educatorAddress;
            this.subjectGrade = subjectGrade;
        }
    }
    
    /**
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        if (!subjectName.isEmpty()) {
            this.subjectName = subjectName;            
        }
    }

    /**
     * @return the subjectCode
     */
    public String getSubjectCode() {
        return subjectName.substring(0,3).toUpperCase() + "-" + String.valueOf(subjectGrade);
    }

    /**
     * @return the subjectEducator
     */
    public String getSubjectEducator() {
        return subjectEducator;
    }

    /**
     * @param subjectEducator the subjectEducator to set
     */
    public void setSubjectEducator(String subjectEducator) {
        if (!subjectEducator.isEmpty()) {
            this.subjectEducator = subjectEducator;
        }
    }

    /**
     * @return the educatorAddress
     */
    public String getEducatorAddress() {
        return educatorAddress;
    }

    /**
     * @param educatorAddress the educatorAddress to set
     */
    public void setEducatorAddress(String educatorAddress) {
        if (!educatorAddress.isEmpty()) {
            this.educatorAddress = educatorAddress;
        }
    }

    /**
     * @return the subjectGrade
     */
    public int getSubjectGrade() {
        return subjectGrade;
    }

    /**
     * @param subjectGrade the subjectGrade to set
     */
    public void setSubjectGrade(int subjectGrade) {
        if (subjectGrade > 0 || subjectGrade < 13) {
            this.subjectGrade = subjectGrade;
        }
    }
}