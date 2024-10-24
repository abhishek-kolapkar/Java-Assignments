public class Person {
  private String name;
  private int age;

  // default constructor
  public Person() {
    this.name = "Unknown";
    this.age = 0;
  }

  // parameterized constructor
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // method to get values of name & age
  public void getDetails() {
    System.out.println("Name: " + name + " age: " + age);
  }

  public static void main(String[] args) {
    Person defaultInfo = new Person();
    Person paramInfo = new Person("Abhishek", 23);

    defaultInfo.getDetails();
    paramInfo.getDetails();
  }
}