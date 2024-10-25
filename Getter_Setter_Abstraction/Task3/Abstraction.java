package Task3;

abstract class Shape {
  abstract int calculateArea();
}

class Rectangle extends Shape {
  int calculateArea() {
    int length = 10;
    int width = 5;

    return length * width;
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    
    int areaOfRectangle = rect.calculateArea();
    System.out.println("Area of Rectangle: " + areaOfRectangle);
  }
}
