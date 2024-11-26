/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *
 * @author unath
 */
public class StudentAccount extends Student{
    private String accountHolderName, accountNumber, bankName, branchCode, paymentRefernce;
    
    public StudentAccount(String studentAddress, String accountHolderName, String accountNumber, String bankName, String branchCode) {
        this.studentAddress = studentAddress;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.branchCode = branchCode;
    }
    
    /**
     * Derived from student address; student code
     * 
     * EXAMPLE
     * Name: James Okhue
     * Grade: 11
     * Address: S-OKH11-5423@skye.edu.za
     * Result: OKH11-5423
     * @return the paymentReference
     */
    public String getPaymentReference() {
        return paymentRefernce;
    }

    /**
     * @param payementRefernce the payementRefernce to set
     */
    public void setPayementRefernce(String payementRefernce) {
        this.paymentRefernce = payementRefernce;
    }
    
    /**
     * Format: S - Surname Grade - code @skye.edu.za
     * Code: 4 numbers based on ID Number
     * 
     * EXAMPLE
     * Name: James Okhue
     * Grade: 11
     * Result = S-OKH11-5423@skye.edu.za
     * @return the studentAddress
     */
    public String getStudentAddress() {
        return getStudentAddress();
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(String studentAddress) {
        this.setStudentAddress(studentAddress);
    }
    
    /**
     * @return the accountHolderName
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * @param accountHolderName the accountHolderName to set
     */
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the branchCode
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * @param branchCode the branchCode to set
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }
}
