package Task1;

class Animal {
  String species;
  int age;

  // default constructor
  public Animal() {
    this.species = "Bulldog";
    this.age = 6;
  }

  // method to print animal details
  public void displayInfo() {
    System.out.println("Species: " + species + "\nAge: " + age);
  }
}

class Dog extends Animal {
  public static void main(String[] args) {
    // instance of Dog class
    Dog dog = new Dog();

    // access displayInfo from Animal class
    dog.displayInfo();
  }
}
