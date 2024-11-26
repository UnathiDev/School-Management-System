/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import asqlconnect.*;
import java.awt.Color;
import java.sql.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.JOptionPane;
import schoolmanagement.SchoolManagement;
import skyeuserteacher.jfrmTeacherMenu;

public class jfrmSkyeTeacherAdd extends javax.swing.JFrame {

    public jfrmSkyeTeacherAdd() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jrbMale = new javax.swing.JRadioButton();
        jrbFemale = new javax.swing.JRadioButton();
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
        jcomboSSubject = new javax.swing.JComboBox<>();
        jlblAdminDetails1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jlblAccountHolderName = new javax.swing.JLabel();
        jtxfAccountHolderName = new javax.swing.JTextField();
        jlblBankName = new javax.swing.JLabel();
        jsepSkyeAddress13 = new javax.swing.JSeparator();
        jsepSkyeAddress14 = new javax.swing.JSeparator();
        jlblAccountNumber = new javax.swing.JLabel();
        jcomboBankName = new javax.swing.JComboBox<>();
        jtxfBranchCode = new javax.swing.JTextField();
        jsepSkyeAddress15 = new javax.swing.JSeparator();
        jlblBranchCode = new javax.swing.JLabel();
        jfxtfAccountNumber = new javax.swing.JFormattedTextField();
        jlblRegister = new javax.swing.JLabel();
        jlblReset = new javax.swing.JLabel();
        jlblSubmit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlBackground.setBackground(new java.awt.Color(102, 102, 255));

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

