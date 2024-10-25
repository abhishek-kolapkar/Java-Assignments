package Task3;

public class Car extends Vehicle {
  private int numberOfDoors;

  // setter for numberOfDoors
  public void setDoors(int doors) {
    this.numberOfDoors = doors;
  }

  // getter for numberOfDoors
  public int getDoors() {
    return numberOfDoors;
  }

  // override displayInfo() from Vehicle
  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Doors: " + numberOfDoors);
  }
}
