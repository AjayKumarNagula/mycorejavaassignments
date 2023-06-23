import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {

        char choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter name: ");
            String name = scanner.next();

            System.out.print("Enter gender: ");
            String gender = scanner.next();

            int rank = getRank(name, gender);
            System.out.println("Rank: " + rank);


            System.out.println("Do you want to continue?(Y/N) ");
            choice = scanner.next().charAt(0);
        }
        while (choice == 'Y' || choice == 'y');
        System.out.println("Program terminated");
    }

    public static int getRank(String name, String gender) {
        String csvFile = "C:\\Users\\ajayn\\Downloads\\us_babynames_small (1) (2)\\testing\\yob2012short.csv";
        String line;
        String csvSplitBy = ",";
        int rank = -1;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int currentRank = 1;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);

                if (values.length == 3) {
                    String currentName = values[0];
                    String currentGender = values[1];

                    if (currentGender.equalsIgnoreCase(gender)) {
                        if (currentName.equalsIgnoreCase(name)) {
                            rank = currentRank;
                            break;
                        }
                        currentRank++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return rank;
    }
}


