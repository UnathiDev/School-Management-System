/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuserteacher;

import schoolmanagement.SchoolManagement;
import skyeuseradmin.jfrmClassList;
import skyeuseradmin.jfrmSkyeStudentPanel;
import skyeuseradmin.jfrmSkyeSubjectPanel;
import userlogin.jfrmLogin;

public class jfrmTeacherMenu extends javax.swing.JFrame {

    public jfrmTeacherMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground = new javax.swing.JPanel();
        jlblViewClassList = new javax.swing.JLabel();
        jlblViewStudent = new javax.swing.JLabel();
        jlblSubjectInfo = new javax.swing.JLabel();
        jlblReturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlBackground.setBackground(new java.awt.Color(102, 102, 255));

        jlblViewClassList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblViewClassList.setForeground(new java.awt.Color(255, 255, 255));
        jlblViewClassList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblViewClassList.setText("View Class list");
        jlblViewClassList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblViewClassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblViewClassListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblViewClassListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblViewClassListMousePressed(evt);
            }
        });

        jlblViewStudent.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblViewStudent.setForeground(new java.awt.Color(255, 255, 255));
        jlblViewStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblViewStudent.setText("View student");
        jlblViewStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblViewStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblViewStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblViewStudentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblViewStudentMousePressed(evt);
            }
        });

        jlblSubjectInfo.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSubjectInfo.setForeground(new java.awt.Color(255, 255, 255));
        jlblSubjectInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSubjectInfo.setText("View subject information");
        jlblSubjectInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblSubjectInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblSubjectInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblSubjectInfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblSubjectInfoMousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout jpnlBackgroundLayout = new javax.swing.GroupLayout(jpnlBackground);
        jpnlBackground.setLayout(jpnlBackgroundLayout);
        jpnlBackgroundLayout.setHorizontalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlblSubjectInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblViewStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblViewClassList, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jpnlBackgroundLayout.setVerticalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jlblViewClassList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblSubjectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMousePressed
        //Returns to main menu
        SchoolManagement management = new SchoolManagement();   
        management.login = new jfrmLogin();
        management.login.setLocationRelativeTo(null);
        management.login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblReturnMousePressed

    private void jlblViewClassListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewClassListMousePressed
        // New window to view the class list
        SchoolManagement management = new SchoolManagement();   
        management.classList = new jfrmClassList();
        management.classList.setLocationRelativeTo(null);
        management.classList.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblViewClassListMousePressed

    private void jlblViewStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMousePressed
        // New window to view a student's information (only able to view information of his/her own students)
        SchoolManagement management = new SchoolManagement();   
        management.studentPanel = new jfrmSkyeStudentPanel();
        management.studentPanel.setLocationRelativeTo(null);
        management.studentPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblViewStudentMousePressed

    private void jlblSubjectInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubjectInfoMousePressed
        // New window to view subject information
        SchoolManagement management = new SchoolManagement();   
        management.subjectPanel = new jfrmSkyeSubjectPanel();
        management.subjectPanel.setLocationRelativeTo(null);
        management.subjectPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblSubjectInfoMousePressed

    private void jlblReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseEntered
        jlblReturn.setSize(jlblReturn.getWidth() + 5, jlblReturn.getHeight() + 5);
    }//GEN-LAST:event_jlblReturnMouseEntered

    private void jlblReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseExited
        jlblReturn.setSize(jlblReturn.getWidth() - 5, jlblReturn.getHeight() - 5);
    }//GEN-LAST:event_jlblReturnMouseExited

    private void jlblViewClassListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewClassListMouseEntered
        jlblViewClassList.setSize(jlblViewClassList.getWidth() + 5, jlblViewClassList.getHeight() + 5);
    }//GEN-LAST:event_jlblViewClassListMouseEntered

    private void jlblViewClassListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewClassListMouseExited
        jlblViewClassList.setSize(jlblViewClassList.getWidth() - 5, jlblViewClassList.getHeight() - 5);
    }//GEN-LAST:event_jlblViewClassListMouseExited

    private void jlblViewStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMouseEntered
        jlblViewStudent.setSize(jlblViewStudent.getWidth() + 5, jlblViewStudent.getHeight() + 5);
    }//GEN-LAST:event_jlblViewStudentMouseEntered

    private void jlblViewStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMouseExited
        jlblViewStudent.setSize(jlblViewStudent.getWidth() - 5, jlblViewStudent.getHeight() - 5);
    }//GEN-LAST:event_jlblViewStudentMouseExited

    private void jlblSubjectInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubjectInfoMouseEntered
        jlblSubjectInfo.setSize(jlblSubjectInfo.getWidth() + 5, jlblSubjectInfo.getHeight() + 5);
    }//GEN-LAST:event_jlblSubjectInfoMouseEntered

    private void jlblSubjectInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubjectInfoMouseExited
        jlblSubjectInfo.setSize(jlblSubjectInfo.getWidth() - 5, jlblSubjectInfo.getHeight() - 5);
    }//GEN-LAST:event_jlblSubjectInfoMouseExited

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
            java.util.logging.Logger.getLogger(jfrmTeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmTeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmTeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmTeacherMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmTeacherMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSubjectInfo;
    private javax.swing.JLabel jlblViewClassList;
    private javax.swing.JLabel jlblViewStudent;
    private javax.swing.JPanel jpnlBackground;
    // End of variables declaration//GEN-END:variables
}
