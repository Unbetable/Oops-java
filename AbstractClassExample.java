
// Abstract class representing an Animal
abstract class Animal
 {
    abstract public void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Dog class inherits from Animal and implements makeSound method
class Dog extends Animal 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Dog says Woof!");
    }
}

public class AbstractClassExample 
{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        
    }
}