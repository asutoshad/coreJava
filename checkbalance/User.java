package coreJava.checkbalance;

public class User {
    public static void main(String[] args) {
        System.out.println("welcome to testing bank");
        String name = "aashutohs";
        int balance = 0;
        System.out.println("Welcome " +name + "Your balance is : " +balance);

        balance = balance + 5000;
        System.out.println("Balance added now your total balance is  " +balance);

        balance = balance - 2200;
        System.out.println("balance deducted now your balance is  " +balance);
    }
}
