public class DivisionByZero {
  public static int divide(int a, int b) {
    try {
      return a / b;
    } catch (Exception e) {
      System.out.println("Cannot divide by zero");
      return 0;
    }
  }

  public static void main(String[] args) {
    int result1 = divide(12, 2);
    System.out.println("Result of 12/2: " + result1);

    int result2 = divide(12, 0);
    System.out.println("Result of 12/0: " + result2);
  }
}

