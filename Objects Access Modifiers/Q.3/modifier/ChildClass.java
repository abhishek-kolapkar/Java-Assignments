package modifier;

public class ChildClass extends ParentClass {
  // override publicMethod() from ParentClass
  @Override
  public void publicMethod() {
    System.out.println("Public Method in Child");
  }

  // override protectedMethod() from ParentClass
  @Override
  protected void protectedMethod() {
    System.out.println("Protected Method in Child");
  }
}
