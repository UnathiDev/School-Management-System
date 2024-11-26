/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import asqlconnect.SQLConnect;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import schoolmanagement.SchoolManagement;

public class jfrmSkyeSubjectPanel extends javax.swing.JFrame {

    public jfrmSkyeSubjectPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcomboGrade = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jlblReturn4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaDisplay = new javax.swing.JTextArea();
        jcomboSubjects = new javax.swing.JComboBox<>();

        jcomboGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "8", "9", "10", "11", "12" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jlblReturn4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlblReturn4.setForeground(new java.awt.Color(255, 255, 255));
        jlblReturn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblReturn4.setText("Return");
        jlblReturn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jlblReturn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblReturn4MousePressed(evt);
            }
        });

        jtxaDisplay.setEditable(false);
        jtxaDisplay.setColumns(20);
        jtxaDisplay.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jtxaDisplay.setRows(5);
        jScrollPane2.setViewportView(jtxaDisplay);

        jcomboSubjects.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboSubjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Accounting", "Afrikaans", "Agricultural Sciences", "Arts", "Business Studies", "Computer Applications", "Consumer Studies", "Dramatic Arts", "Economics", "Engineering Graphics and Design", "English", "Geography", "History", "Hospitality Studies", "Languages", "Life Orientation", "Life Sciences", "Life Skills", "Mathematics", "Music", "Physical Science", "Science", "Social Sciences", "Technology", "Visual Arts" }));
        jcomboSubjects.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboSubjectsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlblReturn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jcomboSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblReturn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblReturn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturn4MousePressed
        //Returns to admin menu
        SchoolManagement management = new SchoolManagement();
        management.adminMenu = new jfrmAdminMenu();
        management.adminMenu.setLocationRelativeTo(null);
        management.adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblReturn4MousePressed

    private void jcomboSubjectsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboSubjectsItemStateChanged
        String inSubjectName = (String) jcomboSubjects.getSelectedItem(), subjectName, subjectCode, educatorID, firstName, lastName;
        
        try {
            // Establish connection
            Connection connect = SQLConnect.connect();
            //PreparedStatement adminStatement, formStatement, educatorStatement;

            String querySubject = "SELECT tblSubject.SubjectName, tblSubject.SubjectCode, tblSubject.EducatorID, tblEducator.FirstName, tblEducator.LastName " +
                                    "FROM tblSubject " +
                                    "INNER JOIN tblEducator " +
                                    "ON tblSubject.EducatorID = tblEducator.SchoolAddress " +
                                    "WHERE tblSubject.SubjectName = '" + inSubjectName + "'";
            
            PreparedStatement check = connect.prepareStatement(querySubject);
            ResultSet subjectSet = check.executeQuery();
            
            String output = "";
            while (subjectSet.next()) {
                subjectName = subjectSet.getString(1);
                subjectCode = subjectSet.getString(2);
                educatorID = subjectSet.getString(3);
                firstName = subjectSet.getString(4);
                lastName = subjectSet.getString(5);
                
            output += "Subject Name: " + subjectName + "\n";
            output += "Subject Code: " + subjectCode + "\n";
            output += "Educator ID: " + educatorID + "\n";
            output += "Educator Name: " + firstName.charAt(0) + ". " + lastName + "\n\n";
            output += "_________________________________________________________\n\n";
        }

        jtxaDisplay.setText(output);
            
            connect.close();
            check.close();
            subjectSet.close();
        }catch (SQLException sqlError) {
                JOptionPane.showMessageDialog(null, "Failure to connect to the database.\nPlease try again later", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + sqlError.getMessage() + "\n");
                    write.close();
                }catch(Exception e){
                    
                }
        } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Failed to add eduator.\nException Occured", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
                    write.close();
                }catch(Exception e){
                    
                }
        }
    }//GEN-LAST:event_jcomboSubjectsItemStateChanged

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
            java.util.logging.Logger.getLogger(jfrmSkyeSubjectPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeSubjectPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeSubjectPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeSubjectPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmSkyeSubjectPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcomboGrade;
    private javax.swing.JComboBox<String> jcomboSubjects;
    private javax.swing.JLabel jlblReturn4;
    private javax.swing.JTextArea jtxaDisplay;
    // End of variables declaration//GEN-END:variables
}
