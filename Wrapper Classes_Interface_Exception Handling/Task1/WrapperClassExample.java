package Task1;

public class WrapperClassExample {
  // Method to convert primitive int to Integer wrapper
  public static Integer convertPrimitiveToWrapper(int number) {
    return Integer.valueOf(number);
  }

  // Method to convert Integer wrapper to primitive int
  public static int convertWrapperToPrimitive(Integer number) {
    return number.intValue();
  }

  public static void main(String[] args) {
    // Demonstration of Wrapper Classes
    int primitiveInt = 42;
    Integer wrapperInt = convertPrimitiveToWrapper(primitiveInt);
    int backToPrimitive = convertWrapperToPrimitive(wrapperInt);

    System.out.println("Primitive int: " + primitiveInt);
    System.out.println("Wrapper Integer: " + wrapperInt);
    System.out.println("Back to primitive int: " + backToPrimitive);
  }
}