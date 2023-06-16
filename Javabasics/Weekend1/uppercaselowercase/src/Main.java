class CaseConverter {
    public static void main(String[] args) {

        char originalChar = 'a';
        char convertedChar;

        if (Character.isUpperCase(originalChar)) {
            convertedChar = Character.toLowerCase(originalChar);
        } else if (Character.isLowerCase(originalChar)) {
            convertedChar = Character.toUpperCase(originalChar);
        }else {
            System.out.println("Invalid character. Please provide an alphabet.");
            return;
        }
        System.out.println("Original character: " + originalChar);
        System.out.println("Converted character: " + convertedChar);
    }
}
