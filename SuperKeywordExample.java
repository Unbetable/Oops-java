// Animal class
class Animal {
    String color;

    Animal(String color) {
        this.color = color;
    }
}

// Dog class inherits from Animal
class Dog extends Animal {
    String breed;

    Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Brown", "Labrador");
        System.out.println("Color: " + myDog.color);
        System.out.println("Breed: " + myDog.breed);
    }
}
