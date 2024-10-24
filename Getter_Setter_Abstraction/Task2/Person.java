package Task2;

public class Person {
  private String name;
  private int age;
  private char gender;

  // --> setter for name
  public void setName(String name) {
    this.name = name;
  }
  
  // --> getter for name
  public String getName() {
    return name;
  }

  // --> setter for age
  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    }
  }

  // --> getter for age
  public int getAge() {
    return age;
  }

  // --> setter for gender
  public void setGender(char gender) {
    this.gender = gender;
  }

  // --> getter for gender
  public char getGender() {
    return gender;
  }

  // method to display person details
  public void displayInfo() {
    System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender());
  }

  public static void main(String[] args) {
    // // Creating a new Person object
    Person person = new Person();

    // --> Modify the person's details using setter methods
    person.setName("John");
    person.setAge(20);
    person.setGender('M');

    // --> Display updated information
    person.displayInfo();
  }
}
