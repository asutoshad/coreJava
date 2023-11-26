package coreJava.checkbalance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b1 = new Bank();
        b1.balance=0;
        System.out.println("Enter the balance you want to add : ");
        b1.updated = sc.nextInt();
        b1.addBalance();
        System.out.println("Enter the amount you want to withdrawn : ");
        b1.withdrawn = sc.nextInt();
        b1.withdrawBalance();
    }
}
