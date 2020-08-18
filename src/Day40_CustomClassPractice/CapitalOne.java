package Day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmament = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Beslan.setAccountInfo("Checking","Beslan","456789012");
        Ahmet.setAccountInfo("Checking","Ahmet","956789012");
        Viorel.setAccountInfo("Checking","Viorel","458789012");
        Nurmament.setAccountInfo("Checking","Nurmament","476789012");
        Waqar.setAccountInfo("Checking","Waqar","556789012");

        ArrayList<BankAccount>accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Beslan,Ahmet,Viorel,Nurmament,Waqar));
                    //                   0      1      2      3        4
        for(BankAccount each: accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(10000);
        accounts.get(3).checkBalance();
        accounts.get(3).withDraw(9000);
        accounts.get(3).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("********************************");
        accounts.removeIf(each->each.balance<1000);
        for(BankAccount each: accounts){
            each.getAccountInfo();
        }




    }
}
