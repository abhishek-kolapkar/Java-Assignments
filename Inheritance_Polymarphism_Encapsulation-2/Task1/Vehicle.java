package Task1;

public class Vehicle {
  // Instance Variable
  String make;
  String model;
  int year;

  // paremetrized constructor
  public Vehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // method to print vehicle's info
  public void displayInfo() {
    System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
  }
}
