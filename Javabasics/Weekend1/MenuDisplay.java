import java.util.Scanner;

public class MenuDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");

            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            if (option == 1 || option == 2) {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                switch (option) {
                    case 1:
                        int sum = num1 + num2;
                        System.out.println("Sum is " + sum);
                        break;
                    case 2:
                        int difference = num1 - num2;
                        System.out.println("Difference is " + difference);
                        break;
                } }
            else{
                    System.out.println("Invalid option!");
                }

                System.out.print("Do you want to continue? (Y/N): ");
                choice = scanner.next().charAt(0);
            }
        while (choice == 'Y' || choice == 'y') ;

            System.out.println("Program terminated.");

        }
    }
