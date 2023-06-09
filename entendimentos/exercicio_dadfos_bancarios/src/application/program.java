package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number,holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter deposit value:");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter withdraw value:");
        double withdrawtValue = sc.nextDouble();
        account.withdraw(withdrawtValue);
        System.out.println("Update account data: ");
        System.out.println(account);
    }
}