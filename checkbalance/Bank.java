package coreJava.checkbalance;

public class Bank {

    int balance = 0;
    int updated = 0;
    int withdrawn=0;

    public void addBalance(){

        balance = balance + updated;
        System.out.println("your now total balance is : " +balance);
    }

    public void withdrawBalance(){

        balance = balance - withdrawn;
        System.out.println("your now total balance is : " +balance);
    }
}
