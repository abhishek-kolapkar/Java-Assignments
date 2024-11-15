import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(89);
    numbers.add(12);
    numbers.add(22);
    numbers.add(34);
    numbers.add(45);

    Collections.sort(numbers);

    System.out.println("Sorted list: " + numbers);
  }
}