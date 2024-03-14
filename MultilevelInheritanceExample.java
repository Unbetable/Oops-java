
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

// Labrador class inherits from Dog
class Labrador extends Dog {
    void swim() {
        System.out.println("Labrador is swimming");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Labrador myLab = new Labrador();
        myLab.eat();
        myLab.bark();
        myLab.swim();
    }
}