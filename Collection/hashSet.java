import java.util.HashSet;

public class hashSet {
  public static void main(String[] args) {
    HashSet<Integer> numbers = new HashSet<>();

    numbers.add(20);
    numbers.add(30);
    numbers.add(50);
    numbers.add(20);
    numbers.add(15);
    numbers.add(95);
    numbers.add(50);

    for (Integer number : numbers) {
      System.out.println(number);
    }
  }
}
