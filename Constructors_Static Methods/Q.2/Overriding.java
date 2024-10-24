class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal {
  // override the makeSound method from Animal
  @Override
  public void makeSound() {
    System.out.println("The dog barks");
  }
}

public class Overriding {
  public static void main(String[] args) {
    Dog dog = new Dog();

    dog.makeSound();
  }
}
