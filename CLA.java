public class CLA {

    public static void main(String[] args) {
        // Display the total number of command-line arguments
        System.out.println("Total number of arguments: " + args.length);

        // Display the values of each command-line argument
        System.out.println("Argument values:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
}
