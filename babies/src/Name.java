import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        char choice;
        Scanner scanner=new Scanner(System.in);
    do {


     System.out.print("Enter rank: ");
     int rank = scanner.nextInt();

     System.out.print("Enter gender: ");
     String gender = scanner.next();

     String name = getName(rank, gender);
     System.out.println("Name: " + name);


     System.out.print("Do you want to continue? (Y/N): ");
     choice = scanner.next().charAt(0);
       }
     while (choice == 'Y');

        System.out.println("Program terminated");

       }

        public static String getName(int rank, String gender) {
        String csvFile = "C:\\Users\\ajayn\\Downloads\\us_babynames_small (1) (2)\\testing\\yob2012short.csv";
        String line;
        String csvSplitBy = ",";
        String name = "NO NAME";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int currentRank = 1;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);

                if (values.length == 3) {
                    String currentName = values[0];
                    String currentGender = values[1];

                    if (currentGender.equalsIgnoreCase(gender)) {
                        if (currentRank == rank) {
                            name = currentName;
                            break;
                        }
                        currentRank++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return name;
    }
}
