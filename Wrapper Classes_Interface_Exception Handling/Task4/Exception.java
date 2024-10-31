package Task4;

import java.io.IOException;

public class Exception {
  // Method to simulate reading a file
  public static void readFile(String fileName) throws IOException {
    if ("error.txt".equals(fileName)) {
      throw new IOException("File not found: " + fileName);
    }
    System.out.println("Reading file: " + fileName);
  }

  public static void main(String[] args) {
    // Demonstration of Checked Exception
    try {
      readFile("error.txt");
    } catch (IOException e) {
      System.out.println("IOException caught: " + e.getMessage());
    }

    // Demonstration of Unchecked Exception
    int[] numbers = { 1, 2, 3, 6 };
    try {
      System.out.println("Accessing invalid index: " + numbers[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Unchecked Exception caught: " + e.getMessage());
    }
  }
}
