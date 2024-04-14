import java.util.Scanner;

class ATM{

    int PIN= 7070;
    float balance;
    public void checkPin(){
        System.out.println("Enter Your PIN");
        Scanner sc = new Scanner (System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN)  {
            menu();
        } else{
            System.out.println("Enter valid PIN");
            checkPin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            checkBalance();
        } else if ( choice == 2){
            withdrawMoney();
        } else if (choice == 3){
            depositMoney();
        } else if (choice == 4){
            return;
        } else{
            System.out.println("Enter Valid Choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance :" + balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw:");
        Scanner sc= new Scanner (System.in);
        float amount = sc.nextFloat();
        if (amount > balance){
            System.out.println("Insufficient Balance");
        } else{
            balance = balance - amount;
            System.out.println("Amount withdraw successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter your Amount:");
        Scanner sc= new Scanner (System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkPin();

    }
}
