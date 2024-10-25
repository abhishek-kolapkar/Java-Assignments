package Task1;

public class Car extends Vehicle {
  int numberOfDoors;

  // parameterized constructor
  public Car(String make, String model, int year, int numberOfDoors) {
    super(make, model, year);   // Call the constructor of the Vehicle class
    this.numberOfDoors = numberOfDoors;
  }

  // override displayInfo()
  @Override
  public void displayInfo() {
    super.displayInfo();  // Call the displayInfo method from Vehicle
    System.out.println("Doors: " + numberOfDoors);
  }
}
