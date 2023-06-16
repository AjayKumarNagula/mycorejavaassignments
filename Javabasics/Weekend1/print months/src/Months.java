public class Months {
    public static void main(String[] args) {

        int monthNumber = 1;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
            return;
        }

        String monthName = getMonthName(monthNumber);
        System.out.println(monthName);
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        return monthNames[monthNumber - 1];
    }
}
