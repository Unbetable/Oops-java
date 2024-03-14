// Define the abstract class Telephone
abstract class Telephone {
    // Declare the abstract methods
    public abstract void ring();
    public abstract void lift();
    public abstract void disconnect();
}

// Define the subclass SmartTelephone
class SmartTelephone extends Telephone {
    // Implement the abstract methods
    public void ring() {
        System.out.println("SmartPhone is ringing");
    }

    public void lift() {
        System.out.println("SmartPhone is lifted");
    }

    public void disconnect() {
        System.out.println("SmartPhone is disconnected");
    }

    // Add a new method specific to SmartTelephone
    public void internet() {
        System.out.println("SmartPhone has internet access");
    }
}

public class M4Q6 {
    public static void main(String[] args) {
        // Create an array of Telephone references
        Telephone[] phones = new Telephone[2];

        // Populate the array with objects of SmartTelephone class
        phones[0] = new SmartTelephone();
        phones[1] = new SmartTelephone();

        // Call the methods using the Telephone references
        phones[0].ring();
        phones[0].lift();
        phones[0].disconnect();

        // Call the new method specific to SmartTelephone
        SmartTelephone smartPhone = (SmartTelephone) phones[0];
        smartPhone.internet();
    }
}