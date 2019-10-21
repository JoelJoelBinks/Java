//Joel Ostertag
//CSC 260-003
//Justin Fry
//4/16/2019
//Defines a 2D circle that contains: Two double data fields, a data field radius with a get method, no-arg constructor
// that creates a default circle, a getArea() method, a getPerimeter() method, a contains(double x, double y method),
// a contains(Circle2D circle) method, and a overlaps(Circle2D circle) method
public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area is " + c1.getArea());
        System.out.println("Perimeter is " + c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}

class Circle2D {
    private double x;
    private double y;
    private double radius;

    //Create a default Circle2D with(0,0) for (x,y) and 1 for radius
    Circle2D() {
        this(0, 0, 1);
    }

    //Create a Circle2D with specified x,y, and radius
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    //Return x
    public double getX() {
        return x;
    }

    //Return y
    public double getY() {
        return y;
    }

    //Return radius
    public double getRadius() {
        return radius;
    }
    //Return the area of the circle
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    //Return the perimeter of the circle
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //Return true if the specified point(x, y) is inside this circle
    public boolean contains(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) +
                Math.pow(y - this.y, 2))
                < radius;
    }

    //Return true if the specified circle is inside this circle
    public boolean contains(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
    }

    //Return true if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2))
                <= radius + circle.getRadius();
    }
}
