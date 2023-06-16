import java.util.Scanner;

class Prime{
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and below are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number between 2 and its square root, it's not prime
            }
        }

        return true; // If the number is not divisible by any number between 2 and its square root, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
