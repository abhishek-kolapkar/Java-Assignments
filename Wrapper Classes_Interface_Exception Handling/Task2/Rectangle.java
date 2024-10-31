package Task2;

public class Rectangle implements Shape {
  private double length;
  private double width;

  // Constructor
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  // Implementing calculateArea method
  @Override
  public double calculateArea() {
    return length * width;
  }

  // Implementing calculatePerimeter method
  @Override
  public double calculatePerimeter() {
    return 2 * (length + width);
  }

  public static void main(String[] args) {
    // Demonstration of Interface and Rectangle
    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
  }
}
