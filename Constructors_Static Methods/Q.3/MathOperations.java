public class MathOperations {
  static int add(int a, int b) {
    return a + b;
  }

  static int subtract(int a, int b) {
    return a - b;
  }

  static int multiply(int a, int b) {
    return a * b;
  }

  public static void main(String[] args) {
    int addResult = add(10, 40);
    int subResult = subtract(45, 20);
    int prodResult = multiply(15, 25);

    System.out.println("addition: " + addResult);
    System.out.println("subtraction: " + subResult);
    System.out.println("multiplication: " + prodResult);
  }
}
