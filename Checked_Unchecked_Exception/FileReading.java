import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
  public static void fileRead(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;

      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("File not found");
    }
  }

  public static void main(String[] args) {
    fileRead("example.txt");

    fileRead("DivisionByZero.java");
  }
}