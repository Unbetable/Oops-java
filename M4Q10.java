// Interface 1
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Class implementing both interfaces
class Printer implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

// Main class
public class M4Q10 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
        printer.show();
    }
}