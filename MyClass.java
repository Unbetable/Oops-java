interface A {
    void showA();
}

interface B {
    void showB();
}

class MyClass implements A, B {
    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showA(); // Output: A
        obj.showB(); // Output: B
    }
}
