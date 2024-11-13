class invalidAgeException extends Exception {
  private static final long serialVersionUID = 1L;

  public invalidAgeException(String message) {
    super(message);
  }
}

class VerifyAge {
  public static void verify(int age) throws invalidAgeException {
    if (age > 18) {
      System.out.println("Valid age: " + age);
    } else {
      throw new invalidAgeException("Age must be 18 or older");
    }
  }
}


public class AgeVerification {
  public static void main(String[] args) {
    try {
      VerifyAge.verify(25);

      VerifyAge.verify(15);
    } catch (invalidAgeException e) {
      System.out.println("Exception error: " + e.getMessage());
    }
  }
}
