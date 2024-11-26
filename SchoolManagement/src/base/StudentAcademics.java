/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *
 * @author unath
 */
public class StudentAcademics extends Student{
    private String[] subjectList = {};
    private int grade;

    public StudentAcademics() {
    }
    
    public StudentAcademics(String studentAddress, int grade) {
        this.studentAddress = studentAddress;
        this.grade = grade;
    }

    /**
     * @return the studentAddress
     */
    public String getStudentAddress() {
        return this.getStudentAddress();
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(String studentAddress) {
        this.setStudentAddress(studentAddress);
    }

    /**
     * Example Format: {Mathematics, Subject 1, Subject 2, Subject 3}.
     * @return the subjectList
     */
    public String[] getSubjectList() {
        return subjectList;
    }

    /**
     * @param subjectList the subjectList to set
     */
    public void setSubjectList(String[] subjectList) {
        this.subjectList = subjectList;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}
