package Task3;

public class ExceptionHandlingExample {
  // Method to divide two integers
  public static int divide(int numerator, int denominator) throws ArithmeticException {
    if (denominator == 0) {
      throw new ArithmeticException("Cannot divide by zero.");
    }
    return numerator / denominator;
  }

  public static void main(String[] args) {
    // Demonstration of Exception Handling
    try {
      int result = divide(10, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // Trying a valid division
    try {
      int result = divide(10, 2);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
