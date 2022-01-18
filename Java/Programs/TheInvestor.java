
/**************************************************************************************************
* TheInvestor.java
* Willie Conway
*
*
*
***************************************************************************************************/

public class TheInvestor {

    private static double interestRate;
    private final int  accountNumber;
    private double balance;

    public TheInvestor(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setInteresetRate(double rate) {
        interestRate = rate;
    }

    public void addInterest() {
        this.balance += (this.balance * interestRate)/12;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

}
