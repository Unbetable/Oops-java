public class Vl {
    static void printNumbers(int... numbers) {
        System.out.println("Printing numbers:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3);
        printNumbers(4, 5, 6, 7);
        printNumbers(8, 9);
        printNumbers();
    }
}
