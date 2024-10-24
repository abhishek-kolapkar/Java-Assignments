import modifier.ChildClass;
import modifier.ParentClass;

public class OtherTestClass {
  public static void main(String[] args) {
    System.out.println("Accessing ParentClass from outside package : ");
    ParentClass parent = new ParentClass();
    // --> accessible methods
    parent.publicMethod();

    // --> not-accessible methods
    // parent.protectedMethod()
    // parent.privateMethod();
    // parent.defaultMethod();

    System.out.println();

    System.out.println("Accessing ChildClass from outside package : ");
    ChildClass child = new ChildClass();
    // --> accessible methods
    child.publicMethod();

    // --> not-accessible methods
    // child.protectedMethod();
    // child.privateMethod()
    // child.defaultMethod();
  }
}
