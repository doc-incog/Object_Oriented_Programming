public class Box {
    double width, height, depth;

    // Q9a: Constructor for Cube (takes length only) [cite: 26]
    public Box(double length) {
        width = height = depth = length;
    }

    // Q9b: Constructor for Cuboid [cite: 27]
    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Q9c: No-argument constructor with default values [cite: 28]
    public Box() {
        this.width = 10;
        this.depth = 8;
        this.height = 12;
    }

    // Q9: Method to calculate volume [cite: 25]
    public void getVolume() {
        double volume = width * height * depth;
        System.out.println("Volume: " + volume);
    }
}