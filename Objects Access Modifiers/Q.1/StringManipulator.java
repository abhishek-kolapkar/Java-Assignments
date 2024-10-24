public class StringManipulator {
  // concatenate string
  public String concatenate(String str1, String str2) {
    return str1 + " " + str2;
  }

  // length of string
  public int getLength(String str) {
    return str.length();
  }

  // convert to upper case
  public String convertToUpper(String str) {
    return str.toUpperCase();
  }

  public static void main(String[] args) {
    StringManipulator str = new StringManipulator();

    String fullName = str.concatenate("Sai", "Kumar");
    int nameLen = str.getLength(fullName);
    String nameUpperCase = str.convertToUpper(fullName);

    System.out.println(fullName);
    System.out.println(nameLen);
    System.out.println(nameUpperCase);
  }
}