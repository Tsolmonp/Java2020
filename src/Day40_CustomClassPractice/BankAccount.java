package Day40_CustomClassPractice;
/*
 1. CheckBalance,   2. deposit,  3. withdraw

          requiremnts:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType,String name,String acctNum){
        this.accountType = clientAccountType;
        this.accountHolder = name;
        this.accountNumber = acctNum;

    }

    public void getAccountInfo(){
        System.out.println("===============================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+balance);
        System.out.println("===============================");

    }
    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }
    public void deposit(double amount){
        System.out.println("Depositing $"+amount+" to "+accountNumber);
        balance += amount;
    }

    public void withDraw(double amount){
        if(amount >= balance){
            System.out.println("not enough balance");
            return;//
        }
        System.out.println("Withdrawing $"+amount+" to "+accountNumber);
        balance -= amount;
    }


}