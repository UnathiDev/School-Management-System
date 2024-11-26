/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.time.*;

import asqlconnect.SQLConnect;
import javax.swing.table.DefaultTableModel;
import schoolmanagement.SchoolManagement;
import skyeuserteacher.jfrmTeacherMenu;

/**
 *
 * @author unath
 */
public class jfrmClassList extends javax.swing.JFrame {
    public jfrmClassList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblReturn = new javax.swing.JLabel();
        jspClassList = new javax.swing.JScrollPane();
        jtblClassList = new javax.swing.JTable();
        jlblRegister = new javax.swing.JLabel();
        jlblRegister1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlblFClass = new javax.swing.JLabel();
        jlblSGrade = new javax.swing.JLabel();
        jcomboClass = new javax.swing.JComboBox<>();
        jcomboGrade = new javax.swing.JComboBox<>();
        jlblList = new javax.swing.JLabel();
        jlblNumStudents = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jlblReturn.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblReturn.setForeground(new java.awt.Color(255, 255, 255));
        jlblReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblReturn.setText("Return");
        jlblReturn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblReturnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblReturnMousePressed(evt);
            }
        });

        jspClassList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtblClassList.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtblClassList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "ID Number", "Address", "Class"
            }
        ));
        jspClassList.setViewportView(jtblClassList);

        jlblRegister.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jlblRegister.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegister.setText("Register a new student");

        jlblRegister1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlblRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegister1.setText("View class list");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jlblFClass.setBackground(new java.awt.Color(102, 102, 255));
        jlblFClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFClass.setForeground(new java.awt.Color(102, 102, 255));
        jlblFClass.setText("Class");

        jlblSGrade.setBackground(new java.awt.Color(102, 102, 255));
        jlblSGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSGrade.setForeground(new java.awt.Color(102, 102, 255));
        jlblSGrade.setText("Grade");

        jcomboClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "S1", "S2", "S3" }));

        jcomboGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcomboGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSGrade, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlblFClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcomboClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblSGrade)
                    .addComponent(jlblFClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcomboClass)
                    .addComponent(jcomboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlblList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblList.setForeground(new java.awt.Color(255, 255, 255));
        jlblList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblList.setText("Generate List");
        jlblList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblListMousePressed(evt);
            }
        });

        jlblNumStudents.setBackground(new java.awt.Color(255, 255, 255));
        jlblNumStudents.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblNumStudents.setForeground(new java.awt.Color(255, 255, 255));
        jlblNumStudents.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jlblNumStudents.setText("Number of students: 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblList, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspClassList)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblRegister1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblNumStudents)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(276, 276, 276)
                    .addComponent(jlblRegister)
                    .addContainerGap(341, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblRegister1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblList, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jspClassList, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblNumStudents)
                .addGap(9, 9, 9))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(jlblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addGap(236, 236, 236)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseEntered
        jlblReturn.setSize(jlblReturn.getWidth() + 5, jlblReturn.getHeight() + 5);
    }//GEN-LAST:event_jlblReturnMouseEntered

    private void jlblReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseExited
        jlblReturn.setSize(jlblReturn.getWidth() - 5, jlblReturn.getHeight() - 5);
    }//GEN-LAST:event_jlblReturnMouseExited

    private void jlblReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMousePressed
        //Returns to main menu
        SchoolManagement management = new SchoolManagement();
        management.teacherMenu = new jfrmTeacherMenu();
        management.teacherMenu.setLocationRelativeTo(null);
        management.teacherMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblReturnMousePressed

    private void jlblListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblListMouseEntered

    private void jlblListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblListMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblListMouseExited

    private void jlblListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblListMousePressed
    String inClass;
    int inGrade, numberOfStudents = 0;
    
    inGrade = Integer.parseInt((String) jcomboGrade.getSelectedItem());
    inClass = (String) jcomboClass.getSelectedItem();

    try {
        Connection connect = SQLConnect.connect();

        PreparedStatement statement = connect.
                prepareStatement
    ("SELECT tblStudent.FirstName, tblStudent.LastName, tblStudent.IDNumber, tblStudent.StudentAddress, tblStudentAcademics.Grade, tblStudentAcademics.FormClass FROM tblStudent INNER JOIN tblStudentAcademics ON tblStudent.StudentAddress = tblStudentAcademics.StudentAddress " +
"WHERE tblStudentAcademics.Grade = " + inGrade + " AND tblStudentAcademics.FormClass = '" + inClass + "'");
        
        PreparedStatement statementNumStudents = connect.
                prepareStatement
    ("SELECT COUNT(*) FROM tblStudentAcademics WHERE tblStudentAcademics.Grade = " + inGrade + " AND tblStudentAcademics.FormClass = '" + inClass + "'");

        ResultSet set = statement.executeQuery();
        ResultSet setNumStudents = statementNumStudents.executeQuery();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("ID Number");
        model.addColumn("Address");
        model.addColumn("Class");

        while (set.next()) {
            String name = set.getString(1) + " " + set.getString(2); 
            String idNumber = set.getString(3);
            String address = set.getString(4);
            String studentClass = String.valueOf(set.getInt(5)) + " " + set.getString(6);

            model.addRow(new Object[]{name, idNumber, address, studentClass});
        }
        
        while (setNumStudents.next()){
            numberOfStudents = setNumStudents.getInt(1);
        }

        jtblClassList.setModel(model);
        jlblNumStudents.setText("Number of students: " + String.valueOf(numberOfStudents));
        
        statement.close();
        statementNumStudents.close();
        set.close();
        setNumStudents.close();
        connect.close();
    } catch (SQLException sqlError) {
        JOptionPane.showMessageDialog(null, "Failure to connect to the database.\nPlease try again later", "Operation failed", JOptionPane.ERROR_MESSAGE);
        try {
            FileWriter write = new FileWriter("errors.txt", true);
            write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + sqlError.getMessage() + "\n");
            write.close();
        }catch(Exception e){

        }
    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "System failure.\nPlease try again later", "Operation failed", JOptionPane.ERROR_MESSAGE);
        try {
            FileWriter write = new FileWriter("errors.txt", true);
            write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
            write.close();
        }catch(Exception e){

        }
    }
    
    }//GEN-LAST:event_jlblListMousePressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfrmClassList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmClassList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmClassList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmClassList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmClassList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcomboClass;
    private javax.swing.JComboBox<String> jcomboGrade;
    private javax.swing.JLabel jlblFClass;
    private javax.swing.JLabel jlblList;
    private javax.swing.JLabel jlblNumStudents;
    private javax.swing.JLabel jlblRegister;
    private javax.swing.JLabel jlblRegister1;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSGrade;
    private javax.swing.JScrollPane jspClassList;
    private javax.swing.JTable jtblClassList;
    // End of variables declaration//GEN-END:variables
}
