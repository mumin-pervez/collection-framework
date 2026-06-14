package differences;

public class EqualOperatorVsEqualMethod {

  public static void main(String[] args) {
    // Primitive Types (use ==)
    int a = 5;
    int b = 5;
    System.out.println("Primitive equal operator == : ");
    System.out.println(a == b); // true (compares values)
    // .equals() cannot be used with primitives

    //String Comparison
    String s1 = "Mumin";
    String s2 = "Mumin";
    System.out.println("String equal operator == : ");
    System.out.println(s1 == s2); // true (string literal pooling - same object)
    System.out.println(".equals() method: " + s1.equals(s2)); // .equals() compares content

    String s3 = new String("cTech");
    String s4 = new String("cTech");
    System.out.println(s3 == s4); // false (different objects)
    System.out.println(s3.equals(s4)); // .equals() compares content

  }

}
