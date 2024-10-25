package Task2;

class Vehicle {
  // startEngine method
  public void startEngine() {
    System.out.println("The vehicle's engine is starting.");
  }
}

class Car extends Vehicle {
  // override startEngine() from Vehicle
  @Override
  public void startEngine() {
    System.out.println("The car's engine is starting.");
  }
}

public class Polymorphism {
  public static void main(String[] args) {
    // Create an instance of the Vehicle class
    Vehicle myVehicle = new Vehicle();

    // Create an instance of the Car class
    Car myCar = new Car();

    // Call the startEngine method on both instances
    myVehicle.startEngine();
    myCar.startEngine();
  }
}
