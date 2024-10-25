package Task3;

class Animal {
  private String species;
  private int age;

  // setter for species
  public void setSpecies(String species) {
    this.species = species;
  }

  // getter for species
  public String getSpecies() {
    return species;
  }

  // setter for age
  public void setAge(int age) {
    this.age = age;
  }

  // getter for age
  public int getAge() {
    return age;
  }

  public void displayInfo() {
    System.out.println("Species: " + getSpecies() + "\nAge: " + getAge());
  }

  public static void main(String[] args) {
    // create instance of Animal class
    Animal animal = new Animal();

    // call setter methods
    animal.setSpecies("Bulldog");
    animal.setAge(10);

    // call displayInfo()
    animal.displayInfo();
  }
}