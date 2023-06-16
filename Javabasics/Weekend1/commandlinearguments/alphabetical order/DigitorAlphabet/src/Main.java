public class Main {

    public static void main(String[] args) {
        char character='@';

        if (Character.isLetter(character)){
        System.out.println("Alphabet");
        }
        else if (Character.isDigit(character)){
        System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}

