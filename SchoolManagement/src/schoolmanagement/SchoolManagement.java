/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package schoolmanagement;

import skyeuseradmin.*;
import skyeuserteacher.*;
import userlogin.*;
import skyeuseradmin.*;

/**
 * @project School Management System
 * @occupation UNISA undergraduate
 * @author Unathi Okhue
 */
public class SchoolManagement {
    public jfrmLogin login;
    
    //PACKAGE: skyeuserteacher
    public jfrmTeacherMenu teacherMenu;
    
    //PACKAGE: skyeuseradmin
    public jfrmAdminMenu adminMenu;
    public jfrmSkyeStudentAdd studentAdd;
    public jfrmSkyeStudentPanel studentPanel;
    public jfrmSkyeSubjectPanel subjectPanel;
    public jfrmSkyeTeacherAdd teacherAdd;
    public jfrmSkyeTeacherPanel teacherPanel;
    public jfrmClassList classList;
    
    public static void main(String[] args) {
        SchoolManagement management = new SchoolManagement();
        management.login = new jfrmLogin();
        management.login.setLocationRelativeTo(null);
        management.login.setVisible(true);
    }    
}