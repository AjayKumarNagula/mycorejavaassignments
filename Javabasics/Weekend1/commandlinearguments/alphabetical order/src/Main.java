class AlphabeticalOrder {
    public static void main(String[] args) {
        char firstchar = 'c';
        char secondChar = 'b';

        if (firstchar > secondChar) {
            char temp = firstchar;
            firstchar = secondChar;
            secondChar = temp;
        }

        System.out.println(firstchar + "," + secondChar);
    }
}
