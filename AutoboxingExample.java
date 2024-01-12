public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveInt = 101;
        Integer wrappedInt = primitiveInt;

        char primitiveChar = 'e';
        Character wrappedChar = primitiveChar;

        double primitiveDouble = 5.314;
        Double wrappedDouble = primitiveDouble;

        System.out.println("Autoboxing Example:");
        System.out.println("Integer: " + wrappedInt);
        System.out.println("Character: " + wrappedChar);
        System.out.println("Double: " + wrappedDouble);
    }
}
