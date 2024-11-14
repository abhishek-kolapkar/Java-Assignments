import java.util.ArrayList;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();

    cities.add("Mumbai");
    cities.add("Pune");
    cities.add("Nagpur");
    cities.add("Aurangabad");
    cities.add("Ahmednagar");

    for (String city : cities) {
      System.out.println(city);
    }
  }
}
