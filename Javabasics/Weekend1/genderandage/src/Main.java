class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid no.of arguments. Please provide gender and age.");

        }

        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        double interest;

        if (gender.equalsIgnoreCase("female")) {
            if (age >= 1 && age <= 58) {
                interest = 8.2;
            } else if (age >= 59 && age <= 120) {
                interest = 7.6;
            } else {
                System.out.println("Invalid age for female.");
                return;
            }
        } else if (gender.equalsIgnoreCase("male")) {
            if (age >= 1 && age <= 60) {
                interest = 9.2;
            } else if (age >= 61 && age <= 120) {
                interest = 8.3;
            } else {
                System.out.println("Invalid age for male.");
                return;
            }
        } else {
            System.out.println("Invalid gender. Please provide 'Male' or 'Female'.");
            return;
        }

        System.out.println("Interest percentage: " + interest + "%");
    }
}

