import java.util.Scanner;
class Color{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color code: ");
        String colorCode = scanner.next();

        String colorName = getColorName(colorCode);
        System.out.println(colorName);
    }

    public static String getColorName(String colorCode) {
        String colorName;
        switch (colorCode) {
            case "R":
                colorName = "Red";
                break;
            case "B":
                colorName = "Blue";
                break;
            case "G":
                colorName = "Green";
                break;
            case "O":
                colorName = "Orange";
                break;
            case "Y":
                colorName = "Yellow";
                break;
            case "W":
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
        }
        return colorName;
    }
}
