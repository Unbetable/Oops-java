// Animal class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class inherits from Animal and overrides makeSound method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
    }
}
