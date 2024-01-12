public class Static {
    static int staticVariable = 10;
    int nonStaticVariable = 20;

    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable: " + staticVariable);
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Non-static variable: " + nonStaticVariable);
    }

    public static void main(String[] args) {
        staticMethod();

        Static obj = new Static();
        obj.nonStaticMethod();

        System.out.println("Accessing static variable outside methods: " + staticVariable);
    }
}
