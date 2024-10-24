public class TestClass {
  public static void main(String[] args) {
    AccessModifierExample modifier = new AccessModifierExample();

  // --> accessible methods
  modifier.publicMethod();
  modifier.protectedMethod();
  modifier.defaultMethod();

  // --> not accessible methods
  // modifier.privateMethod();
  }
}
