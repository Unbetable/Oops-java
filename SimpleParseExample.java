public class SimpleParseExample {
    public static void main(String[] args) {
        int x = Integer.parseInt("12");
        double c = Double.parseDouble("12");
        int b = Integer.parseInt("100", 2);

        System.out.println("Parsing results:");
        System.out.println("Integer: " + x);
        System.out.println("Double: " + c);
        System.out.println("Binary Integer: " + b);
        System.out.println("Octal Integer: " + Integer.parseInt("101", 8));
    }
}
