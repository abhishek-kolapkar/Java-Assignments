public class Shape {
  // area(). This takes one int parameter
  public int area(int side) {
    return side * side;
  }

  // Overloaded area(). This takes two int parameters
  public int area(int length, int breadth) {
    return length * breadth;
  }

  // Overloaded area(). This takes one double parameter
  public double area(double radius) {
    return Math.PI * (radius * radius);
  }

  public static void main(String[] args) {
    Shape shape = new Shape();

    // area of square
    int areaOfSquare = shape.area(5);
    System.out.println("Area of Square: " + areaOfSquare);

    // area of rectangle
    int areaOfRect = shape.area(4, 8);
    System.out.println("Area of Rectangle: " + areaOfRect);

    // area of circle
    double areaOfCircle = shape.area(5.40);
    System.out.println("Area of Circle: " + areaOfCircle);
  }
}
