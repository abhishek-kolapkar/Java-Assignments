public class Person {
  String firstName;
  String lastName;

  // getFullName method
  public String getFullName() {
    return firstName + " " + lastName;
  }

  // reverseName method
  public String reverseName() {
    String fullName = getFullName();
    int n = fullName.length();
    String reverseName = "";

    for (int i = n - 1; i >= 0; i--) {
      reverseName += fullName.charAt(i);
    }

    return reverseName;
  }

  // compareNames method
  public boolean compareNames(String person, String anotherPerson) {
    if (person.equals(anotherPerson)) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();

    // printing full name
    person1.firstName = "Sai";
    person1.lastName = "Kumar";
    String person = person1.getFullName();

    person2.firstName = "John";
    person2.lastName = "Doe";
    String anotherPerson = person2.getFullName();

    System.out.println(person + "\n" + anotherPerson);

    // printing reverse full name
    System.out.println(person1.reverseName());
    System.out.println(person2.reverseName());

    // comparing names
    boolean result = person1.compareNames(person, anotherPerson);

    if (result) {
      System.out.println("Same");
    } else {
      System.out.println("Not Same");
    }
  }
}
