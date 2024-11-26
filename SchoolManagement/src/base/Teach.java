/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

public class Teach extends Teacher{
    private String subject;
    private int grade;
    
    /**
     * A constructor that creates a Teach object
     * @param subject
     * @param grade 
     */
    public Teach(String subject, int grade) {
        super(null, null, null, null, null, null, null, null, false, false);
        this.subject = subject;
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
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
