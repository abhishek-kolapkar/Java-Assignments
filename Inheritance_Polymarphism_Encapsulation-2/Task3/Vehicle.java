package Task3;

public class Vehicle {
  // Instance variable
  private String make;
  private String model;
  private int year;

  // setter for make
  public void setMake(String make) {
    this.make = make;
  }

  // getter for make
  public String getMake() {
    return make;
  }

  // setter for model
  public void setModel(String model) {
    this.model = model;
  }

  // getter for model
  public String getModel() {
    return model;
  }

  // setter for year
  public void setYear(int year) {
    this.year = year;
  }

  // getter for year
  public int getYear() {
    return year;
  }

  // Method to display vehicle information
  public void displayInfo() {
    System.out.println("Make: " + getMake());
    System.out.println("Model: " + getModel());
    System.out.println("Year: " + getYear());
  }
}
