/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package skyeuseradmin;

import asqlconnect.SQLConnect;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.*;
import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import schoolmanagement.SchoolManagement;

public class jfrmSkyeStudentPanel extends javax.swing.JFrame {

    private static final String[] ALLOWED_DOMAINS = {
        "gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "icloud.com", "aol.com", "protonmail.com", "zoho.com",
        "yandex.com", "mail.ru", "gmx.com", "live.com", "msn.com", "inbox.com", "fastmail.com", "tutanota.com", "skye.com"
    };
    
    public jfrmSkyeStudentPanel() {
        initComponents();
        jcbxPromote.hide();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jlblReturn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnlComponents = new javax.swing.JPanel();
        jlblPersonalDetails = new javax.swing.JLabel();
        jlblFirstName = new javax.swing.JLabel();
        jtxfFirstName = new javax.swing.JTextField();
        jsepFirstName = new javax.swing.JSeparator();
        jlblLastName = new javax.swing.JLabel();
        jtxfLastName = new javax.swing.JTextField();
        jsepLastName = new javax.swing.JSeparator();
        jfxtfIDNumber = new javax.swing.JFormattedTextField();
        jlblIDNumber = new javax.swing.JLabel();
        jsepIDNumber = new javax.swing.JSeparator();
        jlblPhoneNumber = new javax.swing.JLabel();
        jfxtfPhoneNumber = new javax.swing.JFormattedTextField();
        jsepPhoneNumber = new javax.swing.JSeparator();
        jlblGender = new javax.swing.JLabel();
        jsepEmail = new javax.swing.JSeparator();
        jlblEmail = new javax.swing.JLabel();
        jcomboNationality = new javax.swing.JComboBox<>();
        jlblNationality = new javax.swing.JLabel();
        jtxfEmail = new javax.swing.JTextField();
        jspAddress = new javax.swing.JScrollPane();
        jtxaAddress = new javax.swing.JTextArea();
        jsepAddress = new javax.swing.JSeparator();
        jlblHomeAddress = new javax.swing.JLabel();
        jlblPersonalDetails1 = new javax.swing.JLabel();
        jlblSGrade = new javax.swing.JLabel();
        jcomboOptionalSubject1 = new javax.swing.JComboBox<>();
        jlblOptionalSubject1 = new javax.swing.JLabel();
        jcomboOptionalSubject2 = new javax.swing.JComboBox<>();
        jlblOptionalSubject2 = new javax.swing.JLabel();
        jcomboSpecializedSubject = new javax.swing.JComboBox<>();
        jlblSpecializedSubject = new javax.swing.JLabel();
        jcomboMathematics = new javax.swing.JComboBox<>();
        jlblMathematics = new javax.swing.JLabel();
        jlblFClass = new javax.swing.JLabel();
        jcomboClass = new javax.swing.JComboBox<>();
        jlblPersonalDetails2 = new javax.swing.JLabel();
        jlblPersonalDetails3 = new javax.swing.JLabel();
        jlblAccountHolderName = new javax.swing.JLabel();
        jlblBankName = new javax.swing.JLabel();
        jcomboBankName = new javax.swing.JComboBox<>();
        jtxfAccountHolderName = new javax.swing.JTextField();
        jsepAccountHolderName = new javax.swing.JSeparator();
        jlblBranchCode = new javax.swing.JLabel();
        jtxfBranchCode = new javax.swing.JTextField();
        jsepBranchCode = new javax.swing.JSeparator();
        jsepAccountNumber = new javax.swing.JSeparator();
        jfxtfAccountNumber = new javax.swing.JFormattedTextField();
        jlblAccountNumber = new javax.swing.JLabel();
        jsepPaymentReference = new javax.swing.JSeparator();
        jlblPaymentReferene = new javax.swing.JLabel();
        jtxfPaymentReference = new javax.swing.JTextField();
        jfxtfIDNumberKin = new javax.swing.JFormattedTextField();
        jlblIDNumberKin = new javax.swing.JLabel();
        jlblFullName = new javax.swing.JLabel();
        jtxfFullNameKin = new javax.swing.JTextField();
        jsepFullNameKin = new javax.swing.JSeparator();
        jsepIDNumberKin = new javax.swing.JSeparator();
        jcomboRelationship = new javax.swing.JComboBox<>();
        jlblRelationship = new javax.swing.JLabel();
        jsepPhoneNumberKin = new javax.swing.JSeparator();
        jfxtfPhoneNumberKin = new javax.swing.JFormattedTextField();
        jlblPhoneNumberKin = new javax.swing.JLabel();
        jlblEmailKin = new javax.swing.JLabel();
        jtxfEmailKin = new javax.swing.JTextField();
        jsepEmailKin = new javax.swing.JSeparator();
        jfxtfSecondaryNumberKin = new javax.swing.JFormattedTextField();
        jsepSecondaryNumberKin = new javax.swing.JSeparator();
        jlblSecondaryNumberKin = new javax.swing.JLabel();
        jlblHomeAddressKin = new javax.swing.JLabel();
        jspAddress1 = new javax.swing.JScrollPane();
        jtxaAddressKin = new javax.swing.JTextArea();
        jcomboOccupationKin = new javax.swing.JComboBox<>();
        jlblOccupationKin = new javax.swing.JLabel();
        jsepAddressKin = new javax.swing.JSeparator();
        jlblSkyeAddress = new javax.swing.JLabel();
        jtxfSkyeAddress = new javax.swing.JTextField();
        jsepSkyeAddress = new javax.swing.JSeparator();
        jcomboGender = new javax.swing.JComboBox<>();
        jtxfGrade = new javax.swing.JTextField();
        jsepAccountHolderName1 = new javax.swing.JSeparator();
        jcbxPromote = new javax.swing.JCheckBox();
        jlblFirstName1 = new javax.swing.JLabel();
        jlblFirstName2 = new javax.swing.JLabel();
        jtxfSearch = new javax.swing.JTextField();
        jlblSearch = new javax.swing.JLabel();
        jlblUpdate = new javax.swing.JLabel();
        jlblSubmit = new javax.swing.JLabel();
        jlblDelete = new javax.swing.JLabel();
        jlblRegister = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

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

        jlblPersonalDetails.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblPersonalDetails.setForeground(new java.awt.Color(69, 69, 248));
        jlblPersonalDetails.setText("SECTION 1: Personal Details");

        jlblFirstName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFirstName.setForeground(new java.awt.Color(69, 69, 248));
        jlblFirstName.setText("First Name");

        jtxfFirstName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfFirstName.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfFirstName.setToolTipText("username");
        jtxfFirstName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfFirstNameMouseExited(evt);
            }
        });
        jtxfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfFirstNameActionPerformed(evt);
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
        jtxfLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfLastNameActionPerformed(evt);
            }
        });

        jsepLastName.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfIDNumber.setBorder(null);
        try {
            jfxtfIDNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####-#-#-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfIDNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfIDNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jlblIDNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblIDNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblIDNumber.setText("ID Number");

        jsepIDNumber.setForeground(new java.awt.Color(102, 102, 255));

        jlblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblPhoneNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblPhoneNumber.setText("Phone Number");

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

        jsepPhoneNumber.setForeground(new java.awt.Color(102, 102, 255));

        jlblGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblGender.setForeground(new java.awt.Color(69, 69, 248));
        jlblGender.setText("Gender");

        jsepEmail.setForeground(new java.awt.Color(102, 102, 255));

        jlblEmail.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblEmail.setForeground(new java.awt.Color(69, 69, 248));
        jlblEmail.setText("Email");

        jcomboNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde (Cape Verde)", "Cameroon", "Central African Republic", "Chad", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo", "Côte d'Ivoire (Ivory Coast)", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini (Swaziland)", "Ethiopia", "Gabon", "Gambia", "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania", "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "São Tomé and Príncipe", "Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe" }));
        jcomboNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboNationalityActionPerformed(evt);
            }
        });

        jlblNationality.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblNationality.setForeground(new java.awt.Color(69, 69, 248));
        jlblNationality.setText("Nationality");

        jtxfEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfEmail.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfEmail.setToolTipText("username");
        jtxfEmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfEmailMouseExited(evt);
            }
        });
        jtxfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfEmailActionPerformed(evt);
            }
        });

        jtxaAddress.setColumns(20);
        jtxaAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxaAddress.setLineWrap(true);
        jtxaAddress.setRows(5);
        jtxaAddress.setBorder(null);
        jtxaAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxaAddressMouseExited(evt);
            }
        });
        jspAddress.setViewportView(jtxaAddress);

        jsepAddress.setForeground(new java.awt.Color(102, 102, 255));

        jlblHomeAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblHomeAddress.setForeground(new java.awt.Color(69, 69, 248));
        jlblHomeAddress.setText("Home Address");

        jlblPersonalDetails1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblPersonalDetails1.setForeground(new java.awt.Color(69, 69, 248));
        jlblPersonalDetails1.setText("SECTION 2: Academic Details");

        jlblSGrade.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSGrade.setForeground(new java.awt.Color(69, 69, 248));
        jlblSGrade.setText("Grade");

        jcomboOptionalSubject1.setEditable(true);
        jcomboOptionalSubject1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboOptionalSubject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "History", "Geography", "Philosophy", "Biology", "Life Sciences", "Computer Applications Technology", "Information Technology", "Physical Science", " " }));

        jlblOptionalSubject1.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblOptionalSubject1.setForeground(new java.awt.Color(69, 69, 248));
        jlblOptionalSubject1.setText("Optional subject 1");

        jcomboOptionalSubject2.setEditable(true);
        jcomboOptionalSubject2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboOptionalSubject2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Business Studies", "Consumer Studies", "Economics", "Accounting", "Engineering Graphics and Design", "Technical Mathematics", " " }));

        jlblOptionalSubject2.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblOptionalSubject2.setForeground(new java.awt.Color(69, 69, 248));
        jlblOptionalSubject2.setText("Optional subject 2");

        jcomboSpecializedSubject.setEditable(true);
        jcomboSpecializedSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboSpecializedSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Art", "Accounting", "Drama", "Hospitality Studies", "Music", "Religious Studies" }));

        jlblSpecializedSubject.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSpecializedSubject.setForeground(new java.awt.Color(69, 69, 248));
        jlblSpecializedSubject.setText("Specialized subject");

        jcomboMathematics.setEditable(true);
        jcomboMathematics.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboMathematics.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mathematics", "Mathematical Literacy", "Advanced Placement Mathematics" }));
        jcomboMathematics.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcomboMathematicsItemStateChanged(evt);
            }
        });

        jlblMathematics.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblMathematics.setForeground(new java.awt.Color(69, 69, 248));
        jlblMathematics.setText("Mathematics Stream");

        jlblFClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFClass.setForeground(new java.awt.Color(69, 69, 248));
        jlblFClass.setText("Class");

        jcomboClass.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "S1", "S2", "S3" }));
        jcomboClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboClassActionPerformed(evt);
            }
        });

        jlblPersonalDetails2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblPersonalDetails2.setForeground(new java.awt.Color(69, 69, 248));
        jlblPersonalDetails2.setText("SECTION 3: Financial Details");

        jlblPersonalDetails3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jlblPersonalDetails3.setForeground(new java.awt.Color(69, 69, 248));
        jlblPersonalDetails3.setText("SECTION 4: Next of Kin");

        jlblAccountHolderName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAccountHolderName.setForeground(new java.awt.Color(69, 69, 248));
        jlblAccountHolderName.setText("Account Holder Name");

        jlblBankName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBankName.setForeground(new java.awt.Color(69, 69, 248));
        jlblBankName.setText("Bank Name");

        jcomboBankName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboBankName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Absa Bank", "Capitec Bank", "First National Bank", "Investec Bank", "Nedbank", "Standard Bank" }));
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

        jtxfAccountHolderName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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

        jsepAccountHolderName.setForeground(new java.awt.Color(102, 102, 255));

        jlblBranchCode.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblBranchCode.setForeground(new java.awt.Color(69, 69, 248));
        jlblBranchCode.setText("Branch Code");

        jtxfBranchCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfBranchCode.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfBranchCode.setText(" ");
        jtxfBranchCode.setToolTipText("username");
        jtxfBranchCode.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfBranchCode.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfBranchCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfBranchCodeMouseExited(evt);
            }
        });

        jsepBranchCode.setForeground(new java.awt.Color(102, 102, 255));

        jsepAccountNumber.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfAccountNumber.setBorder(null);
        try {
            jfxtfAccountNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####-#-#-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfAccountNumber.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfAccountNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfAccountNumberMouseExited(evt);
            }
        });

        jlblAccountNumber.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblAccountNumber.setForeground(new java.awt.Color(69, 69, 248));
        jlblAccountNumber.setText("Account Number");

        jsepPaymentReference.setForeground(new java.awt.Color(102, 102, 255));

        jlblPaymentReferene.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblPaymentReferene.setForeground(new java.awt.Color(69, 69, 248));
        jlblPaymentReferene.setText("Payement Reference");

        jtxfPaymentReference.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfPaymentReference.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfPaymentReference.setText(" ");
        jtxfPaymentReference.setToolTipText("username");
        jtxfPaymentReference.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfPaymentReference.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfPaymentReference.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfPaymentReferenceMouseExited(evt);
            }
        });

        jfxtfIDNumberKin.setBorder(null);
        try {
            jfxtfIDNumberKin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######-####-#-#-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfIDNumberKin.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfIDNumberKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfIDNumberKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfIDNumberKinMouseExited(evt);
            }
        });
        jfxtfIDNumberKin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfxtfIDNumberKinActionPerformed(evt);
            }
        });

        jlblIDNumberKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblIDNumberKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblIDNumberKin.setText("ID Number");

        jlblFullName.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblFullName.setForeground(new java.awt.Color(69, 69, 248));
        jlblFullName.setText("Full Name");

        jtxfFullNameKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfFullNameKin.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfFullNameKin.setToolTipText("username");
        jtxfFullNameKin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfFullNameKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfFullNameKinMouseExited(evt);
            }
        });
        jtxfFullNameKin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfFullNameKinActionPerformed(evt);
            }
        });

        jsepFullNameKin.setForeground(new java.awt.Color(102, 102, 255));

        jsepIDNumberKin.setForeground(new java.awt.Color(102, 102, 255));

        jcomboRelationship.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboRelationship.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biological Father ", "Biological Mother ", "Step Father ", "Step Mother ", "Uncle", "Aunt", "Sponsor", "Other" }));
        jcomboRelationship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboRelationshipActionPerformed(evt);
            }
        });

        jlblRelationship.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblRelationship.setForeground(new java.awt.Color(69, 69, 248));
        jlblRelationship.setText("Relationship");

        jsepPhoneNumberKin.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfPhoneNumberKin.setBorder(null);
        try {
            jfxtfPhoneNumberKin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+27-##-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfPhoneNumberKin.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfPhoneNumberKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfPhoneNumberKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfPhoneNumberKinMouseExited(evt);
            }
        });

        jlblPhoneNumberKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblPhoneNumberKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblPhoneNumberKin.setText("Primary Phone Number");

        jlblEmailKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblEmailKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblEmailKin.setText("Email");

        jtxfEmailKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfEmailKin.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfEmailKin.setToolTipText("username");
        jtxfEmailKin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfEmailKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfEmailKinMouseExited(evt);
            }
        });
        jtxfEmailKin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfEmailKinActionPerformed(evt);
            }
        });

        jsepEmailKin.setForeground(new java.awt.Color(102, 102, 255));

        jfxtfSecondaryNumberKin.setBorder(null);
        try {
            jfxtfSecondaryNumberKin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+27-##-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfxtfSecondaryNumberKin.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jfxtfSecondaryNumberKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jfxtfSecondaryNumberKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jfxtfSecondaryNumberKinMouseExited(evt);
            }
        });

        jsepSecondaryNumberKin.setForeground(new java.awt.Color(102, 102, 255));

        jlblSecondaryNumberKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSecondaryNumberKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblSecondaryNumberKin.setText("Secondary Phone Number");

        jlblHomeAddressKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblHomeAddressKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblHomeAddressKin.setText("Physical Address");

        jtxaAddressKin.setColumns(20);
        jtxaAddressKin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxaAddressKin.setLineWrap(true);
        jtxaAddressKin.setRows(5);
        jtxaAddressKin.setWrapStyleWord(true);
        jtxaAddressKin.setBorder(null);
        jtxaAddressKin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxaAddressKinMouseExited(evt);
            }
        });
        jspAddress1.setViewportView(jtxaAddressKin);

        jcomboOccupationKin.setEditable(true);
        jcomboOccupationKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboOccupationKin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accountant", "Actuary", "Administrative Assistant", "Air Traffic Controller", "Architect", "Attorney", "Baker", "Bar Tender", "Beautician", "Boilermaker", "Bricklayer", "Builder", "Carpenter", "Chef", "Cleaner", "Clerk", "Civil Engineer", "Construction and Building Trades", "Customer Service Representative", "Data Entry Clerk", "Delivery Driver", "Dentist", "Doctor", "Economist", "Electrician", "Engineer", "Farmer", "Fisherman", "Fitter", "Forester", "Geologist", "Hairdresser", "IT Specialist", "Lawyer", "Machinist", "Marketing Manager", "Mechanic", "Miner", "Mining Engineer", "Nurse", "Office Manager", "Painter", "Pilot", "Plumber", "Psychologist", "Receptionist", "Retail Assistant", "Salesperson", "Secretary", "Security Guard", "Shipping Clerk", "Teacher", "Truck Driver", "Veterinarian", "Waiter/Waitress", "Welder" }));
        jcomboOccupationKin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboOccupationKinActionPerformed(evt);
            }
        });

        jlblOccupationKin.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblOccupationKin.setForeground(new java.awt.Color(69, 69, 248));
        jlblOccupationKin.setText("Occupation");

        jsepAddressKin.setForeground(new java.awt.Color(102, 102, 255));

        jlblSkyeAddress.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jlblSkyeAddress.setForeground(new java.awt.Color(69, 69, 248));
        jlblSkyeAddress.setText("Skye Address");

        jtxfSkyeAddress.setEditable(false);
        jtxfSkyeAddress.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSkyeAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfSkyeAddress.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfSkyeAddress.setToolTipText("username");
        jtxfSkyeAddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfSkyeAddress.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        jsepSkyeAddress.setForeground(new java.awt.Color(102, 102, 255));

        jcomboGender.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcomboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jtxfGrade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtxfGrade.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jtxfGrade.setToolTipText("username");
        jtxfGrade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxfGrade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxfGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jtxfGradeMouseExited(evt);
            }
        });
        jtxfGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfGradeActionPerformed(evt);
            }
        });

        jsepAccountHolderName1.setForeground(new java.awt.Color(102, 102, 255));

        jcbxPromote.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jcbxPromote.setText("Promote");

        javax.swing.GroupLayout jpnlComponentsLayout = new javax.swing.GroupLayout(jpnlComponents);
        jpnlComponents.setLayout(jpnlComponentsLayout);
        jpnlComponentsLayout.setHorizontalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblPersonalDetails)
                                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlblFirstName)
                                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jsepFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxfFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jlblLastName)
                                                    .addComponent(jsepLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                                    .addComponent(jtxfLastName))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jlblSGrade, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jcomboClass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jsepAccountHolderName1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                            .addComponent(jtxfGrade))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jcbxPromote)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlblMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jcomboMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jlblSkyeAddress)
                                                .addComponent(jtxfSkyeAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                                .addComponent(jsepSkyeAddress))
                                            .addComponent(jlblFClass))
                                        .addGap(27, 27, 27)))
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlblOptionalSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlblOptionalSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlblSpecializedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcomboOptionalSubject2, 0, 0, Short.MAX_VALUE)
                                        .addComponent(jcomboOptionalSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcomboSpecializedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlblIDNumber)
                                        .addComponent(jsepIDNumber)
                                        .addComponent(jfxtfIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblPersonalDetails1)
                                    .addComponent(jlblGender)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblPhoneNumber)
                                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jsepPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jfxtfPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jsepEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblEmail)
                                            .addComponent(jtxfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addComponent(jcomboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(132, 132, 132)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcomboNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblNationality)))
                                    .addComponent(jlblPersonalDetails2)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jsepAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtxfAccountHolderName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlblAccountHolderName)
                                            .addComponent(jlblAccountNumber)
                                            .addComponent(jfxtfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(120, 120, 120)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlblBankName)
                                            .addComponent(jlblBranchCode)
                                            .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtxfBranchCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jsepBranchCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlblPaymentReferene)
                                        .addComponent(jtxfPaymentReference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jsepPaymentReference, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlblHomeAddress)
                                    .addComponent(jsepAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jspAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblPersonalDetails3)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addComponent(jlblFullName)
                                        .addGap(152, 152, 152)
                                        .addComponent(jlblIDNumberKin))
                                    .addComponent(jcomboRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblRelationship)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jsepFullNameKin)
                                            .addComponent(jtxfFullNameKin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jsepIDNumberKin)
                                            .addComponent(jfxtfIDNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jlblOccupationKin)
                                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlblPhoneNumberKin)
                                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jsepPhoneNumberKin, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jfxtfPhoneNumberKin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(9, 9, 9)
                                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlblSecondaryNumberKin)
                                                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jsepSecondaryNumberKin, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jfxtfSecondaryNumberKin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jcomboOccupationKin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jspAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jsepAddressKin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jsepEmailKin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlblEmailKin)
                                            .addComponent(jlblHomeAddressKin)
                                            .addComponent(jtxfEmailKin, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 62, Short.MAX_VALUE)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jsepAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpnlComponentsLayout.setVerticalGroup(
            jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jlblIDNumber))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblPersonalDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jlblFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsepFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnlComponentsLayout.createSequentialGroup()
                                .addComponent(jlblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jfxtfIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsepLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jsepIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblGender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblNationality)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblEmail)
                        .addGap(47, 47, 47)
                        .addComponent(jsepEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addComponent(jlblPhoneNumber)
                            .addGap(47, 47, 47)
                            .addComponent(jsepPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jfxtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHomeAddress)
                .addGap(6, 6, 6)
                .addComponent(jspAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jlblPersonalDetails1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblSGrade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbxPromote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepAccountHolderName1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblOptionalSubject1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboOptionalSubject1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblMathematics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblOptionalSubject2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboOptionalSubject2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblFClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboClass)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblSpecializedSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboSpecializedSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblSkyeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfSkyeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepSkyeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)))
                .addComponent(jlblPersonalDetails2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblBankName)
                    .addComponent(jlblAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblAccountNumber)
                    .addComponent(jlblBranchCode))
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jsepAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jfxtfAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jtxfBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepBranchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblPaymentReferene)
                .addGap(0, 0, 0)
                .addComponent(jtxfPaymentReference, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsepPaymentReference, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblPersonalDetails3)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblIDNumberKin)
                    .addComponent(jlblFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfFullNameKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfxtfIDNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepFullNameKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jsepIDNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblRelationship)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addComponent(jlblPhoneNumberKin)
                            .addGap(47, 47, 47)
                            .addComponent(jsepPhoneNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jfxtfPhoneNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addComponent(jlblSecondaryNumberKin)
                            .addGap(47, 47, 47)
                            .addComponent(jsepSecondaryNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlComponentsLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jfxtfSecondaryNumberKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxfEmailKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jlblEmailKin)
                        .addGap(47, 47, 47)
                        .addComponent(jsepEmailKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblOccupationKin)
                    .addComponent(jlblHomeAddressKin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlComponentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcomboOccupationKin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlComponentsLayout.createSequentialGroup()
                        .addComponent(jspAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsepAddressKin, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jpnlComponents);

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

        jlblRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlblRegister.setForeground(new java.awt.Color(255, 255, 255));
        jlblRegister.setText("View/ Modify/ Remove student");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblFirstName1)
                            .addComponent(jlblFirstName2)
                            .addComponent(jtxfSearch)
                            .addComponent(jSeparator1)
                            .addComponent(jlblSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlblSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jlblDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlblFirstName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblFirstName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jlblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jtxfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfFirstNameActionPerformed

    private void jtxfLastNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfLastNameMouseExited

    }//GEN-LAST:event_jtxfLastNameMouseExited

    private void jtxfLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfLastNameActionPerformed

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

    private void jtxfEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfEmailMouseExited
        // CHECKS VALIDITY OF PROVIDED EMAIL ADDRESS
        String email = jtxfEmail.getText();

        if (isValidEmailDomain(email)) {
            jsepEmail.setForeground(new Color(102,102,255));
        } else {
            jsepEmail.setForeground(new Color(255, 0, 0));
        }
    }//GEN-LAST:event_jtxfEmailMouseExited

    private void jtxfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfEmailActionPerformed

    private void jtxaAddressMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxaAddressMouseExited
        if (jtxaAddress.getText().equals("")) {
            jsepAddress.setForeground(new Color(255, 0, 0));
        }else{
            jsepAddress.setForeground(new Color(102,102,255));
        }
    }//GEN-LAST:event_jtxaAddressMouseExited

    private void jcomboMathematicsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcomboMathematicsItemStateChanged
        if (jcomboMathematics.getSelectedIndex() == 0 || jcomboMathematics.getSelectedIndex() == 2) {
            jcomboOptionalSubject1.addItem("Information Technology");
            jcomboOptionalSubject1.addItem("Physical Science");
        } else if (jcomboMathematics.getSelectedIndex() == 1) {
            jcomboOptionalSubject1.removeItem("Information Technology");
            jcomboOptionalSubject1.removeItem("Physical Science");
        }
    }//GEN-LAST:event_jcomboMathematicsItemStateChanged

    private void jcomboClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboClassActionPerformed

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

    private void jcomboBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboBankNameActionPerformed

    private void jtxfAccountHolderNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfAccountHolderNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAccountHolderNameMouseExited

    private void jtxfAccountHolderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfAccountHolderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfAccountHolderNameActionPerformed

    private void jtxfBranchCodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfBranchCodeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfBranchCodeMouseExited

    private void jfxtfAccountNumberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfAccountNumberMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jfxtfAccountNumberMouseExited

    private void jtxfPaymentReferenceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfPaymentReferenceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfPaymentReferenceMouseExited

    private void jfxtfIDNumberKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfIDNumberKinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jfxtfIDNumberKinMouseExited

    private void jfxtfIDNumberKinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfxtfIDNumberKinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jfxtfIDNumberKinActionPerformed

    private void jtxfFullNameKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfFullNameKinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfFullNameKinMouseExited

    private void jtxfFullNameKinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfFullNameKinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfFullNameKinActionPerformed

    private void jcomboRelationshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboRelationshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboRelationshipActionPerformed

    private void jfxtfPhoneNumberKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfPhoneNumberKinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jfxtfPhoneNumberKinMouseExited

    private void jtxfEmailKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfEmailKinMouseExited
        // CHECKS VALIDITY OF PROVIDED EMAIL ADDRESS
        String email = jtxfEmailKin.getText();

        if (isValidEmailDomain(email)) {
            jsepEmailKin.setForeground(new Color(102,102,255));
        } else {
            jsepEmailKin.setForeground(new Color(255, 0, 0));
        }
    }//GEN-LAST:event_jtxfEmailKinMouseExited

    private void jtxfEmailKinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfEmailKinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfEmailKinActionPerformed

    private void jfxtfSecondaryNumberKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jfxtfSecondaryNumberKinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jfxtfSecondaryNumberKinMouseExited

    private void jtxaAddressKinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxaAddressKinMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxaAddressKinMouseExited

    private void jcomboOccupationKinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboOccupationKinActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcomboOccupationKinActionPerformed

    private void jtxfSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfSearchMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSearchMouseExited

    private void jtxfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSearchActionPerformed

    private void jlblSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSearchMousePressed
        String searchStr = jtxfSearch.getText();
        String querySearch, queryStudentAccount, queryKinship, queryAcademics;
        String firstName, lastName, IDNumber, dateOfBirth, nationality, email, phoneNumber, physicalAddress, studentAddress, gender;
        String accountHolderName, accountNumber, bankName, branchCode;
        String fullNameKin, IDNumberKin, relationshipKin, primaryNumberKin, secondaryNumberKin, emailKin, occupationKin, addressKin;
        String subjectList, studentClass;
        int grade;
        
        if (searchStr.equals("")) {
            JOptionPane.showMessageDialog(null, "Provide the name or\nstudent addresss.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection connect = SQLConnect.connect();
                querySearch = "SELECT * FROM tblStudent WHERE tblStudent.StudentAddress LIKE '" + searchStr + "' OR tblStudent.FirstName LIKE '%" + (searchStr.substring(0,1).toUpperCase() +searchStr.substring(1)) + "%'";
                PreparedStatement statement = connect.prepareStatement(querySearch);
                ResultSet set = statement.executeQuery();

                if (set.next()) {
                    firstName = set.getString("FirstName");
                    jtxfFirstName.setText(firstName);
                    
                    lastName = set.getString("LastName");
                    jtxfLastName.setText(lastName);
                    
                    IDNumber = set.getString("IDNumber");
                    jfxtfIDNumber.setValue(IDNumber);
                    
                    nationality = set.getString("Nationality");
                    jcomboNationality.setSelectedItem(nationality);
                    
                    email = set.getString("EmailAddress");
                    jtxfEmail.setText(email);
                    
                    phoneNumber = set.getString("PhoneNumber");
                    jfxtfPhoneNumber.setValue(phoneNumber);
                    
                    physicalAddress = set.getString("PhysicalAddress");
                    jtxaAddress.setText(physicalAddress);

                    studentAddress = set.getString("StudentAddress");
                    jtxfSkyeAddress.setText(studentAddress);
                    
                    gender = set.getString("Gender");
                    if (gender.equals("M")) {
                        jcomboGender.setSelectedItem("Male");
                    } else {
                        jcomboGender.setSelectedItem("Female");
                    }
                    
                    queryStudentAccount = "SELECT * FROM tblStudentAccount WHERE tblStudentAccount.StudentAddress LIKE '%" + studentAddress + "%'";
                    PreparedStatement statementAccount = connect.prepareStatement(queryStudentAccount);
                    ResultSet setAccount = statementAccount.executeQuery();

                    if (setAccount.next()) {
                        accountHolderName = setAccount.getString("AccountHolderName");
                        jtxfAccountHolderName.setText(accountHolderName);

                        accountNumber = setAccount.getString("AccountNumber");
                        jfxtfAccountNumber.setText(accountNumber);

                        bankName = setAccount.getString("BankName");
                        jcomboBankName.setSelectedItem(bankName);

                        branchCode = setAccount.getString("BranchCode");
                        jtxfBranchCode.setText(branchCode);
                        
                        String localPart = studentAddress.split("@")[0];
                        jtxfPaymentReference.setText(localPart);
                    }

                    queryKinship = "SELECT * FROM tblStudentKinship WHERE tblStudentKinship.StudentAddress LIKE '%" + studentAddress + "%'";
                    PreparedStatement statementKinship = connect.prepareStatement(queryKinship);
                    ResultSet setKinship = statementKinship.executeQuery();

                    if (setKinship.next()) {
                        fullNameKin = setKinship.getString("FullName");
                        jtxfFullNameKin.setText(fullNameKin);
                        
                        IDNumberKin = setKinship.getString("IDNumber");
                        jfxtfIDNumberKin.setText(IDNumberKin);
                        
                        relationshipKin = setKinship.getString("Relationship");
                        jcomboRelationship.setSelectedItem(IDNumberKin);
                        
                        primaryNumberKin = setKinship.getString("PrimaryPhoneNumber");
                        jfxtfPhoneNumberKin.setText(primaryNumberKin);
                        
                        secondaryNumberKin = setKinship.getString("SecondaryPhoneNumber");
                        jfxtfSecondaryNumberKin.setText(secondaryNumberKin);
                        
                        emailKin = setKinship.getString("Email");
                        jtxfEmailKin.setText(emailKin);
                        
                        occupationKin = setKinship.getString("Occupation");
                        jcomboOccupationKin.setSelectedItem(occupationKin);
                        
                        addressKin = setKinship.getString("Address");
                        jtxaAddressKin.setText(addressKin);
                    }
                    
                    queryAcademics = "SELECT * FROM tblStudentAcademics WHERE tblStudentAcademics.StudentAddress LIKE '%" + studentAddress + "%'";
                    PreparedStatement statementAcademics = connect.prepareStatement(queryAcademics);
                    ResultSet setAcademics = statementAcademics.executeQuery();

                    if (setAcademics.next()) {
                        grade = setAcademics.getInt("Grade");
                        jtxfGrade.setText(String.valueOf(grade));
                        
                        subjectList = setAcademics.getString("SubjectList");
                        String[] subArray = subjectList.split("#");
                        jcomboMathematics.setSelectedItem(subArray[0]);
                        jcomboOptionalSubject1.setSelectedItem(subArray[1]);
                        jcomboOptionalSubject2.setSelectedItem(subArray[2]);
                        jcomboSpecializedSubject.setSelectedItem(subArray[3]);
                        
                        studentClass = setAcademics.getString("FormClass");    
                        jcomboClass.setSelectedItem(studentClass);
                    }

                    connect.close();
                    statement.close();
                    set.close();
                    statementAccount.close();
                    setAccount.close();
                    statementKinship.close();
                    setKinship.close();
                    statementAcademics.close();
                    setAcademics.close();

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

    private void jlblUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblUpdateMousePressed
        //Confirms whether the user is an authorized user, only authorized users can update
        int confirm = JOptionPane.showConfirmDialog(null, "Are you an authorized user?\nOnly authorised users can update information", "Confirm action", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (confirm == JOptionPane.YES_OPTION) {
            changeComponentsStatus(true);
            jcbxPromote.setVisible(true);
        } else {
            changeComponentsStatus(false);
        }
    }//GEN-LAST:event_jlblUpdateMousePressed

    private void jlblSubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblSubmitMousePressed
        // CREATES A DATABASE ENTRY
        String firstName, lastName, IDNumber, dateOfBirth, nationality, email, phoneNumber, homeAddress;
        char gender;
        int grade;
        String formClass, skyeAddress, mathematicsStream, optional1, optional2, specialized;
        String accountHolderName, accountNumber, bankName, branchCode, paymentReference;
        String kinFullName, kinIDNumber, kinRelationship, kinPrimaryNumber, kinSecondaryNumber, kinEmail, kinOccupation, kinAddress;
        
        firstName = jtxfFirstName.getText();
        lastName = jtxfLastName.getText();
        IDNumber = jfxtfIDNumber.getText();
        
        // Extract the date of birth digits
        String yearStr = IDNumber.substring(0, 2);
        String monthStr = IDNumber.substring(2, 4);
        String dayStr = IDNumber.substring(4, 6);

        // Construct the date of birth string
        dateOfBirth = yearStr + "-" + monthStr + "-" + dayStr;
        
        
        phoneNumber = jfxtfPhoneNumber.getText();
        email = jtxfEmail.getText();
        nationality = (String) jcomboNationality.getSelectedItem();
        homeAddress = jtxaAddress.getText();
        
        String strGrade = (String) jtxfGrade.getText();
        grade = Integer.parseInt(strGrade);
        formClass = (String) jcomboClass.getSelectedItem();
        mathematicsStream = (String) jcomboMathematics.getSelectedItem();
        optional1 = (String) jcomboOptionalSubject1.getSelectedItem();
        optional2 = (String) jcomboOptionalSubject2.getSelectedItem();
        specialized = (String) jcomboSpecializedSubject.getSelectedItem();
        
        String subList = "";
        if (grade == 8 || grade == 9) {
            subList = "NULL#NULL#NULL#NULL";
        } else if (grade == 10 || grade == 11 || grade == 12){
            subList = mathematicsStream + "#" + optional1 + "#" + optional2 + "#" + specialized;
        }
        
        accountHolderName = jtxfAccountHolderName.getText();
        accountNumber = jfxtfAccountNumber.getText();
        bankName = (String) jcomboBankName.getSelectedItem();
        branchCode = jtxfBranchCode.getText();
        paymentReference = jtxfPaymentReference.getText();
        
        kinFullName = jtxfFullNameKin.getText();
        kinIDNumber = jfxtfIDNumberKin.getText();
        kinRelationship = (String) jcomboRelationship.getSelectedItem();
        kinPrimaryNumber = jfxtfPhoneNumberKin.getText();
        kinSecondaryNumber = jfxtfSecondaryNumberKin.getText();
        kinEmail = jtxfEmailKin.getText();
        kinOccupation = (String) jcomboOccupationKin.getSelectedItem();
        kinAddress = jtxaAddressKin.getText();
        
        skyeAddress = jtxfSkyeAddress.getText();
        
        if (firstName.equals("")) {
            jsepFirstName.setForeground(new Color(255, 0, 0));
        }
        
        if (lastName.equals("")) {
            jsepLastName.setForeground(new Color(255, 0, 0));
        }
        
        if (IDNumber.equals(null)) {
            jsepIDNumber.setForeground(new Color(255, 0, 0));
        }
        
        if (phoneNumber.equals(null)) {
            jsepPhoneNumber.setForeground(new Color(255, 0, 0));
        }
        
        if (email.equals("")) {
            jsepEmail.setForeground(new Color(255, 0, 0));
        }
        
        if (homeAddress.equals("")) {
            jsepAddress.setForeground(new Color(255, 0, 0));
        }
        
        if (skyeAddress.equals("")) {
            jsepSkyeAddress.setForeground(new Color(255, 0, 0));
        }
        
        if (accountHolderName.equals("")) {
            jsepAccountHolderName.setForeground(new Color(255, 0, 0));
        }
        
        if (accountNumber.equals("")) {
            jsepAccountNumber.setForeground(new Color(255, 0, 0));
        }
        
        if (branchCode.equals("")) {
            jsepBranchCode.setForeground(new Color(255, 0, 0));
        }
        
        if (paymentReference.equals("")) {
            jsepPaymentReference.setForeground(new Color(255, 0, 0));
        }
        
        if (kinFullName.equals("")) {
            jsepFullNameKin.setForeground(new Color(255, 0, 0));
        }
        
        if (kinIDNumber.equals("")) {
            jsepIDNumberKin.setForeground(new Color(255, 0, 0));
        }
        
        if (kinPrimaryNumber.equals("")) {
            jsepPhoneNumberKin.setForeground(new Color(255, 0, 0));
        }
        
        if (kinSecondaryNumber.equals("")) {
            jsepSecondaryNumberKin.setForeground(new Color(255, 0, 0));
        }
        
        if (kinEmail.equals("")) {
            jsepEmailKin.setForeground(new Color(255, 0, 0));
        }
        
        if (kinAddress.equals("")) {
            jsepAddressKin.setForeground(new Color(255, 0, 0));
        }
        
        if (firstName.equals("") || lastName.equals("") || IDNumber.equals(null) || phoneNumber.equals(null) || email.equals("") || homeAddress.equals("") || skyeAddress.equals("") || accountHolderName.equals("") || accountNumber.equals("") || branchCode.equals("") || paymentReference.equals("") || kinFullName.equals("") || kinIDNumber.equals("") || kinPrimaryNumber.equals("") || kinSecondaryNumber.equals("") || kinEmail.equals("") || kinAddress.equals("")) {
            JOptionPane.showMessageDialog(null, "Missing fields.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else{
            try {
                Connection connect = SQLConnect.connect();
                
                PreparedStatement studentStatement = connect.prepareStatement
        ("UPDATE tblStudent SET FirstName = '" + firstName + "', LastName = '" + lastName + "', "
                + "Nationality = '" + nationality + "', EmailAddress = '" + email + "', "
                        + "PhoneNumber = '" + phoneNumber + "', PhysicalAddress = '" + homeAddress + "' "
                                + "WHERE StudentAddress = '" + skyeAddress + "'");
        
                PreparedStatement accountStatement = connect.prepareStatement
        ("UPDATE tblStudentAccount SET AccountHolderName = '" + accountHolderName + "', AccountNumber = '" + accountNumber + "', "
                + "BankName = '" + bankName + "', BranchCode = '" + branchCode + "' "
                        + "WHERE StudentAddress = '" + skyeAddress + "'");
        
                PreparedStatement kinshipStatement = connect.prepareStatement
        ("UPDATE tblStudentKinship SET FullName = '" + kinFullName + "', Relationship = '" + kinRelationship + "', "
                + "PrimaryPhoneNumber = '" + kinPrimaryNumber + "', SecondaryPhoneNumber = '" + kinSecondaryNumber + "', "
                        + "Email = '" + kinEmail + "', Occupation = '" + kinOccupation + "', Address = '" + kinAddress + "' "
                                + "WHERE StudentAddress = '" + skyeAddress + "'");
              
                PreparedStatement promoteGrade = connect.prepareStatement
        ("UPDATE tblStudentAcademics SET Grade = Grade + 1 WHERE StudentAddress = '" + skyeAddress + "'");
                        
                if (grade == 8 || grade == 9) {
                    subList = "NULL#NULL#NULL#NULL";
                } else if (grade == 10 || grade == 11 || grade == 12){
                    subList = mathematicsStream + "#" + optional1 + "#" + optional2 + "#" + specialized;
                }
        
                PreparedStatement academicsStatement = connect.prepareStatement
        ("UPDATE tblStudentAcademics SET SubjectList = '" + subList + "', tblStudentAcademics.FormClass = '" + formClass + "' WHERE StudentAddress = '" + skyeAddress + "'");
                
                String message = "";
                if (jcbxPromote.isSelected() && Integer.parseInt(jtxfGrade.getText()) != 12) {
                    message = "Are you sure you would like to proceed?\nStudent will be promoted to Grade " + (Integer.parseInt(jtxfGrade.getText()) + 1) + ".";
                }else{
                    message = "Are you sure you would like to proceed?";
                }
                
                int confirm = JOptionPane.showConfirmDialog(null, message, "Confirm update", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (confirm == JOptionPane.YES_OPTION) {
                    int updateStudent = studentStatement.executeUpdate();
                    int updateAccount = accountStatement.executeUpdate();
                    int updateKinship = kinshipStatement.executeUpdate();
                    int updateAcademics = academicsStatement.executeUpdate();
                    int updateGrade = 0;
                    
                    if (jcbxPromote.isSelected()) {
                        int currentGrade = Integer.parseInt(jtxfGrade.getText());
                        
                        if (currentGrade == 12){
                            JOptionPane.showMessageDialog(null, "Unable to promote Grade 12 student.", "Operation failed", JOptionPane.ERROR_MESSAGE);
                        }else{
                            updateGrade = promoteGrade.executeUpdate();
                        }
                    }
                    
                    if (updateStudent > 0 && updateAccount > 0 && updateKinship > 0 && updateAcademics > 0) {
                        if (updateGrade > 0) {
                            String studentAddress = jtxfSkyeAddress.getText();
                            String code = studentAddress.split("@")[0];
                            JOptionPane.showMessageDialog(null, "Update executed successfilly.\nStudent " + code + " promoted to Grade " + (Integer.parseInt(jtxfGrade.getText()) + 1) + ".", "Operation successful", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "Update executed successfilly.", "Operation successfil", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Unable to update information\\nPlease try again later\nor contact I.T support if this persists.", "Operation failed", JOptionPane.ERROR_MESSAGE);
                    }
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
                JOptionPane.showMessageDialog(null, "Failed to update information.\nException Occured", "Operation failed", JOptionPane.ERROR_MESSAGE);
                try {
                    FileWriter write = new FileWriter("errors.txt", true);
                    write.write(String.valueOf(LocalDate.now()) + " at " + String.valueOf(LocalTime.now()) + " - " + error.getMessage() + "\n");
                    write.close();
                }catch(Exception e){
                    
                }
            }
        }
    }//GEN-LAST:event_jlblSubmitMousePressed

    private void jlblDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblDeleteMousePressed
        String searchStr = jtxfSearch.getText(), addressStr = jtxfSkyeAddress.getText(), 
                deleteQuery, deleteQueryAcademics, deleteQueryAccount, deleteQueryKinship;
        deleteQuery = "DELETE FROM tblStudent WHERE StudentAddress = '" + addressStr + "'";
        deleteQueryAcademics = "DELETE FROM tblStudentAcademics WHERE StudentAddress = '" + addressStr + "'";
        deleteQueryAccount = "DELETE FROM tblStudentAccount WHERE StudentAddress = '" + addressStr + "'";
        deleteQueryKinship = "DELETE FROM tblStudentKinship WHERE StudentAddress = '" + addressStr + "'";

        if (searchStr.equals("") || addressStr.equals("")) {
            JOptionPane.showMessageDialog(null, "Mising identifier.", "Operation failed", JOptionPane.ERROR_MESSAGE);
        } else {
            //Database connection
            try {
                // Establish connection
                Connection connect = SQLConnect.connect();
                PreparedStatement studentStatement = connect.prepareStatement(deleteQuery);
                PreparedStatement academicsStatement = connect.prepareStatement(deleteQueryAcademics);
                PreparedStatement accountStatement = connect.prepareStatement(deleteQueryAccount);
                PreparedStatement kinshipStatement = connect.prepareStatement(deleteQueryKinship);

                int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you would like\nto proceed", "This action cannot be undone", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                    int studentRow = studentStatement.executeUpdate();
                    int academicsRow = academicsStatement.executeUpdate();
                    int accountRow = accountStatement.executeUpdate();
                    int kinshipRow = kinshipStatement.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Student ("+ addressStr +") has been removed.", "Deletion successfull", JOptionPane.INFORMATION_MESSAGE);
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

    private void jtxfGradeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfGradeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfGradeMouseExited

    private void jtxfGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfGradeActionPerformed

    public boolean isValidEmailDomain(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        int atIndex = email.indexOf('@');
        if (atIndex < 0) {
            return false; 
        }

        String domain = email.substring(atIndex + 1);
        for (String allowedDomain : ALLOWED_DOMAINS) {
            if (domain.equalsIgnoreCase(allowedDomain)) {
                return true;
            }
        }
        return false;
    }
    
    public void changeComponentsStatus(boolean enabled){
        jtxfFirstName.setEditable(enabled);
        jtxfLastName.setEditable(enabled);
        jfxtfIDNumber.setEditable(enabled);
        jcomboGender.setEditable(enabled);
        jcomboGender.setEnabled(enabled);
        jcomboNationality.setEditable(enabled);
        jcomboNationality.setEnabled(enabled);
        jfxtfPhoneNumber.setEditable(enabled);
        jtxfEmail.setEditable(enabled);
        jtxaAddress.setEditable(enabled);
        jcomboClass.setEditable(enabled);
        jcomboClass.setEnabled(enabled);
        jcomboMathematics.setEditable(enabled);
        jcomboMathematics.setEnabled(enabled);
        jcomboOptionalSubject1.setEditable(enabled);
        jcomboOptionalSubject1.setEnabled(enabled);
        jcomboOptionalSubject2.setEditable(enabled);
        jcomboOptionalSubject2.setEnabled(enabled);
        jcomboSpecializedSubject.setEditable(enabled);
        jcomboSpecializedSubject.setEnabled(enabled);
        jtxfAccountHolderName.setEditable(enabled);
        jfxtfAccountNumber.setEditable(enabled);
        jcomboBankName.setEditable(enabled);
        jcomboBankName.setEnabled(enabled);
        jtxfBranchCode.setEditable(enabled);
        jtxfPaymentReference.setEditable(enabled);
        jtxfFullNameKin.setEditable(enabled);
        jfxtfIDNumberKin.setEditable(enabled);
        jcomboRelationship.setEditable(enabled);
        jcomboRelationship.setEnabled(enabled);
        jfxtfPhoneNumberKin.setEditable(enabled);
        jfxtfSecondaryNumberKin.setEditable(enabled);
        jtxfEmailKin.setEditable(enabled);
        jcomboOccupationKin.setEditable(enabled);
        jcomboOccupationKin.setEnabled(enabled);
        jtxaAddressKin.setEditable(enabled);
        jtxfGrade.setEditable(false);
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
            java.util.logging.Logger.getLogger(jfrmSkyeStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmSkyeStudentPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmSkyeStudentPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jcbxPromote;
    private javax.swing.JComboBox<String> jcomboBankName;
    private javax.swing.JComboBox<String> jcomboClass;
    private javax.swing.JComboBox<String> jcomboGender;
    private javax.swing.JComboBox<String> jcomboMathematics;
    private javax.swing.JComboBox<String> jcomboNationality;
    private javax.swing.JComboBox<String> jcomboOccupationKin;
    private javax.swing.JComboBox<String> jcomboOptionalSubject1;
    private javax.swing.JComboBox<String> jcomboOptionalSubject2;
    private javax.swing.JComboBox<String> jcomboRelationship;
    private javax.swing.JComboBox<String> jcomboSpecializedSubject;
    private javax.swing.JFormattedTextField jfxtfAccountNumber;
    private javax.swing.JFormattedTextField jfxtfIDNumber;
    private javax.swing.JFormattedTextField jfxtfIDNumberKin;
    private javax.swing.JFormattedTextField jfxtfPhoneNumber;
    private javax.swing.JFormattedTextField jfxtfPhoneNumberKin;
    private javax.swing.JFormattedTextField jfxtfSecondaryNumberKin;
    private javax.swing.JLabel jlblAccountHolderName;
    private javax.swing.JLabel jlblAccountNumber;
    private javax.swing.JLabel jlblBankName;
    private javax.swing.JLabel jlblBranchCode;
    private javax.swing.JLabel jlblDelete;
    private javax.swing.JLabel jlblEmail;
    private javax.swing.JLabel jlblEmailKin;
    private javax.swing.JLabel jlblFClass;
    private javax.swing.JLabel jlblFirstName;
    private javax.swing.JLabel jlblFirstName1;
    private javax.swing.JLabel jlblFirstName2;
    private javax.swing.JLabel jlblFullName;
    private javax.swing.JLabel jlblGender;
    private javax.swing.JLabel jlblHomeAddress;
    private javax.swing.JLabel jlblHomeAddressKin;
    private javax.swing.JLabel jlblIDNumber;
    private javax.swing.JLabel jlblIDNumberKin;
    private javax.swing.JLabel jlblLastName;
    private javax.swing.JLabel jlblMathematics;
    private javax.swing.JLabel jlblNationality;
    private javax.swing.JLabel jlblOccupationKin;
    private javax.swing.JLabel jlblOptionalSubject1;
    private javax.swing.JLabel jlblOptionalSubject2;
    private javax.swing.JLabel jlblPaymentReferene;
    private javax.swing.JLabel jlblPersonalDetails;
    private javax.swing.JLabel jlblPersonalDetails1;
    private javax.swing.JLabel jlblPersonalDetails2;
    private javax.swing.JLabel jlblPersonalDetails3;
    private javax.swing.JLabel jlblPhoneNumber;
    private javax.swing.JLabel jlblPhoneNumberKin;
    private javax.swing.JLabel jlblRegister;
    private javax.swing.JLabel jlblRelationship;
    private javax.swing.JLabel jlblReturn;
    private javax.swing.JLabel jlblSGrade;
    private javax.swing.JLabel jlblSearch;
    private javax.swing.JLabel jlblSecondaryNumberKin;
    private javax.swing.JLabel jlblSkyeAddress;
    private javax.swing.JLabel jlblSpecializedSubject;
    private javax.swing.JLabel jlblSubmit;
    private javax.swing.JLabel jlblUpdate;
    private javax.swing.JPanel jpnlComponents;
    private javax.swing.JSeparator jsepAccountHolderName;
    private javax.swing.JSeparator jsepAccountHolderName1;
    private javax.swing.JSeparator jsepAccountNumber;
    private javax.swing.JSeparator jsepAddress;
    private javax.swing.JSeparator jsepAddressKin;
    private javax.swing.JSeparator jsepBranchCode;
    private javax.swing.JSeparator jsepEmail;
    private javax.swing.JSeparator jsepEmailKin;
    private javax.swing.JSeparator jsepFirstName;
    private javax.swing.JSeparator jsepFullNameKin;
    private javax.swing.JSeparator jsepIDNumber;
    private javax.swing.JSeparator jsepIDNumberKin;
    private javax.swing.JSeparator jsepLastName;
    private javax.swing.JSeparator jsepPaymentReference;
    private javax.swing.JSeparator jsepPhoneNumber;
    private javax.swing.JSeparator jsepPhoneNumberKin;
    private javax.swing.JSeparator jsepSecondaryNumberKin;
    private javax.swing.JSeparator jsepSkyeAddress;
    private javax.swing.JScrollPane jspAddress;
    private javax.swing.JScrollPane jspAddress1;
    private javax.swing.JTextArea jtxaAddress;
    private javax.swing.JTextArea jtxaAddressKin;
    private javax.swing.JTextField jtxfAccountHolderName;
    private javax.swing.JTextField jtxfBranchCode;
    private javax.swing.JTextField jtxfEmail;
    private javax.swing.JTextField jtxfEmailKin;
    private javax.swing.JTextField jtxfFirstName;
    private javax.swing.JTextField jtxfFullNameKin;
    private javax.swing.JTextField jtxfGrade;
    private javax.swing.JTextField jtxfLastName;
    private javax.swing.JTextField jtxfPaymentReference;
    private javax.swing.JTextField jtxfSearch;
    private javax.swing.JTextField jtxfSkyeAddress;
    // End of variables declaration//GEN-END:variables
}
