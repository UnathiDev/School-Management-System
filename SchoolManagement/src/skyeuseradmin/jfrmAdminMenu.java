/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import schoolmanagement.SchoolManagement;
import skyeuseradmin.jfrmSkyeSubjectPanel;
import userlogin.jfrmLogin;

public class jfrmAdminMenu extends javax.swing.JFrame {

    public jfrmAdminMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground = new javax.swing.JPanel();
        jlblAddTeacher = new javax.swing.JLabel();
        jlblViewTeacher = new javax.swing.JLabel();
        jlblAddStudent = new javax.swing.JLabel();
        jlblViewStudent = new javax.swing.JLabel();
        jlblInformation = new javax.swing.JLabel();
        jlblReturn = new javax.swing.JLabel();
        jlblClassList = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlBackground.setBackground(new java.awt.Color(102, 102, 255));
        jpnlBackground.setForeground(new java.awt.Color(255, 255, 255));
        jpnlBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpnlBackground.setPreferredSize(new java.awt.Dimension(769, 450));

        jlblAddTeacher.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAddTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jlblAddTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAddTeacher.setText("Add teacher");
        jlblAddTeacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblAddTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblAddTeacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblAddTeacherMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblAddTeacherMousePressed(evt);
            }
        });

        jlblViewTeacher.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblViewTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jlblViewTeacher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblViewTeacher.setText("View teacher");
        jlblViewTeacher.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblViewTeacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblViewTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblViewTeacherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblViewTeacherMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblViewTeacherMousePressed(evt);
            }
        });

        jlblAddStudent.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        jlblAddStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAddStudent.setText("Add student");
        jlblAddStudent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblAddStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblAddStudentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblAddStudentMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblAddStudentMousePressed(evt);
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

        jlblInformation.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblInformation.setForeground(new java.awt.Color(255, 255, 255));
        jlblInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInformation.setText("View subject information");
        jlblInformation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblInformationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblInformationMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblInformationMousePressed(evt);
            }
        });

        jlblReturn.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblReturn.setForeground(new java.awt.Color(255, 255, 255));
        jlblReturn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblReturn.setText("Return");
        jlblReturn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jlblClassList.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblClassList.setForeground(new java.awt.Color(255, 255, 255));
        jlblClassList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblClassList.setText("Class List");
        jlblClassList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblClassList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblClassListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblClassListMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblClassListMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBackgroundLayout = new javax.swing.GroupLayout(jpnlBackground);
        jpnlBackground.setLayout(jpnlBackgroundLayout);
        jpnlBackgroundLayout.setHorizontalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jlblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlBackgroundLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblViewTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblClassList, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        jpnlBackgroundLayout.setVerticalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jlblAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jlblAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblViewTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblClassList, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jlblInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jlblAddTeacherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddTeacherMousePressed
        // New window to add a teahcer
        SchoolManagement management = new SchoolManagement();   
        management.teacherAdd = new jfrmSkyeTeacherAdd();
        management.teacherAdd.setLocationRelativeTo(null);
        management.teacherAdd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblAddTeacherMousePressed

    private void jlblViewTeacherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewTeacherMousePressed
        // New window to view a teahcer's information
        SchoolManagement management = new SchoolManagement();   
        management.teacherPanel = new jfrmSkyeTeacherPanel();
        management.teacherPanel.setLocationRelativeTo(null);
        management.teacherPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblViewTeacherMousePressed

    private void jlblAddStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddStudentMousePressed
        // New window to add a student
        SchoolManagement management = new SchoolManagement();   
        management.studentAdd = new jfrmSkyeStudentAdd();
        management.studentAdd.setLocationRelativeTo(null);
        management.studentAdd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblAddStudentMousePressed

    private void jlblViewStudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMousePressed
        // New window to view a student's information
        SchoolManagement management = new SchoolManagement();   
        management.studentPanel = new jfrmSkyeStudentPanel();
        management.studentPanel.setLocationRelativeTo(null);
        management.studentPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblViewStudentMousePressed

    private void jlblInformationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInformationMousePressed
        // New window to view subject information
        SchoolManagement management = new SchoolManagement();   
        management.subjectPanel = new jfrmSkyeSubjectPanel();
        management.subjectPanel.setLocationRelativeTo(null);
        management.subjectPanel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblInformationMousePressed

    private void jlblReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseEntered
        jlblReturn.setSize(jlblReturn.getWidth() + 5, jlblReturn.getHeight() + 5);
    }//GEN-LAST:event_jlblReturnMouseEntered

    private void jlblReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseExited
        jlblReturn.setSize(jlblReturn.getWidth() - 5, jlblReturn.getHeight() - 5);
    }//GEN-LAST:event_jlblReturnMouseExited

    private void jlblAddTeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddTeacherMouseEntered
        jlblAddTeacher.setSize(jlblAddTeacher.getWidth() + 5, jlblAddTeacher.getHeight() + 5);
    }//GEN-LAST:event_jlblAddTeacherMouseEntered

    private void jlblAddTeacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddTeacherMouseExited
        jlblAddTeacher.setSize(jlblAddTeacher.getWidth() - 5, jlblAddTeacher.getHeight() - 5);
    }//GEN-LAST:event_jlblAddTeacherMouseExited

    private void jlblViewTeacherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewTeacherMouseEntered
        jlblViewTeacher.setSize(jlblViewTeacher.getWidth() + 5, jlblViewTeacher.getHeight() + 5);
    }//GEN-LAST:event_jlblViewTeacherMouseEntered

    private void jlblViewTeacherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewTeacherMouseExited
        jlblViewTeacher.setSize(jlblViewTeacher.getWidth() - 5, jlblViewTeacher.getHeight() - 5);
    }//GEN-LAST:event_jlblViewTeacherMouseExited

    private void jlblAddStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddStudentMouseEntered
        jlblAddStudent.setSize(jlblAddStudent.getWidth() + 5, jlblAddStudent.getHeight() + 5);
    }//GEN-LAST:event_jlblAddStudentMouseEntered

    private void jlblAddStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAddStudentMouseExited
        jlblAddStudent.setSize(jlblAddStudent.getWidth() - 5, jlblAddStudent.getHeight() - 5);
    }//GEN-LAST:event_jlblAddStudentMouseExited

    private void jlblViewStudentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMouseEntered
        jlblViewStudent.setSize(jlblViewStudent.getWidth() + 5, jlblViewStudent.getHeight() + 5);
    }//GEN-LAST:event_jlblViewStudentMouseEntered

    private void jlblViewStudentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblViewStudentMouseExited
        jlblViewStudent.setSize(jlblViewStudent.getWidth() - 5, jlblViewStudent.getHeight() - 5);
    }//GEN-LAST:event_jlblViewStudentMouseExited

    private void jlblInformationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInformationMouseEntered
        jlblInformation.setSize(jlblInformation.getWidth() + 5, jlblInformation.getHeight() + 5);
    }//GEN-LAST:event_jlblInformationMouseEntered

    private void jlblInformationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblInformationMouseExited
        jlblInformation.setSize(jlblInformation.getWidth() - 5, jlblInformation.getHeight() - 5);
    }//GEN-LAST:event_jlblInformationMouseExited

    private void jlblClassListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblClassListMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblClassListMouseEntered

    private void jlblClassListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblClassListMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblClassListMouseExited

    private void jlblClassListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblClassListMousePressed
        // New window to view subject information
        SchoolManagement management = new SchoolManagement();   
        management.classList = new jfrmClassList();
        management.classList.setLocationRelativeTo(null);
        management.classList.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblClassListMousePressed

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
            java.util.logging.Logger.getLogger(jfrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmAdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmAdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblAddStudent;
    private javax.swing.JLabel jlblAddTeacher;
    private javax.swing.JLabel jlblClassList;
    private javax.swing.JLabel jlblInformation;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblViewStudent;
    private javax.swing.JLabel jlblViewTeacher;
    private javax.swing.JPanel jpnlBackground;
    // End of variables declaration//GEN-END:variables
}
