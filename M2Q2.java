public class M2Q2 {
    public static void main(String[] args) {
        
        char char1 = 'A';
        char char2 = 'B';
        int sumChars = char1 + char2;
        System.out.println("Sum of characters: " + sumChars);

        char char3 = 'D';
        char char4 = 'A';
        int diffChars = char3 - char4;
        System.out.println("Difference of characters: " + diffChars);

        char char5 = '3';
        char char6 = '4';
        int productChars = char5 * char6;
        System.out.println("Product of characters: " + productChars);

        System.out.println("Resulting characters:");
        System.out.println((char) sumChars);
        System.out.println((char) diffChars);
        System.out.println((char) productChars);
    }
}
