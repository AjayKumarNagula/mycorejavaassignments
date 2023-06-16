import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int sum = calculateSum(number);

        System.out.println("Sum of digits in " + number + " is: " + sum);
    }

    public static int calculateSum(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
