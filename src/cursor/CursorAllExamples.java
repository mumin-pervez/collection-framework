package cursor;

import java.util.Enumeration;
import java.util.Vector;

public class CursorAllExamples {

  public static void main(String[] args) {
    Vector vector = new Vector();
    vector.add("CSE");
    vector.add("BBA");
    vector.add("CSE");
    vector.add("ECE");

    Enumeration enumeration = vector.elements();
    System.out.println("Internal implementation class: "+enumeration.getClass().getName());
    while (enumeration.hasMoreElements()) {
      String element = (String) enumeration.nextElement();
      System.out.println(element);
    }



  }

}
