class Parent {
    public void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("This is child class");
    }
}

public class M4Q5 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        // Call method of parent class by object of parent class
        parent.printParent();

        // Call method of child class by object of child class
        child.printChild();

        // Call method of parent class by object of child class
        Child child2 = new Child();
        child2.printParent();
    }
}