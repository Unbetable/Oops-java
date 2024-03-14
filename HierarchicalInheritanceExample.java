
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

// Cat class inherits from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();
    }
}