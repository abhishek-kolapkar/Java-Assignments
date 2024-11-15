import java.util.ArrayList;
import java.util.HashMap;

public class ContactDirectory {
  public static void main(String[] args) {
    HashMap<String, ArrayList<String>> contactDirectory = new HashMap<>();

    addContact(contactDirectory, "Alice", "12345");
    addContact(contactDirectory, "Alice", "67890");
    addContact(contactDirectory, "Bob", "54321");
    addContact(contactDirectory, "Charlie", "98765");

    System.out.println(contactDirectory);
  }

  public static void addContact(HashMap<String, ArrayList<String>> directory, String name, String number) {
    if (!directory.containsKey(name)) {

      directory.put(name, new ArrayList<>());
    }

    directory.get(name).add(number);
  }
}
