public class M4Q1 {
    private double x;
    private double y;
    
    // Constructor
    public M4Q1(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Getter for x
    public double getX() {
        return x;
    }
    
    // Getter for y
    public double getY() {
        return y;
    }
    
    // Method to calculate distance between two points
    public double distance(M4Q1 p2) {
        double dx = p2.getX() - this.x;
        double dy = p2.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public static void main(String[] args) {
        M4Q1 p1 = new M4Q1(1.0, 2.0);
        M4Q1 p2 = new M4Q1(4.0, 6.0);
        
        // Calculate distance between p1 and p2
        double distance = p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + distance);
    }
}
