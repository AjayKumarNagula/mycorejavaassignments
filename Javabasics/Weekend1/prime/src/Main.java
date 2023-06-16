class PrimeNumbers {
    public static void main(String[] args) {
        int start = 10;
        int end = 99;

        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int number = start; number <= end; number++) {
            if ( isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

