import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double currentBalance = 30000; //account Balance

        while (true) {
            System.out.println("Welcome to the Simple Console ATM!");
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance: " + currentBalance + "taka");
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        currentBalance = (currentBalance + deposit);
                        System.out.println("Deposit successful!");
                        System.out.println("New balance: " + currentBalance + "taka");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount!");
                    }
                    else if (withdraw > 2000) {
                        System.out.println("You can withdrow a maximum of 2000 taka par transaction.");
                    }
                    else if (withdraw > currentBalance) {
                        System.out.println("Insufficient balance");
                    }
                    else {
                        currentBalance = (currentBalance - withdraw);
                        System.out.println("withdrawal successful!");
                        System.out.println("Remaining balance: " + currentBalance + "taka");
                    }
                    break;

                case 4:
                    System.out.println("Thank You for using the ATM!");
                    sc.close();
                    break;

                default:
                    System.out.println("Invalid option! Please a valid menu option. ");
            }
            if (choice == 4) {
                break;
            }
        }
    }
}