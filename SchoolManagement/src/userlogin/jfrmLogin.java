/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userlogin;

import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.time.*;

import asqlconnect.SQLConnect;
import schoolmanagement.SchoolManagement;
import skyeuseradmin.jfrmAdminMenu;
import skyeuserteacher.jfrmTeacherMenu;

public class jfrmLogin extends javax.swing.JFrame {

    public jfrmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jpnlComponents = new javax.swing.JPanel();
        jlblUsername = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();
        jtxfUsername = new javax.swing.JTextField();
        jlblLogin = new javax.swing.JLabel();
        jlblClose = new javax.swing.JLabel();
        jlblRestart = new javax.swing.JLabel();
        jpwdPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jpnlComponents.setBackground(new java.awt.Color(102, 102, 255));

        jlblUsername.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblUsername.setForeground(new java.awt.Color(255, 255, 255));
        jlblUsername.setText("Username");

        jlblPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblPassword.setForeground(new java.awt.Color(255, 255, 255));
        jlblPassword.setText("Password");

        jtxfUsername.setBackground(new java.awt.Color(102, 102, 255));
        jtxfUsername.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfUsername.setForeground(new java.awt.Color(255, 255, 255));
        jtxfUsername.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfUsername.setToolTipText("username");
        jtxfUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfUsernameActionPerformed(evt);
            }
        });

        jlblLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlblLogin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogin.setText("Login");
        jlblLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblLoginMousePressed(evt);
            }
        });

        jlblClose.setBackground(new java.awt.Color(255, 255, 255));
        jlblClose.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblClose.setForeground(new java.awt.Color(255, 255, 255));
        jlblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblClose.setText("Close");
        jlblClose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblCloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblCloseMousePressed(evt);
            }
        });

        jlblRestart.setBackground(new java.awt.Color(255, 255, 255));
        jlblRestart.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblRestart.setForeground(new java.awt.Color(255, 255, 255));
        jlblRestart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblRestart.setText("Reset");
        jlblRestart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblRestartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblRestartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblRestartMousePressed(evt);
            }
        });

        jpwdPassword.setBackground(new java.awt.Color(102, 102, 255));
        jpwdPassword.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jpwdPassword.setForeground(new java.awt.Color(255, 255, 255));
        jpwdPassword.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jpwdPassword.setToolTipText("password");
        jpwdPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("scd");

        javax.swing.GroupLayout jpnlComponentsLayout = new javax.swing.GroupLayout(jpnlComponents);
        jpnlComponents.setLayout(jpnlComponentsLayout);
        jpnlComponentsLayout.setHorizontalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpwdPassword))
                                    .addComponent(jtxfUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)))
                .addGap(186, 186, 186))
        );
        jpnlComponentsLayout.setVerticalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jlblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jlblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpwdPassword)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jpnlComponents);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfUsernameActionPerformed

    private void jlblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLoginMousePressed
        String inUsername, inPassword, dbUsername, dbPassword, dbRole, dbQuery, dbBlockQuery, dbUpdateAttemptsQuery;
        int failedAttempts;
        boolean blocked = false;
        int maxAttempts = 3;

        // Get user input
        inUsername = jtxfUsername.getText();
        inPassword = new String(jpwdPassword.getPassword()); // Secure password handling

        // Query to get user details, including role, failed attempts, and blocked status
        dbQuery = "SELECT Username, Password, Role, Attempts, Denied FROM tblAdmin WHERE Username = ?";

        // Query to block the user
        dbBlockQuery = "UPDATE tblAdmin SET Blocked = TRUE WHERE Username = ?";

        // Query to update failed attempts
        dbUpdateAttemptsQuery = "UPDATE tblAdmin SET Attempts = ? WHERE Username = ?";

        try {
            // Establish connection
            Connection connect = SQLConnect.connect();

            // Prepare statement for the user query
            PreparedStatement statement = connect.prepareStatement(dbQuery);
            statement.setString(1, inUsername);

            // Execute query
            ResultSet set = statement.executeQuery();

            // Check if user exists
            if (set.next()) {
                dbUsername = set.getString("Username");
                dbPassword = set.getString("Password");
                dbRole = set.getString("Role");
                failedAttempts = set.getInt("Attempts");
                blocked = set.getBoolean("Denied");

                // Check if user is already blocked
                if (blocked) {
                    JOptionPane.showMessageDialog(null, "Your account is blocked.\nCall an administrator for further assistance", "Login failed", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Verify password
                    if (inPassword.equals(dbPassword)) {
                        // Reset failed attempts on successful login
                        PreparedStatement resetAttemptsStatement = connect.prepareStatement(dbUpdateAttemptsQuery);
                        resetAttemptsStatement.setInt(1, 0); // Reset attempts
                        resetAttemptsStatement.setString(2, inUsername);
                        resetAttemptsStatement.executeUpdate();
                        resetAttemptsStatement.close();
                        
                        SchoolManagement management = new SchoolManagement();    
                        // Display message based on user role
                        switch (dbRole) {
                            case "A":
                            case "I":
                                management.adminMenu = new jfrmAdminMenu();
                                management.adminMenu.setLocationRelativeTo(null);
                                management.adminMenu.setVisible(true);
                                dispose();
                                break;
                            case "T":
                                management.teacherMenu = new jfrmTeacherMenu();
                                management.teacherMenu.setLocationRelativeTo(null);
                                management.teacherMenu.setVisible(true);
                                dispose();
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "You have no access to the system.\nCall tech support for assistace if\nthis is a mistake", "Invalid User", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        // Increment failed attempts if the password is incorrect
                        failedAttempts++;

                        // Check if user should be blocked
                        if (failedAttempts >= maxAttempts) {
                            // Block user
                            PreparedStatement blockStatement = connect.prepareStatement(dbBlockQuery);
                            blockStatement.setString(1, inUsername);
                            blockStatement.executeUpdate();
                            blockStatement.close();
                            JOptionPane.showMessageDialog(null, "Too many failed login attempts.\nCall an administrator for further assistance", "Account Blocked", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            // Update failed attempts in the database
                            PreparedStatement updateAttemptsStatement = connect.prepareStatement(dbUpdateAttemptsQuery);
                            updateAttemptsStatement.setInt(1, failedAttempts);
                            updateAttemptsStatement.setString(2, inUsername);
                            updateAttemptsStatement.executeUpdate();
                            updateAttemptsStatement.close();
                            JOptionPane.showMessageDialog(null, "Invalid password. Attempt " + failedAttempts + " of " + maxAttempts, "Error logging in", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login details.\nPlease try again later.", "Login failed", JOptionPane.ERROR_MESSAGE);
            }

            // Close resources
            set.close();
            statement.close();
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
    }//GEN-LAST:event_jlblLoginMousePressed

    private void jlblRestartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRestartMousePressed
        jtxfUsername.setText("");
        jtxfUsername.setFocusable(true);
        
        jpwdPassword.setText("");
    }//GEN-LAST:event_jlblRestartMousePressed

    private void jlblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMousePressed
        int exit = JOptionPane.showConfirmDialog(null, "Are you sure you would like to exit?", "Confirm action", JOptionPane.YES_NO_OPTION);
        
        if(exit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jlblCloseMousePressed

    private void jlblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLoginMouseEntered
        jlblLogin.setSize(jlblLogin.getWidth() + 5, jlblLogin.getHeight() + 5);
    }//GEN-LAST:event_jlblLoginMouseEntered

    private void jlblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblLoginMouseExited
        jlblLogin.setSize(jlblLogin.getWidth() - 5, jlblLogin.getHeight() - 5);
    }//GEN-LAST:event_jlblLoginMouseExited

    private void jlblRestartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRestartMouseEntered
        jlblRestart.setSize(jlblRestart.getWidth() + 5, jlblRestart.getHeight() + 5);
    }//GEN-LAST:event_jlblRestartMouseEntered

    private void jlblRestartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRestartMouseExited
        jlblRestart.setSize(jlblRestart.getWidth() - 5, jlblRestart.getHeight() - 5);
    }//GEN-LAST:event_jlblRestartMouseExited

    private void jlblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseEntered
        jlblClose.setSize(jlblClose.getWidth() + 5, jlblClose.getHeight() + 5);
    }//GEN-LAST:event_jlblCloseMouseEntered

    private void jlblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseExited
        jlblClose.setSize(jlblClose.getWidth() - 5, jlblClose.getHeight() - 5);
    }//GEN-LAST:event_jlblCloseMouseExited

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
            java.util.logging.Logger.getLogger(jfrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlblClose;
    private javax.swing.JLabel jlblLogin;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JLabel jlblRestart;
    private javax.swing.JLabel jlblUsername;
    private javax.swing.JPanel jpnlComponents;
    private javax.swing.JPasswordField jpwdPassword;
    private javax.swing.JTextField jtxfUsername;
    // End of variables declaration//GEN-END:variables
}
