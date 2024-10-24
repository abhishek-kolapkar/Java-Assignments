public class Person {
  String name;
  int age;
  char gender;

  // default constructor
  public Person() {
    this.name = "Sai";
    this.age = 20;
    this.gender = 'M';
  }

  // method to display person details
  public void displayInfo() {
    System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender);
  }

  public static void main(String[] args) {
    // create person object
    Person person = new Person();

    person.displayInfo();
  }
}
