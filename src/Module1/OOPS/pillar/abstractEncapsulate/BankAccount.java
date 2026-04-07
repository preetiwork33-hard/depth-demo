package Module1.OOPS.pillar;
import java.util.Scanner;
//Encapsulation

public class BankAccount {
    // private data (hidden)
    private double balance;
    private int amount;
    //no one can directly set the amount
    public int inputAmount(int amount){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Amount:");
        amount=scn.nextInt();
        return amount;
    }
    // public setter (controlled write)
    public void deposit() {
        amount=inputAmount(amount);//return user input amount
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("balance :"+balance);
        }
    }
    public void credit(){
        amount=inputAmount(amount);
        if(amount<=balance) {
            System.out.println("amount is credit"+amount);
            double currentBalance=balance-amount;
            System.out.println("remain balance"+currentBalance);
        }else System.out.println("Balance not sufficient ");
    }
}