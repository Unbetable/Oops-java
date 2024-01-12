public class UnboxingExample {
    public static void main(String[] args) {
      
        Integer wrappedInt = 102;
        int primitiveInt = wrappedInt;

        Double wrappedDouble = 5.314;
        double primitiveDouble = wrappedDouble;

        System.out.println("Unboxing Example:");
        System.out.println("Unboxed Integer: " + primitiveInt);
        System.out.println("Unboxed Double: " + primitiveDouble);
    }
}
