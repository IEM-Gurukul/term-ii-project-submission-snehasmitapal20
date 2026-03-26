package ui;

import java.util.Scanner;
import service.AccountService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AccountService service = new AccountService();

        while (true) {
            System.out.println("\n1.Create 2.Deposit 3.Withdraw 4.Transfer 5.Check Balance 6.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                System.out.print("Type (savings/checking): ");
                String type = sc.next();
                service.createAccount(accNo, type);
            }

            else if (choice == 2) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                service.deposit(accNo, amt);
            }

            else if (choice == 3) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                service.withdraw(accNo, amt);
            }

            else if (choice == 4) {
                System.out.print("From Account: ");
                int from = sc.nextInt();
                System.out.print("To Account: ");
                int to = sc.nextInt();
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                service.transfer(from, to, amt);
            }

            else if (choice == 5) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                service.checkBalance(accNo);
            }

            else {
                System.out.println("Exiting...");
                break;
            }
        }
        sc.close();
    }
}

