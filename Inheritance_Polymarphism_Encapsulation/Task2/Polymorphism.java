package Task2;

class Animal {
  // create makeSound()
  public void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  // override makeSound() from Animal class
  @Override
  public void makeSound() {
    System.out.println("Dog barks");
  }

  public static void main(String[] args) {
    // create instance of Dog class
    Dog dog = new Dog();

    // call the makeSound()
    dog.makeSound();
  }
}
