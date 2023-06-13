// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class CommandLineArguments {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No values provided");
        }
        else {
            StringBuilder values = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                values.append(args[i]);
                if (i != args.length - 1) {
                    values.append(",");
                }
            }
            System.out.println(values.toString());
        }
    }
}

