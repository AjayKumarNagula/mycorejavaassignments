import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.HashSet;
import java.io.IOException;

public class Unique {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\ajayn\\Downloads\\us_babynames_small (1) (2)\\testing\\yob2012short.csv";
        String line;
        String csvSplitBy = ",";
        Set<String> uniqueGirlsNames = new HashSet<>();
        Set<String> uniqueBoysNames = new HashSet<>();


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);


                if (values.length == 3) {
                    String name = values[0];
                    String gender = values[1];

                    if (gender.equals("F")) {
                        uniqueGirlsNames.add(name);
                    } else if (gender.equals("M")) {
                        uniqueBoysNames.add(name);
                    }


                }
            }
            int totalNames = uniqueGirlsNames.size() + uniqueBoysNames.size();
            System.out.println("No. of unique girls names: " + uniqueGirlsNames.size());
            System.out.println("No. of unique boys names: " + uniqueBoysNames.size());
            System.out.println("Total names: " + totalNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



