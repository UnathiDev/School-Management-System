/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import asqlconnect.SQLConnect;
import java.sql.*;
import java.awt.Color;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import schoolmanagement.SchoolManagement;
import skyeuserteacher.jfrmTeacherMenu;

public class jfrmSkyeTeacherPanel extends javax.swing.JFrame {

    public jfrmSkyeTeacherPanel() {
        initComponents();
        changeComponentsStatus(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlBackground = new javax.swing.JPanel();
        jlblReturn = new javax.swing.JLabel();
        jspComponents = new javax.swing.JScrollPane();
        jpnlComponents = new javax.swing.JPanel();
        jlblFirstName = new javax.swing.JLabel();
        jlblPersonalDetails = new javax.swing.JLabel();
        jtxfFirstName = new javax.swing.JTextField();
        jsepFirstName = new javax.swing.JSeparator();
        jlblLastName = new javax.swing.JLabel();
        jtxfLastName = new javax.swing.JTextField();
        jsepLastName = new javax.swing.JSeparator();
        jlblIDNumber = new javax.swing.JLabel();
        jsepIDNumber = new javax.swing.JSeparator();
        jfxtfIDNumber = new javax.swing.JFormattedTextField();
        jlblHomeAddress = new javax.swing.JLabel();
        jspAddress = new javax.swing.JScrollPane();
        jtxaAddress = new javax.swing.JTextArea();
        jsepAddress = new javax.swing.JSeparator();
        jsepPhoneNumber = new javax.swing.JSeparator();
        jfxtfPhoneNumber = new javax.swing.JFormattedTextField();
        jlblPhoneNumber = new javax.swing.JLabel();
        jlblationality = new javax.swing.JLabel();
        jsepNationality = new javax.swing.JSeparator();
        jcomboNationality = new javax.swing.JComboBox<>();
        jlblGender = new javax.swing.JLabel();
        jlblAdminDetails = new javax.swing.JLabel();
        jlblFGrade = new javax.swing.JLabel();
        jcbxAdmin = new javax.swing.JCheckBox();
        jcbxFormTeacher = new javax.swing.JCheckBox();
        jcbxIntegral = new javax.swing.JCheckBox();
        jlblAddress = new javax.swing.JLabel();
        jtxfSkyeAddress = new javax.swing.JTextField();
        jsepSkyeAddress = new javax.swing.JSeparator();
        jlblForum = new javax.swing.JLabel();
        jlblSubjects = new javax.swing.JLabel();
        jlblTeacherType = new javax.swing.JLabel();
        jlblFClass = new javax.swing.JLabel();
        jcomboFGrade = new javax.swing.JComboBox<>();
        jcomboFClass = new javax.swing.JComboBox<>();
        jlblSGrade = new javax.swing.JLabel();
        jcomboSGrade = new javax.swing.JComboBox<>();
        jlblSSubject = new javax.swing.JLabel();
        jcomboGender = new javax.swing.JComboBox<>();
        jlblAdminDetails1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblAccountHolderName = new javax.swing.JLabel();
        jtxfAccountHolderName = new javax.swing.JTextField();
        jlblBank = new javax.swing.JLabel();
        jtxfAccountNumber = new javax.swing.JTextField();
        jsepSkyeAddress1 = new javax.swing.JSeparator();
        jsepSkyeAddress2 = new javax.swing.JSeparator();
        jlblAccountNumber = new javax.swing.JLabel();
        jcomboBankName = new javax.swing.JComboBox<>();
        jtxfBranchCode = new javax.swing.JTextField();
        jsepSkyeAddress3 = new javax.swing.JSeparator();
        jlblBranchCode = new javax.swing.JLabel();
        jtxfAssignedSubject = new javax.swing.JTextField();
        jsepSkyeAddress4 = new javax.swing.JSeparator();
        jlblRegister = new javax.swing.JLabel();
        jlblDelete = new javax.swing.JLabel();
        jlblSubmit = new javax.swing.JLabel();
        jlblFirstName1 = new javax.swing.JLabel();
        jlblFirstName2 = new javax.swing.JLabel();
        jtxfSearch = new javax.swing.JTextField();
        jlblSearch = new javax.swing.JLabel();
        jlblUpdate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlBackground.setBackground(new java.awt.Color(102, 102, 255));

        jlblReturn.setBackground(new java.awt.Color(255, 255, 255));
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

        jpnlComponents.setBackground(new java.awt.Color(255, 255, 255));

        jlblFirstName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFirstName.setForeground(new java.awt.Color(69, 69, 248));
        jlblFirstName.setText("First Name");

        jlblPersonalDetails.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblPersonalDetails.setForeground(new java.awt.Color(69, 69, 248));
        jlblPersonalDetails.setText("SECTION 1: Personal Details");

        jtxfFirstName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfFirstName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfFirstName.setText("FirstName");
        jtxfFirstName.setToolTipText("username");
        jtxfFirstName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfFirstName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfFirstNameMouseExited(evt);
            }
        });

        jsepFirstName.setForeground(new java.awt.Color(102, 102, 255));

        jlblLastName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblLastName.setForeground(new java.awt.Color(69, 69, 248));
        jlblLastName.setText("Last Name");

        jtxfLastName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfLastName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfLastName.setText("LastName");
        jtxfLastName.setToolTipText("username");
        jtxfLastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfLastName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfLastNameMouseExited(evt);
            }
        });

        jsepLastName.setForeground(new java.awt.Color(102, 102, 255));

        jlblIDNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblIDNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblIDNumber.setText("ID Number");

        jsepIDNumber.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfIDNumber.setBorder(null);
        try {
            jfxtfIDNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####-#-#-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfIDNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfIDNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jfxtfIDNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfIDNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfIDNumberMouseExited(evt);
            }
        });

        jlblHomeAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblHomeAddress.setForeground(new java.awt.Color(69, 69, 248));
        jlblHomeAddress.setText("Home Address");

        jtxaAddress.setColumns(20);
        jtxaAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxaAddress.setRows(5);
        jtxaAddress.setToolTipText("");
        jtxaAddress.setWrapStyleWord(true);
        jtxaAddress.setBorder(null);
        jtxaAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxaAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxaAddressMouseExited(evt);
            }
        });
        jspAddress.setViewportView(jtxaAddress);

        jsepAddress.setForeground(new java.awt.Color(102, 102, 255));

        jsepPhoneNumber.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfPhoneNumber.setBorder(null);
        try {
            jfxtfPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+27-##-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfPhoneNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jfxtfPhoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfPhoneNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfPhoneNumberMouseExited(evt);
            }
        });

        jlblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblPhoneNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblPhoneNumber.setText("Phone Number");

        jlblationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblationality.setForeground(new java.awt.Color(69, 69, 248));
        jlblationality.setText("Nationality");

        jsepNationality.setForeground(new java.awt.Color(102, 102, 255));

        jcomboNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde (Cape Verde)", "Cameroon", "Central African Republic", "Chad", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Côte d'Ivoire (Ivory Coast)", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini (Swaziland)", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "São Tomé and Príncipe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe" }));
        jcomboNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboNationalityActionPerformed(evt);
            }
        });

        jlblGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblGender.setForeground(new java.awt.Color(69, 69, 248));
        jlblGender.setText("Gender");

        jlblAdminDetails.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblAdminDetails.setForeground(new java.awt.Color(69, 69, 248));
        jlblAdminDetails.setText("SECTION 2: Administrative Details");

        jlblFGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFGrade.setForeground(new java.awt.Color(69, 69, 248));
        jlblFGrade.setText("Assigned grade");

        jcbxAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jcbxAdmin.setText("Admin");
        jcbxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxAdminActionPerformed(evt);
            }
        });

        jcbxFormTeacher.setBackground(new java.awt.Color(255, 255, 255));
        jcbxFormTeacher.setText("Form Teacher");
        jcbxFormTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxFormTeacherActionPerformed(evt);
            }
        });

        jcbxIntegral.setBackground(new java.awt.Color(255, 255, 255));
        jcbxIntegral.setText("Integral");
        jcbxIntegral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxIntegralActionPerformed(evt);
            }
        });

        jlblAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAddress.setForeground(new java.awt.Color(69, 69, 248));
        jlblAddress.setText("Skye Address");

        jtxfSkyeAddress.setEditable(false);
        jtxfSkyeAddress.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSkyeAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfSkyeAddress.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfSkyeAddress.setToolTipText("skye email address");
        jtxfSkyeAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfSkyeAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfSkyeAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfSkyeAddressActionPerformed(evt);
            }
        });

        jsepSkyeAddress.setForeground(new java.awt.Color(102, 102, 255));

        jlblForum.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblForum.setForeground(new java.awt.Color(69, 69, 248));
        jlblForum.setText("SECTION 2.1 A: Forum Details");

        jlblSubjects.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblSubjects.setForeground(new java.awt.Color(69, 69, 248));
        jlblSubjects.setText("SECTION 2.1 B: Subject Details");

        jlblTeacherType.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblTeacherType.setForeground(new java.awt.Color(69, 69, 248));
        jlblTeacherType.setText("Teacher Type");

        jlblFClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFClass.setForeground(new java.awt.Color(69, 69, 248));
        jlblFClass.setText("Assigned class");

        jcomboFGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboFGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12" }));

        jcomboFClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboFClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3" }));

        jlblSGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSGrade.setForeground(new java.awt.Color(69, 69, 248));
        jlblSGrade.setText("Assigned grade");

        jcomboSGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboSGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12" }));

        jlblSSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSSubject.setForeground(new java.awt.Color(69, 69, 248));
        jlblSSubject.setText("Assigned subject");

        jcomboGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcomboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboGenderActionPerformed(evt);
            }
        });

        jlblAdminDetails1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblAdminDetails1.setForeground(new java.awt.Color(69, 69, 248));
        jlblAdminDetails1.setText("SECTION 3: Financial Details");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlblAccountHolderName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAccountHolderName.setForeground(new java.awt.Color(69, 69, 248));
        jlblAccountHolderName.setText("Account Holder Name");

        jtxfAccountHolderName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfAccountHolderName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfAccountHolderName.setToolTipText("username");
        jtxfAccountHolderName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfAccountHolderName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfAccountHolderName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfAccountHolderNameMouseExited(evt);
            }
        });
        jtxfAccountHolderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfAccountHolderNameActionPerformed(evt);
            }
        });

        jlblBank.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBank.setForeground(new java.awt.Color(69, 69, 248));
        jlblBank.setText("Bank Name");

        jtxfAccountNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfAccountNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfAccountNumber.setText(" ");
        jtxfAccountNumber.setToolTipText("username");
        jtxfAccountNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfAccountNumber.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfAccountNumberMouseExited(evt);
            }
        });

        jsepSkyeAddress1.setForeground(new java.awt.Color(102, 102, 255));

        jsepSkyeAddress2.setForeground(new java.awt.Color(102, 102, 255));

        jlblAccountNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAccountNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblAccountNumber.setText("Account Number");

        jcomboBankName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboBankName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Absa Bank", "Capitec Bank", "First National Bank", "Investec Bank", "Nedbank", "Standard Bank" }));
        jcomboBankName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboBankNameItemStateChanged(evt);
            }
        });
        jcomboBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboBankNameActionPerformed(evt);
            }
        });

        jtxfBranchCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfBranchCode.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfBranchCode.setToolTipText("username");
        jtxfBranchCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfBranchCode.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfBranchCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfBranchCodeMouseExited(evt);
            }
        });

        jsepSkyeAddress3.setForeground(new java.awt.Color(102, 102, 255));

        jlblBranchCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBranchCode.setForeground(new java.awt.Color(69, 69, 248));
        jlblBranchCode.setText("Branch Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jsepSkyeAddress2)
                        .addComponent(jsepSkyeAddress1)
                        .addComponent(jtxfAccountHolderName)
                        .addComponent(jlblAccountHolderName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxfAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addComponent(jlblAccountNumber))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblBank)
                            .addComponent(jlblBranchCode)
                            .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfBranchCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsepSkyeAddress3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAccountHolderName)
                    .addComponent(jlblBank))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepSkyeAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAccountNumber)
                    .addComponent(jlblBranchCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepSkyeAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxfBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepSkyeAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtxfAssignedSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jtxfAssignedSubject.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfAssignedSubject.setToolTipText("username");
        jtxfAssignedSubject.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfAssignedSubject.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfAssignedSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfAssignedSubjectMouseExited(evt);
            }
        });
        jtxfAssignedSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfAssignedSubjectActionPerformed(evt);
            }
        });

        jsepSkyeAddress4.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jpnlComponentsLayout = new javax.swing.GroupLayout(jpnlComponents);
        jpnlComponents.setLayout(jpnlComponentsLayout);
        jpnlComponentsLayout.setHorizontalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcomboGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPersonalDetails, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblGender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblAdminDetails, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jcbxFormTeacher)
                        .addGap(18, 18, 18)
                        .addComponent(jcbxAdmin))
                    .addComponent(jcbxIntegral, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPhoneNumber)
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jsepNationality, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcomboNationality, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jsepPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jfxtfPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlblFirstName)
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jsepFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxfFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                                        .addComponent(jlblationality)
                                        .addComponent(jlblTeacherType)))
                                .addGap(18, 18, 18)
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblLastName)
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jsepLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxfLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jsepSkyeAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxfSkyeAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlblAddress, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(18, 18, 18)
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlblIDNumber)
                            .addComponent(jsepIDNumber)
                            .addComponent(jfxtfIDNumber)
                            .addComponent(jsepAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblHomeAddress)
                            .addComponent(jspAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jlblForum)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlblFClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblFGrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcomboFClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(269, 269, 269))
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jcomboFGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblSubjects)
                            .addComponent(jlblSSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcomboSGrade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlblSGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jsepSkyeAddress4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxfAssignedSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                    .addComponent(jlblAdminDetails1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpnlComponentsLayout.setVerticalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfxtfIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblPersonalDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblIDNumber)
                        .addGap(47, 47, 47)
                        .addComponent(jsepIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblHomeAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jspAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jlblPhoneNumber)
                                .addGap(47, 47, 47)
                                .addComponent(jsepPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jfxtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblationality)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jlblAdminDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAddress)
                    .addComponent(jlblTeacherType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbxAdmin)
                            .addComponent(jcbxFormTeacher))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbxIntegral))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jtxfSkyeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepSkyeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblForum)
                    .addComponent(jlblSubjects))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblSGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboSGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfAssignedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblFGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboFGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblFClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboFClass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepSkyeAddress4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jlblAdminDetails1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jspComponents.setViewportView(jpnlComponents);

        jlblRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlblRegister.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegister.setText("View/ Modify/ Remove educator");

        jlblDelete.setBackground(new java.awt.Color(255, 255, 255));
        jlblDelete.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblDelete.setForeground(new java.awt.Color(255, 255, 255));
        jlblDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDelete.setText("Delete Record");
        jlblDelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblDeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblDeleteMousePressed(evt);
            }
        });

        jlblSubmit.setBackground(new java.awt.Color(255, 255, 255));
        jlblSubmit.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jlblSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSubmit.setText("Submit Changes");
        jlblSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblSubmitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblSubmitMousePressed(evt);
            }
        });

        jlblFirstName1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        jlblFirstName1.setText("Search by name or");

        jlblFirstName2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFirstName2.setForeground(new java.awt.Color(255, 255, 255));
        jlblFirstName2.setText("Skye address");

        jtxfSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfSearch.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfSearch.setToolTipText("search");
        jtxfSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfSearchMouseExited(evt);
            }
        });
        jtxfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfSearchActionPerformed(evt);
            }
        });

        jlblSearch.setBackground(new java.awt.Color(255, 255, 255));
        jlblSearch.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSearch.setForeground(new java.awt.Color(255, 255, 255));
        jlblSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSearch.setText("Search");
        jlblSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblSearchMousePressed(evt);
            }
        });

        jlblUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jlblUpdate.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jlblUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUpdate.setText("Update Record");
        jlblUpdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblUpdateMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnlBackgroundLayout = new javax.swing.GroupLayout(jpnlBackground);
        jpnlBackground.setLayout(jpnlBackgroundLayout);
        jpnlBackgroundLayout.setHorizontalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jspComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblFirstName1)
                                    .addComponent(jlblFirstName2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtxfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jlblSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jlblRegister)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnlBackgroundLayout.setVerticalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jlblFirstName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblFirstName2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(jlblSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspComponents, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblReturnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMousePressed
        //Returns to admin menu
        SchoolManagement management = new SchoolManagement();
        management.adminMenu = new jfrmAdminMenu();
        management.adminMenu.setLocationRelativeTo(null);
        management.adminMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jlblReturnMousePressed

    private void jtxfFirstNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfFirstNameMouseExited
        if (jtxfFirstName.getText().equals("")) {
            jsepFirstName.setForeground(new Color(255, 0, 0));
        }else{
            jsepFirstName.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jtxfFirstNameMouseExited

    private void jtxfLastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfLastNameMouseExited
        if (jtxfLastName.getText().equals("")) {
            jsepLastName.setForeground(new Color(255, 0, 0));
        }else{
            jsepLastName.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jtxfLastNameMouseExited

    private void jfxtfIDNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfIDNumberMouseExited
        if (jfxtfPhoneNumber.getText().equals("")) {
            jsepIDNumber.setForeground(new Color(255, 0, 0));
        }else{
            jsepIDNumber.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jfxtfIDNumberMouseExited

    private void jtxaAddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxaAddressMouseExited
        if (jtxaAddress.getText().equals("")) {
            jsepAddress.setForeground(new Color(255, 0, 0));
        }else{
            jsepAddress.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jtxaAddressMouseExited

    private void jfxtfPhoneNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfPhoneNumberMouseExited
        if (jfxtfPhoneNumber.getText().equals("")) {
            jsepPhoneNumber.setForeground(new Color(255, 0, 0));
        }else{
            jsepPhoneNumber.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jfxtfPhoneNumberMouseExited

    private void jcomboNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboNationalityActionPerformed

    private void jcbxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxAdminActionPerformed
        jcbxIntegral.setSelected(false);
        jcbxFormTeacher.setSelected(false);

        jlblForum.setEnabled(false);
        jlblFGrade.setEnabled(false);
        jlblFClass.setEnabled(false);
        jcomboFGrade.setEnabled(false);
        jcomboFClass.setEnabled(false);

        jlblSubjects.setEnabled(true);
        jlblSGrade.setEnabled(true);
        jlblSSubject.setEnabled(true);
        jcomboSGrade.setEnabled(true);
        jtxfAssignedSubject.setEnabled(true);

        if (jcbxIntegral.isSelected()) {
            jcbxIntegral.setSelected(false);
            jcbxFormTeacher.setSelected(false);
        }
        if(jcbxAdmin.isSelected() && jcbxIntegral.isSelected()){
            jcbxIntegral.setSelected(true);
            jcbxFormTeacher.setSelected(false);
            jcbxAdmin.setSelected(false);
        }
    }//GEN-LAST:event_jcbxAdminActionPerformed

    private void jcbxFormTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxFormTeacherActionPerformed
        jcbxIntegral.setSelected(false);
        jcbxAdmin.setSelected(false);

        jlblSubjects.setEnabled(false);
        jlblSGrade.setEnabled(false);
        jlblSSubject.setEnabled(false);
        jcomboSGrade.setEnabled(false);
        jtxfAssignedSubject.setEnabled(true);

        jlblForum.setEnabled(true);
        jlblFGrade.setEnabled(true);
        jlblFClass.setEnabled(true);
        jcomboFGrade.setEnabled(true);
        jcomboFClass.setEnabled(true);

        if (jcbxIntegral.isSelected()) {
            jcbxIntegral.setSelected(false);
            jcbxAdmin.setSelected(false);
        }
        if(jcbxAdmin.isSelected() && jcbxIntegral.isSelected()){
            jcbxIntegral.setSelected(true);
            jcbxFormTeacher.setSelected(false);
            jcbxAdmin.setSelected(false);
        }
    }//GEN-LAST:event_jcbxFormTeacherActionPerformed

    private void jcbxIntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxIntegralActionPerformed
        jcbxFormTeacher.setSelected(false);
        jcbxAdmin.setSelected(false);

        jlblSubjects.setEnabled(true);
        jlblSGrade.setEnabled(true);
        jlblSSubject.setEnabled(true);
        jcomboSGrade.setEnabled(true);
        jtxfAssignedSubject.setEnabled(true);

        jlblForum.setEnabled(true);
        jlblFGrade.setEnabled(true);
        jlblFClass.setEnabled(true);
        jcomboFGrade.setEnabled(true);
        jcomboFClass.setEnabled(true);

        jcbxFormTeacher.setSelected(false);
        jcbxAdmin.setSelected(false);
    }//GEN-LAST:event_jcbxIntegralActionPerformed

    private void jtxfSkyeAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSkyeAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSkyeAddressActionPerformed

    private void jlblDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblDeleteMousePressed
        // REMOVES AND EDUCATOR FROM THE SYSTEM
        String searchStr = jtxfSearch.getText(), addressStr = jtxfSkyeAddress.getText(), deleteQuery, deleteQueryForm, deleteQueryAccount, deleteQueryEducator;
        deleteQuery = "DELETE FROM tblAdmin WHERE Username = '" + addressStr + "'";
        deleteQueryForm = "DELETE FROM tblForm WHERE SchoolAddress = '" + addressStr + "'";
        deleteQueryAccount = "DELETE FROM tblEducatorAccount WHERE EducatorAddress = '" + addressStr + "'";
        deleteQueryEducator = "DELETE FROM tblEducator WHERE SchoolAddress = '" + addressStr + "'";
        
        if (searchStr.equals("") || addressStr.equals("")) {
            JOptionPane.showMessageDialog(null, "Mising identifier.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            //Database connection
            try {
                // Establish connection
                Connection connect = SQLConnect.connect();
                PreparedStatement adminStatement = connect.prepareStatement(deleteQuery);
                PreparedStatement formsStatement = connect.prepareStatement(deleteQueryForm);
                PreparedStatement accountStatement = connect.prepareStatement(deleteQueryAccount);
                PreparedStatement educatorStatement = connect.prepareStatement(deleteQueryEducator);
                
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you would like\nto proceed", "This action cannot be undone", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    int adminRow = adminStatement.executeUpdate(); 
                    int formsRow = formsStatement.executeUpdate(); 
                    int accountRow = accountStatement.executeUpdate();
                    int educatorRow = educatorStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Educator ("+ addressStr +") has been removed.", "Deletion successfull", JOptionPane.INFORMATION_MESSAGE);
                } else {
                }

                connect.close();

            } catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Failure to connect to the database.\nPlease try again later", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
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
        }
    }//GEN-LAST:event_jlblDeleteMousePressed

    private void jlblSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMousePressed
        String firstName, lastName, IDNumber, address, phoneNumber, gender, nationality, type = "", skyeAddress, assignedClass = "", subject = "", accountHolderName, accountNumber, bankName, branchCode;
        boolean administrativePrivileges = false, formTeacher = false;
        int assignedGrade = 0, assignedFormGrade = 0, assignedTeachGrade = 0;

        String queryAdmin, queryEducator, queryForm;

        firstName = jtxfFirstName.getText();
        lastName = jtxfLastName.getText();
        IDNumber = jfxtfIDNumber.getText();
        address = jtxaAddress.getText();
        phoneNumber = jfxtfPhoneNumber.getText();

        gender = (String) jcomboGender.getSelectedItem();
        nationality = (String) jcomboNationality.getSelectedItem();

        if (jcbxFormTeacher.isSelected()) {
            //No login rigths
            type = "T"; //Teaches and has a register class, no admin
            formTeacher = true;

            String strGrade = (String) jcomboFGrade.getSelectedItem();
            assignedFormGrade = Integer.parseInt(strGrade);
            assignedClass = (String) jcomboFClass.getSelectedItem();
        } else if (jcbxAdmin.isSelected()) {
            //Given login rights
            type = "A"; //Teaches, no register class, admin
            administrativePrivileges = true;

            subject = jtxfAssignedSubject.getText();
            String strGradeTeach = (String) jcomboSGrade.getSelectedItem();
            assignedTeachGrade = Integer.parseInt(strGradeTeach);
        } else if (jcbxIntegral.isSelected()) {
            //Given login rights
            type = "I"; //Handles everything at once
            formTeacher = true;
            administrativePrivileges = true;

            String strGrade = (String) jcomboFGrade.getSelectedItem();
            assignedFormGrade = Integer.parseInt(strGrade);
            assignedClass = (String) jcomboFClass.getSelectedItem();

            subject = jtxfAssignedSubject.getText();
            String strGradeTeach = (String) jcomboSGrade.getSelectedItem();
            assignedTeachGrade = Integer.parseInt(strGradeTeach);
        }

        skyeAddress = jtxfSkyeAddress.getText();
        
        accountHolderName = jtxfAccountHolderName.getText();
        accountNumber = jtxfAccountNumber.getText();
        bankName = (String) jcomboBankName.getSelectedItem();
        branchCode = jtxfBranchCode.getText();
        

        if (firstName.equals("")) {
            jsepFirstName.setForeground(new Color(255, 0, 0));
        }

        if (lastName.equals("")) {
            jsepLastName.setForeground(new Color(255, 0, 0));
        }

        if (IDNumber.equals("")) {
            jsepIDNumber.setForeground(new Color(255, 0, 0));
        }

        if (address.equals("")) {
            jsepAddress.setForeground(new Color(255, 0, 0));
        }

        if (phoneNumber.equals("")) {
            jsepPhoneNumber.setForeground(new Color(255, 0, 0));
        }

        if (nationality.equals("")) {
            jsepNationality.setForeground(new Color(255, 0, 0));
        }

        if (firstName.equals("") || lastName.equals("") || IDNumber.equals("") || address.equals("") || phoneNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing fields.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            //Database connection
            try {
                // Establish connection
                Connection connect = SQLConnect.connect();
                PreparedStatement educatorStatement = connect.prepareStatement
        ("UPDATE tblEducator SET FirstName = '" + firstName + "', LastName = '" + lastName + "', "
                + "HomeAddress = '" + address + "', PhoneNumber = '" + phoneNumber + "', "
                + "Nationality = '" + nationality + "', Admin = " + administrativePrivileges 
                + ", FormTeacher = " + formTeacher + ", AccessLevel = '" + type + "' WHERE SchoolAddress = '" +skyeAddress+ "'");
                
                PreparedStatement accountStatement = connect.prepareStatement
        ("UPDATE tblEducatorAccount SET AccountHolderName = '" + accountHolderName + "'," + "AccountNumber = '" + accountNumber + "', BankName = '" + bankName + "', BranchCode = '" + branchCode + "' WHERE EducatorAddress = '" +skyeAddress+ "'");
                
                PreparedStatement formStatement = connect.prepareStatement
        ("UPDATE tblForm SET Grade = " + assignedFormGrade + ", Class = '" + assignedClass + "' WHERE SchoolAddress = '" +skyeAddress+ "'");

                
                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you would like\nto proceed", "Confirm update", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    int updateEducator = educatorStatement.executeUpdate();
                    int updateAccount = accountStatement.executeUpdate();
                    int updateForm = formStatement.executeUpdate();
                
                    if (updateEducator > 0 && updateAccount > 0 && updateForm > 0) {
                        JOptionPane.showMessageDialog(null, "Update executed successfilly.", "Operation successfil", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Unable to update information\nPlease try again later\nor contact I.T support if this persists.", "Operation failed", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    
                }
                
                educatorStatement.close();
                connect.close();
            } catch (SQLException error) {
                JOptionPane.showMessageDialog(null, "Failure to connect to the database.\nPlease try again later", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
                    write.close();
                }catch(Exception er){
                    
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Failed to update eduator's information.\nException Occured", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
                    write.close();
                }catch(Exception er){
                    
                }
            }
        }
    }//GEN-LAST:event_jlblSubmitMousePressed

    private void jtxfSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSearchMouseExited

    private void jtxfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSearchActionPerformed

    private void jlblSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSearchMousePressed
        String searchStr = jtxfSearch.getText(), querySearch, queryDenied, queryForm, queryAccount, querySubject;
        String firstName, lastName, IDNumber, homeAddress, phoneNumber, gender, nationality, schoolAddress, accessLevel;
        String accountHolderName, accountNumber, bankName, branchCode;
        String subjectCode, subjectName = "", formClass;
       
        int formGrade, subGrade = 0;
        boolean admin, formTeacher, denied;
        
        if (searchStr.equals("")) {
            JOptionPane.showMessageDialog(null, "Provide the name or\neducator addresss.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection connect = SQLConnect.connect();
                querySearch = "SELECT * FROM tblEducator WHERE tblEducator.SchoolAddress = '" + searchStr + "' OR tblEducator.FirstName LIKE '%" + (searchStr.substring(0,1).toUpperCase() +searchStr.substring(1)) + "%'";
                PreparedStatement statement = connect.prepareStatement(querySearch);
                ResultSet set = statement.executeQuery();

                if (set.next()) {
                    firstName = set.getString("FirstName");
                    lastName = set.getString("LastName");
                    IDNumber = set.getString("IDNumber");
                    homeAddress = set.getString("HomeAddress");
                    phoneNumber = set.getString("PhoneNumber");
                    gender = set.getString("Gender");
                    nationality = set.getString("Nationality");
                    schoolAddress = set.getString("SchoolAddress");
                    admin = set.getBoolean("Admin");
                    formTeacher = set.getBoolean("FormTeacher");
                    accessLevel = set.getString("AccessLevel");
                    
                   querySubject = "SELECT * FROM tblSubject WHERE EducatorID = '" + schoolAddress + "'";
                   PreparedStatement statementSubject = connect.prepareStatement(querySubject);
                   ResultSet setSubject = statementSubject.executeQuery();
                   
                    if (setSubject.next()) {
                        subjectCode = setSubject.getString("SubjectCode");
                        subjectName = setSubject.getString("SubjectName");
                        jtxfAssignedSubject.setText(subjectName);
                        
                        subGrade = setSubject.getInt("SubjectGrade");
                        jcomboSGrade.setSelectedItem(subGrade);
                    }
                    
                    queryDenied = "SELECT Denied FROM tblAdmin WHERE Username = '" + schoolAddress + "'";
                    PreparedStatement statementDenied = connect.prepareStatement(queryDenied);
                    ResultSet setDenied = statementDenied.executeQuery();
                    
                    if (setDenied.next()) {
                        denied = setDenied.getBoolean("Denied");
                    }
                    
                    queryAccount = "SELECT * FROM tblEducatorAccount WHERE EducatorAddress = '" + schoolAddress + "'";
                    PreparedStatement statementAccount = connect.prepareStatement(queryAccount);
                    ResultSet setAccount = statementAccount.executeQuery();
                    
                    if (setAccount.next()) {
                        accountHolderName = setAccount.getString("AccountHolderName");
                        jtxfAccountHolderName.setText(accountHolderName);
                        
                        accountNumber = setAccount.getString("AccountNumber");
                        jtxfAccountNumber.setText(accountNumber);
                        
                        bankName = setAccount.getString("BankName");
                        jcomboBankName.setSelectedItem(bankName);
                        
                        branchCode = setAccount.getString("BranchCode");
                        jtxfBranchCode.setText(branchCode);
                    }
                    
                    queryForm = "SELECT * FROM tblForm WHERE SchoolAddress = '" + schoolAddress + "'";
                    PreparedStatement statementForm = connect.prepareStatement(queryForm);
                    ResultSet setForm = statementForm.executeQuery();
                    
                    if (setForm.next()) {
                        formGrade = setForm.getInt("Grade");
                        
                        switch (formGrade) {
                            case 8 -> jcomboFGrade.setSelectedIndex(0);
                            case 9 -> jcomboFGrade.setSelectedIndex(1);
                            case 10 -> jcomboFGrade.setSelectedIndex(2);
                            case 11 -> jcomboFGrade.setSelectedIndex(3);
                            case 12 -> jcomboFGrade.setSelectedIndex(4);
                            default -> {
                            }
                        }
                        
                        formClass = setForm.getString("Class");
                        jcomboFClass.setSelectedItem(formClass);
                    }
                    
                    statementForm.close();
                    setForm.close();
                    
                    statementDenied.close();
                    setDenied.close();
                    
                    statementAccount.close();
                    setAccount.close();
                    
                    jtxfFirstName.setText(firstName);
                    jtxfLastName.setText(lastName);
                    jfxtfIDNumber.setValue(IDNumber);
                    jfxtfPhoneNumber.setValue(phoneNumber);
                    jcomboNationality.setSelectedItem(nationality);
                    jtxaAddress.setText(homeAddress);
                    
                    if (gender.equals("M")) {
                        jcomboGender.setSelectedItem("Male");
                    } else {
                        jcomboGender.setSelectedItem("Female");
                    }
                    
                    jtxfSkyeAddress.setText(schoolAddress);
                    
                    if (accessLevel.equals("T")) {
                        jlblForum.setEnabled(true);
                        jlblFGrade.setEnabled(true);
                        jlblFClass.setEnabled(true);
                        jcomboFGrade.setEnabled(true);
                        jcomboFClass.setEnabled(true);
                        
                        jlblSubjects.setEnabled(false);
                        jlblSGrade.setEnabled(false);
                        jlblSSubject.setEnabled(false);
                        jcomboSGrade.setEnabled(false);
                        jtxfAssignedSubject.setEnabled(false);
                        
                        jcbxFormTeacher.setSelected(true);
                        jcbxAdmin.setSelected(false);
                        jcbxIntegral.setSelected(false);
                    } else if (accessLevel.equals("A")) {
                        jlblForum.setEnabled(false);
                        jlblFGrade.setEnabled(false);
                        jlblFClass.setEnabled(false);
                        jcomboFGrade.setEnabled(false);
                        jcomboFClass.setEnabled(false);
                        
                        jlblSubjects.setEnabled(true);
                        jlblSGrade.setEnabled(true);
                        jlblSSubject.setEnabled(true);
                        jcomboSGrade.setEnabled(true);
                        jtxfAssignedSubject.setEnabled(true);
                        
                        jcbxFormTeacher.setSelected(false);
                        jcbxAdmin.setSelected(true);
                        jcbxIntegral.setSelected(false);
                    } else if (accessLevel.equals("I")) {
                        jlblSubjects.setEnabled(true);
                        jlblSGrade.setEnabled(true);
                        jlblSSubject.setEnabled(true);
                        jcomboSGrade.setEnabled(true);
                        jtxfAssignedSubject.setEnabled(true);

                        jlblForum.setEnabled(true);
                        jlblFGrade.setEnabled(true);
                        jlblFClass.setEnabled(true);
                        jcomboFGrade.setEnabled(true);
                        jcomboFClass.setEnabled(true);
                        
                        jcbxFormTeacher.setSelected(false);
                        jcbxAdmin.setSelected(false);
                        jcbxIntegral.setSelected(true);
                    }
                    changeComponentsStatus(false);
                  
                }else{
                    JOptionPane.showMessageDialog(null, "User not found.", "User not found", JOptionPane.ERROR_MESSAGE);
                }
                connect.close();
                statement.close();
                set.close();
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
        }
    }//GEN-LAST:event_jlblSearchMousePressed

    private void jcomboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboGenderActionPerformed

    private void jlblUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUpdateMousePressed
        //Confirms whether the user is an authorized user, only authorized users can update
        int confirm = JOptionPane.showConfirmDialog(null, "Are you an authorized user?\nOnly authorised users can update information", "Confirm action", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                
        if (confirm == JOptionPane.YES_OPTION) {
            changeComponentsStatus(true);
        } else {
            changeComponentsStatus(false);
        }
    }//GEN-LAST:event_jlblUpdateMousePressed

    private void jtxfAccountHolderNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfAccountHolderNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAccountHolderNameMouseExited

    private void jtxfAccountNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfAccountNumberMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAccountNumberMouseExited

    private void jcomboBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboBankNameActionPerformed

    private void jtxfBranchCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfBranchCodeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfBranchCodeMouseExited

    private void jtxfAccountHolderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfAccountHolderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAccountHolderNameActionPerformed

    private void jlblReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseEntered
        jlblReturn.setSize(jlblReturn.getWidth() + 5, jlblReturn.getHeight() + 5);
    }//GEN-LAST:event_jlblReturnMouseEntered

    private void jlblReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseExited
        jlblReturn.setSize(jlblReturn.getWidth() - 5, jlblReturn.getHeight() - 5);
    }//GEN-LAST:event_jlblReturnMouseExited

    private void jlblSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSearchMouseEntered
        jlblSearch.setSize(jlblSearch.getWidth() + 5, jlblSearch.getHeight() + 5);
    }//GEN-LAST:event_jlblSearchMouseEntered

    private void jlblSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSearchMouseExited
        jlblSearch.setSize(jlblSearch.getWidth() - 5, jlblSearch.getHeight() - 5);
    }//GEN-LAST:event_jlblSearchMouseExited

    private void jlblUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUpdateMouseEntered
        jlblUpdate.setSize(jlblUpdate.getWidth() + 5, jlblUpdate.getHeight() + 5);
    }//GEN-LAST:event_jlblUpdateMouseEntered

    private void jlblUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUpdateMouseExited
        jlblUpdate.setSize(jlblUpdate.getWidth() - 5, jlblUpdate.getHeight() - 5);
    }//GEN-LAST:event_jlblUpdateMouseExited

    private void jlblSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMouseEntered
        jlblSubmit.setSize(jlblSubmit.getWidth() + 5, jlblSubmit.getHeight() + 5);
    }//GEN-LAST:event_jlblSubmitMouseEntered

    private void jlblSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMouseExited
        jlblSubmit.setSize(jlblSubmit.getWidth() - 5, jlblSubmit.getHeight() - 5);
    }//GEN-LAST:event_jlblSubmitMouseExited

    private void jlblDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblDeleteMouseEntered
        jlblDelete.setSize(jlblDelete.getWidth() + 5, jlblDelete.getHeight() + 5);
    }//GEN-LAST:event_jlblDeleteMouseEntered

    private void jlblDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblDeleteMouseExited
        jlblDelete.setSize(jlblDelete.getWidth() - 5, jlblDelete.getHeight() - 5);
    }//GEN-LAST:event_jlblDeleteMouseExited

    private void jtxfAssignedSubjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfAssignedSubjectMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAssignedSubjectMouseExited

    private void jtxfAssignedSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfAssignedSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAssignedSubjectActionPerformed

    private void jcomboBankNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboBankNameItemStateChanged
        if (jcomboBankName.getSelectedItem() == "Absa Bank") {
            jtxfBranchCode.setText("632 005");
        } else if (jcomboBankName.getSelectedItem() == "Capitec Bank") {
            jtxfBranchCode.setText("470 010");
        } else if (jcomboBankName.getSelectedItem() == "First National Bank") {
            jtxfBranchCode.setText("250 655");
        } else if (jcomboBankName.getSelectedItem() == "Investec Bank") {
            jtxfBranchCode.setText("580 105");
        } else if (jcomboBankName.getSelectedItem() == "Nedbank") {
            jtxfBranchCode.setText("198 765");
        } else if (jcomboBankName.getSelectedItem() == "Standard Bank") {
            jtxfBranchCode.setText("051 001");
        }
    }//GEN-LAST:event_jcomboBankNameItemStateChanged

    public void changeComponentsStatus(boolean enabled){
        jtxfFirstName.setEditable(enabled);
        jtxfLastName.setEditable(enabled);
        jfxtfIDNumber.setEditable(false);
        jtxaAddress.setEditable(enabled);
        jfxtfPhoneNumber.setEditable(enabled);
        jcomboNationality.setEditable(enabled);
        jcomboGender.setEditable(false);
        //jcomboFGrade.setEditable(enabled);
        jcomboFClass.setEditable(enabled);
        jcomboSGrade.setEditable(enabled);
        jtxfAssignedSubject.setEditable(enabled);
        jtxfAccountHolderName.setEditable(enabled);
        jtxfAccountNumber.setEditable(enabled);
        jcomboBankName.setEditable(enabled);
        jtxfBranchCode.setEditable(enabled);
    }
    
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
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmSkyeTeacherPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbxAdmin;
    private javax.swing.JCheckBox jcbxFormTeacher;
    private javax.swing.JCheckBox jcbxIntegral;
    private javax.swing.JComboBox<String> jcomboBankName;
    private javax.swing.JComboBox<String> jcomboFClass;
    private javax.swing.JComboBox<String> jcomboFGrade;
    private javax.swing.JComboBox<String> jcomboGender;
    private javax.swing.JComboBox<String> jcomboNationality;
    private javax.swing.JComboBox<String> jcomboSGrade;
    private javax.swing.JFormattedTextField jfxtfIDNumber;
    private javax.swing.JFormattedTextField jfxtfPhoneNumber;
    private javax.swing.JLabel jlblAccountHolderName;
    private javax.swing.JLabel jlblAccountNumber;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblAdminDetails;
    private javax.swing.JLabel jlblAdminDetails1;
    private javax.swing.JLabel jlblBank;
    private javax.swing.JLabel jlblBranchCode;
    private javax.swing.JLabel jlblDelete;
    private javax.swing.JLabel jlblFClass;
    private javax.swing.JLabel jlblFGrade;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblFirstName1;
    private javax.swing.JLabel jlblFirstName2;
    private javax.swing.JLabel jlblForum;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHomeAddress;
    private javax.swing.JLabel jlblIDNumber;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblPersonalDetails;
    private javax.swing.JLabel jlblPhoneNumber;
    private javax.swing.JLabel jlblRegister;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSGrade;
    private javax.swing.JLabel jlblSSubject;
    private javax.swing.JLabel jlblSearch;
    private javax.swing.JLabel jlblSubjects;
    private javax.swing.JLabel jlblSubmit;
    private javax.swing.JLabel jlblTeacherType;
    private javax.swing.JLabel jlblUpdate;
    private javax.swing.JLabel jlblationality;
    private javax.swing.JPanel jpnlBackground;
    private javax.swing.JPanel jpnlComponents;
    private javax.swing.JSeparator jsepAddress;
    private javax.swing.JSeparator jsepFirstName;
    private javax.swing.JSeparator jsepIDNumber;
    private javax.swing.JSeparator jsepLastName;
    private javax.swing.JSeparator jsepNationality;
    private javax.swing.JSeparator jsepPhoneNumber;
    private javax.swing.JSeparator jsepSkyeAddress;
    private javax.swing.JSeparator jsepSkyeAddress1;
    private javax.swing.JSeparator jsepSkyeAddress2;
    private javax.swing.JSeparator jsepSkyeAddress3;
    private javax.swing.JSeparator jsepSkyeAddress4;
    private javax.swing.JScrollPane jspAddress;
    private javax.swing.JScrollPane jspComponents;
    private javax.swing.JTextArea jtxaAddress;
    private javax.swing.JTextField jtxfAccountHolderName;
    private javax.swing.JTextField jtxfAccountNumber;
    private javax.swing.JTextField jtxfAssignedSubject;
    private javax.swing.JTextField jtxfBranchCode;
    private javax.swing.JTextField jtxfFirstName;
    private javax.swing.JTextField jtxfLastName;
    private javax.swing.JTextField jtxfSearch;
    private javax.swing.JTextField jtxfSkyeAddress;
    // End of variables declaration//GEN-END:variables
}
