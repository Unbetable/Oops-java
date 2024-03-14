// Animal class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog class inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