        jtxfFirstName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfFirstName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfFirstName.setToolTipText("username");
        jtxfFirstName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfFirstNameMouseExited(evt);
            }
        });

        jsepFirstName.setForeground(new java.awt.Color(102, 102, 255));

        jlblLastName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblLastName.setForeground(new java.awt.Color(69, 69, 248));
        jlblLastName.setText("Last Name");

        jtxfLastName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfLastName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfLastName.setToolTipText("username");
        jtxfLastName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
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
        jtxaAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxaAddress.setLineWrap(true);
        jtxaAddress.setRows(5);
        jtxaAddress.setWrapStyleWord(true);
        jtxaAddress.setBorder(null);
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

        jlblGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblGender.setForeground(new java.awt.Color(69, 69, 248));
        jlblGender.setText("Gender");

        jrbMale.setBackground(new java.awt.Color(255, 255, 255));
        jrbMale.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jrbMale.setText("Male");
        jrbMale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrbMaleMousePressed(evt);
            }
        });

        jrbFemale.setBackground(new java.awt.Color(255, 255, 255));
        jrbFemale.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jrbFemale.setText("Female");
        jrbFemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jrbFemaleMousePressed(evt);
            }
        });

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
        jcomboSGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboSGradeItemStateChanged(evt);
            }
        });

        jlblSSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSSubject.setForeground(new java.awt.Color(69, 69, 248));
        jlblSSubject.setText("Assigned subject");

        jcomboSSubject.setEditable(true);
        jcomboSSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N

        jlblAdminDetails1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblAdminDetails1.setForeground(new java.awt.Color(69, 69, 248));
        jlblAdminDetails1.setText("SECTION 3: Financial Details");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jlblAccountHolderName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAccountHolderName.setForeground(new java.awt.Color(69, 69, 248));
        jlblAccountHolderName.setText("Account Holder Name");

        jtxfAccountHolderName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfAccountHolderName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfAccountHolderName.setToolTipText("username");
        jtxfAccountHolderName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfAccountHolderName.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jlblBankName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBankName.setForeground(new java.awt.Color(69, 69, 248));
        jlblBankName.setText("Bank Name");

        jsepSkyeAddress13.setForeground(new java.awt.Color(102, 102, 255));

        jsepSkyeAddress14.setForeground(new java.awt.Color(102, 102, 255));

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

        jtxfBranchCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfBranchCode.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfBranchCode.setText(" ");
        jtxfBranchCode.setToolTipText("username");
        jtxfBranchCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfBranchCode.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jsepSkyeAddress15.setForeground(new java.awt.Color(102, 102, 255));

        jlblBranchCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBranchCode.setForeground(new java.awt.Color(69, 69, 248));
        jlblBranchCode.setText("Branch Code");

        jfxtfAccountNumber.setBorder(null);
        try {
            jfxtfAccountNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####-#-#-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfAccountNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfAccountNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsepSkyeAddress14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsepSkyeAddress13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxfAccountHolderName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jlblAccountHolderName)
                    .addComponent(jlblAccountNumber)
                    .addComponent(jfxtfAccountNumber))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblBankName)
                            .addComponent(jlblBranchCode)
                            .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfBranchCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsepSkyeAddress15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAccountHolderName)
                    .addComponent(jlblBankName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepSkyeAddress13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAccountNumber)
                    .addComponent(jlblBranchCode))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jsepSkyeAddress14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfxtfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepSkyeAddress15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnlComponentsLayout = new javax.swing.GroupLayout(jpnlComponents);
        jpnlComponents.setLayout(jpnlComponentsLayout);
        jpnlComponentsLayout.setHorizontalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblPersonalDetails)
                            .addComponent(jrbMale)
                            .addComponent(jrbFemale)
                            .addComponent(jlblGender)
                            .addComponent(jlblAdminDetails)
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jcbxFormTeacher)
                                .addGap(18, 18, 18)
                                .addComponent(jcbxAdmin))
                            .addComponent(jcbxIntegral)
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                                .addComponent(jcomboFGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jcomboFClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(269, 269, 269)))
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlblSubjects)
                                        .addComponent(jlblSSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcomboSGrade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlblSGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jcomboSSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlblAdminDetails1))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jrbMale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbFemale)
                .addGap(32, 32, 32)
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
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblFGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboFGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblFClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboFClass))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblSGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboSGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboSSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(jlblAdminDetails1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jspComponents.setViewportView(jpnlComponents);

        jlblRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlblRegister.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegister.setText("Register a new educator");

        jlblReset.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblReset.setForeground(new java.awt.Color(255, 255, 255));
        jlblReset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblReset.setText("Reset");
        jlblReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlblReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblResetMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlblResetMousePressed(evt);
            }
        });

        jlblSubmit.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSubmit.setForeground(new java.awt.Color(255, 255, 255));
        jlblSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSubmit.setText("Submit");
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
                            .addComponent(jlblReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jlblRegister)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnlBackgroundLayout.setVerticalGroup(
            jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlblReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlBackgroundLayout.createSequentialGroup()
                        .addGroup(jpnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jspComponents, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)))
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
            .addComponent(jpnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jcomboSSubject.setEnabled(true);
        
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
        jcomboSSubject.setEnabled(false);
        
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
        jcomboSSubject.setEnabled(true);
        
        jlblForum.setEnabled(true);
        jlblFGrade.setEnabled(true);
        jlblFClass.setEnabled(true);
        jcomboFGrade.setEnabled(true);
        jcomboFClass.setEnabled(true);
    }//GEN-LAST:event_jcbxIntegralActionPerformed

    private void jlblResetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblResetMousePressed
        // RESETS ALL FIELDS TO DEFAULT VALUES
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you would like to proceed?\nAll unsaved information will be lost.", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                
        if (confirm == JOptionPane.YES_OPTION) {
            jtxfFirstName.setText("");
            jtxfLastName.setText("");
            jfxtfIDNumber.setValue(null);
            jfxtfPhoneNumber.setValue(null);
            jcomboNationality.setSelectedIndex(0);
            jtxaAddress.setText("");
            jrbMale.setSelected(false);
            jrbFemale.setSelected(false);
            jcbxFormTeacher.setSelected(false);
            jcbxAdmin.setSelected(false);
            jcbxIntegral.setSelected(false);
            jtxfSkyeAddress.setText("");
            jcomboFGrade.setSelectedIndex(0);
            jcomboFClass.setSelectedIndex(0);
            jcomboSGrade.setSelectedIndex(0);
            jcomboSSubject.setSelectedIndex(0);
        } else {
        }
    }//GEN-LAST:event_jlblResetMousePressed

    private void jlblSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMousePressed
        /**
         * PERFORMS DATA VALIDATION AND CREATES AN ENTRY INTO THE DATABASE
         * TABLES INVOLVED IN PROCESS: tblAdmin, tblEducator, tblEducatorAccount, tblForm, tblSubject
         */
        String firstName, lastName, IDNumber, address, phoneNumber, gender, nationality, type = "", 
                skyeAddress, assignedClass = "", subject = "", 
                accountHolderName, accountNumber, bankName, branchCode;
        boolean administrativePrivileges = false, formTeacher = false; 
        int assignedGrade = 0, assignedFormGrade = 0, assignedTeachGrade = 0;
        
        String queryAdmin, queryEducator, queryForm, queryForm2, queryAccount;
        
        firstName = jtxfFirstName.getText();
        lastName = jtxfLastName.getText();
        IDNumber = jfxtfIDNumber.getText();
        address = jtxaAddress.getText();
        phoneNumber = jfxtfPhoneNumber.getText();
        
        accountHolderName = jtxfAccountHolderName.getText();
        accountNumber = jfxtfAccountNumber.getText();
        bankName = (String) jcomboBankName.getSelectedItem();
        branchCode = jtxfBranchCode.getText();
        
        if (jrbMale.isSelected()) {
            gender = "M";
        } else if (jrbMale.isSelected()) {
            gender = "F";
        } else {
            gender = "";
        }
        
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
           
           subject = (String) jcomboSSubject.getSelectedItem();
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
            
            subject = (String) jcomboSSubject.getSelectedItem();
            String strGradeTeach = (String) jcomboSGrade.getSelectedItem();
            assignedTeachGrade = Integer.parseInt(strGradeTeach);
        }
        
        skyeAddress = jtxfSkyeAddress.getText();
        
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
        
        if (firstName.equals("") || lastName.equals("") || IDNumber.equals("") || address.equals("") || phoneNumber.equals("") || accountHolderName.equals("") || accountNumber.equals("") || bankName.equals("") || branchCode.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing fields.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            //Database connection
            try {
                boolean valid = true;
                // Establish connection
                Connection connect = SQLConnect.connect();
                //PreparedStatement adminStatement, formStatement, educatorStatement;
                
                String queryCheckForm = "SELECT EducatorID FROM tblSubject WHERE EducatorID = '" + skyeAddress + "'";
                PreparedStatement check = connect.prepareStatement(queryCheckForm);
                ResultSet checkSet = check.executeQuery();
                
                if(jcbxFormTeacher.isSelected() || jcbxIntegral.isSelected()){
                    if (checkSet.next()) {
                        JOptionPane.showMessageDialog(null, "There is currently no open space for\nGrade " + assignedTeachGrade + " " + subject + " teacher.", "Subject choice error", JOptionPane.ERROR);
                        valid = false;
                    } else {
                        queryForm = "UPDATE tblSubject SET EducatorID = '" + skyeAddress + "' WHERE SubjectName = '" + subject + "' AND SubjectGrade = " + assignedTeachGrade;
                        PreparedStatement formStatement = connect.prepareStatement(queryForm);
                        int rowsForm = formStatement.executeUpdate();
                        formStatement.close();
                        valid = true;
                    }
                }
                //Integral
                if (administrativePrivileges) { 
                    queryAdmin = "INSERT INTO tblADMIN VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement adminStatement = connect.prepareStatement(queryAdmin);
                    adminStatement.setString(1, skyeAddress);
                    adminStatement.setString(2, generatePassword());
                    adminStatement.setString(3, type);
                    adminStatement.setInt(4, 0);
                    adminStatement.setBoolean(5, false);
                    
                    int rowsAdmin = adminStatement.executeUpdate();
                    adminStatement.close();
                    
                    if (!(rowsAdmin > 0)) {
                        JOptionPane.showMessageDialog(null, "Failed to process admin information.\nPlease contact tech support for further assitance.", "Registration unsuccessfull", JOptionPane.ERROR);
                    }
                }
                
                

                if (!formTeacher) {    
                    assignedFormGrade = 0;
                    assignedClass = "NULL";
                }
                
                queryForm2 = "INSERT INTO tblForm VALUES (?, ?, ?)";
                PreparedStatement formStatement2 = connect.prepareStatement(queryForm2);
                formStatement2.setString(1, skyeAddress);
                formStatement2.setInt(2, assignedFormGrade);
                formStatement2.setString(3, assignedClass);

                int rowsForm2 = formStatement2.executeUpdate();
                if (!(rowsForm2 > 0)) {
                    JOptionPane.showMessageDialog(null, "Failed to process form details.\nPlease contact tech support for further assitance.", "Registration unsuccessfull", JOptionPane.ERROR);
                }
                formStatement2.close();
                
                queryEducator = "INSERT INTO tblEducator VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement educatorStatement = connect.prepareStatement(queryEducator);
                educatorStatement.setString(1, firstName);
                educatorStatement.setString(2, lastName);
                educatorStatement.setString(3, IDNumber);
                educatorStatement.setString(4, address);
                educatorStatement.setString(5, phoneNumber);
                educatorStatement.setString(6, gender);
                educatorStatement.setString(7, nationality);
                educatorStatement.setString(8, skyeAddress);
                educatorStatement.setBoolean(9, administrativePrivileges);
                educatorStatement.setBoolean(10, formTeacher);
                educatorStatement.setString(11, type);
                
                queryAccount = "INSERT INTO tblEducatorAccount VALUES (?, ?, ?, ?, ?)";
                PreparedStatement accountStatement = connect.prepareStatement(queryAccount);
                accountStatement.setString(1, skyeAddress);
                accountStatement.setString(2, accountHolderName);
                accountStatement.setString(3, accountNumber);
                accountStatement.setString(4, bankName);
                accountStatement.setString(5, branchCode);
                
                int rowsEducator = educatorStatement.executeUpdate();
                int rowsAccount = accountStatement.executeUpdate();
                
                accountStatement.close();
                educatorStatement.close();
                connect.close();
                
                if (rowsEducator > 0 && rowsAccount > 0) {
                    JOptionPane.showMessageDialog(null, "New Skye educator has been enrolled.", "Registration successfull", JOptionPane.INFORMATION_MESSAGE);
                    Thread.sleep(1000);
                
                    SchoolManagement management = new SchoolManagement();
                    management.teacherMenu = new jfrmTeacherMenu();
                    management.teacherMenu.setLocationRelativeTo(null);
                    management.teacherMenu.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to process account details.\nPlease contact tech support for further assitance.", "Registration unsuccessfull", JOptionPane.ERROR);
                }
            } catch (SQLException sqlError) {
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
        }
    }//GEN-LAST:event_jlblSubmitMousePressed

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
            jtxfSkyeAddress.setText(getSkyeEmail());
        }
    }//GEN-LAST:event_jtxfLastNameMouseExited

    private void jfxtfIDNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfIDNumberMouseExited
        if (jfxtfIDNumber.getText().equals("")) {
            jsepIDNumber.setForeground(new Color(255, 0, 0));
        }else{
            jsepIDNumber.setForeground(new Color(102,102,255));
            String check = (String) jfxtfIDNumber.getText();
            if(Character.getNumericValue(check.charAt(6 + 4)) >= 0 && Character.getNumericValue(check.charAt(6 + 4)) <= 4){//01234
                jrbFemale.setSelected(true);
                jrbMale.setSelected(false);
            } else if(Character.getNumericValue(check.charAt(6 + 4)) >= 5 && Character.getNumericValue(check.charAt(6 + 4)) <= 9){//56789
                jrbFemale.setSelected(false);
                jrbMale.setSelected(true);
            }
            jrbMale.setEnabled(false);
            jrbFemale.setEnabled(false);
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

    private void jrbMaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbMaleMousePressed
        jrbFemale.setSelected(false);
    }//GEN-LAST:event_jrbMaleMousePressed

    private void jrbFemaleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFemaleMousePressed
        jrbMale.setSelected(false);
    }//GEN-LAST:event_jrbFemaleMousePressed

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

    private void jcomboSGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboSGradeItemStateChanged
        int index = jcomboSGrade.getSelectedIndex();
        String fileName = "", subject = "";
        
        if (index == 0 || index == 1) {
            fileName = "skye-subjects-junior.txt";
        }else if (index == 2 || index == 3 || index == 4){
            fileName = "skye-subjects-senior.txt";
        }
        
        try {
            Scanner scan = new Scanner(new File(fileName));
            while (scan.hasNextLine()) {
                subject = scan.nextLine();
                jcomboSSubject.addItem(subject);
            }
            scan.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to retrieve Grade " + (index + 8) + " at the current moment.\nPlease try again later.", "Operation Failed", JOptionPane.ERROR);
        }
        ///MAKE CHANGES
    }//GEN-LAST:event_jcomboSGradeItemStateChanged

    private void jlblReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseEntered
        jlblReturn.setSize(jlblReturn.getWidth() + 5, jlblReturn.getHeight() + 5);
    }//GEN-LAST:event_jlblReturnMouseEntered

    private void jlblReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblReturnMouseExited
        jlblReturn.setSize(jlblReturn.getWidth() - 5, jlblReturn.getHeight() - 5);
    }//GEN-LAST:event_jlblReturnMouseExited

    private void jlblResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblResetMouseEntered
        jlblReset.setSize(jlblReset.getWidth() + 5, jlblReset.getHeight() + 5);
    }//GEN-LAST:event_jlblResetMouseEntered

    private void jlblResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblResetMouseExited
        jlblReset.setSize(jlblReset.getWidth() - 5, jlblReset.getHeight() - 5);
    }//GEN-LAST:event_jlblResetMouseExited

    private void jlblSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMouseEntered
        jlblSubmit.setSize(jlblSubmit.getWidth() + 5, jlblSubmit.getHeight() + 5);
    }//GEN-LAST:event_jlblSubmitMouseEntered

    private void jlblSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMouseExited
        jlblSubmit.setSize(jlblSubmit.getWidth() - 5, jlblSubmit.getHeight() - 5);
    }//GEN-LAST:event_jlblSubmitMouseExited

    String getSkyeEmail(){
        String surnameSub = "";
        
        if (jtxfLastName.getText().length() > 5) {
            surnameSub = jtxfLastName.getText().substring(0,5);
        }else{
            surnameSub = jtxfLastName.getText();
        }
        return surnameSub.toUpperCase() + "-" + jtxfFirstName.getText().toUpperCase().charAt(0) + "@skye.edu.za";
    }
    
    String generatePassword(){
        return jtxfFirstName.getText().toLowerCase() + "skye";
    }
    
    String encryptedPassword(){
        StringBuilder cipher = new StringBuilder();
        String temp = jtxfLastName.getText();
        for (int index = 0; index < temp.length(); index++) {
            char ca = temp.charAt(index);
            
            if (Character.isLetter(ca)) {
                char base = Character.isUpperCase(ca) ? 'A':'a';
                cipher.append(ca);
            } else {
                cipher.append(ca);
            }
        }
        return String.valueOf(cipher);
    }
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
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeTeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmSkyeTeacherAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox jcbxAdmin;
    private javax.swing.JCheckBox jcbxFormTeacher;
    private javax.swing.JCheckBox jcbxIntegral;
    private javax.swing.JComboBox<String> jcomboBankName;
    private javax.swing.JComboBox<String> jcomboFClass;
    private javax.swing.JComboBox<String> jcomboFGrade;
    private javax.swing.JComboBox<String> jcomboNationality;
    private javax.swing.JComboBox<String> jcomboSGrade;
    private javax.swing.JComboBox<String> jcomboSSubject;
    private javax.swing.JFormattedTextField jfxtfAccountNumber;
    private javax.swing.JFormattedTextField jfxtfIDNumber;
    private javax.swing.JFormattedTextField jfxtfPhoneNumber;
    private javax.swing.JLabel jlblAccountHolderName;
    private javax.swing.JLabel jlblAccountNumber;
    private javax.swing.JLabel jlblAddress;
    private javax.swing.JLabel jlblAdminDetails;
    private javax.swing.JLabel jlblAdminDetails1;
    private javax.swing.JLabel jlblBankName;
    private javax.swing.JLabel jlblBranchCode;
    private javax.swing.JLabel jlblFClass;
    private javax.swing.JLabel jlblFGrade;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblForum;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHomeAddress;
    private javax.swing.JLabel jlblIDNumber;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblPersonalDetails;
    private javax.swing.JLabel jlblPhoneNumber;
    private javax.swing.JLabel jlblRegister;
    private javax.swing.JLabel jlblReset;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSGrade;
    private javax.swing.JLabel jlblSSubject;
    private javax.swing.JLabel jlblSubjects;
    private javax.swing.JLabel jlblSubmit;
    private javax.swing.JLabel jlblTeacherType;
    private javax.swing.JLabel jlblationality;
    private javax.swing.JPanel jpnlBackground;
    private javax.swing.JPanel jpnlComponents;
    private javax.swing.JRadioButton jrbFemale;
    private javax.swing.JRadioButton jrbMale;
    private javax.swing.JSeparator jsepAddress;
    private javax.swing.JSeparator jsepFirstName;
    private javax.swing.JSeparator jsepIDNumber;
    private javax.swing.JSeparator jsepLastName;
    private javax.swing.JSeparator jsepNationality;
    private javax.swing.JSeparator jsepPhoneNumber;
    private javax.swing.JSeparator jsepSkyeAddress;
    private javax.swing.JSeparator jsepSkyeAddress13;
    private javax.swing.JSeparator jsepSkyeAddress14;
    private javax.swing.JSeparator jsepSkyeAddress15;
    private javax.swing.JScrollPane jspAddress;
    private javax.swing.JScrollPane jspComponents;
    private javax.swing.JTextArea jtxaAddress;
    private javax.swing.JTextField jtxfAccountHolderName;
    private javax.swing.JTextField jtxfBranchCode;
    private javax.swing.JTextField jtxfFirstName;
    private javax.swing.JTextField jtxfLastName;
    private javax.swing.JTextField jtxfSkyeAddress;
    // End of variables declaration//GEN-END:variables
}
