package Task3;

public class Encapsulation {
  public static void main(String[] args) {
    Car myCar = new Car();

    // Modifying vehicle details using setters
    myCar.setMake("Tata");
    myCar.setModel("Harrier");
    myCar.setYear(2024);
    myCar.setDoors(5);

    // Display updated car details
    myCar.displayInfo();
  }
}
