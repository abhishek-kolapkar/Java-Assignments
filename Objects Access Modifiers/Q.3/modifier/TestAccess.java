package modifier;

public class TestAccess {
  public static void main(String[] args) {
    System.out.println("Accessing ParentClass from same package : ");
    ParentClass parent = new ParentClass();
    // --> accessible methods
    parent.publicMethod();
    parent.protectedMethod();
    parent.defaultMethod();

    // --> not-accessible methods
    // parent.privateMethod()

    System.out.println();

    System.out.println("Accessing ChildClass from same package : ");
    ChildClass child = new ChildClass();
    // --> accessible methods
    child.publicMethod();
    child.protectedMethod();
    child.defaultMethod();

    // --> not-accessible methods
    // child.privateMethod()
  }
}
