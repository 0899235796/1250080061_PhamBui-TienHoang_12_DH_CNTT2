package lab4;
class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}
public class bai1 {
        public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());
        System.out.println("Area of Circle: " + circle.getArea());
        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println(cylinder.toString());
        System.out.println("Volume of Cylinder: " + cylinder.getVolume());
    }   
}
